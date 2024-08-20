package BookMyRide;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;
import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/BookMyRide/NewLogin")
public class NewLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // JDBC connection parameters
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/BookRide";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "8076107814@Yash";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (login.isEmpty() || password.isEmpty()) {
            RequestDispatcher req = request.getRequestDispatcher("NewLogin.jsp");
            req.include(request, response);
        } else {
            // Insert user credentials into the database
            if (insertUser(login, password)) {
                // If insertion is successful, set cookie, forward to Home.jsp
                setLoginCookie(response, login);
                RequestDispatcher req = request.getRequestDispatcher("Home.jsp");
                req.forward(request, response);
            } else {
                // If insertion fails, forward back to newLogin.jsp
                RequestDispatcher req = request.getRequestDispatcher("NewLogin.jsp");
                req.include(request, response);
            }
        }
    }

    private boolean insertUser(String username, String password) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "INSERT INTO users (username, password) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                return preparedStatement.executeUpdate() > 0; // Returns true if insertion is successful
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void setLoginCookie(HttpServletResponse response, String username) {
        try {
            Cookie usernameCookie = new Cookie("username", URLEncoder.encode(username, "UTF-8"));
            usernameCookie.setMaxAge(3600); // Set the cookie's max age (in seconds)
            response.addCookie(usernameCookie);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
