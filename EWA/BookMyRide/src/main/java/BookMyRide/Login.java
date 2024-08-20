package BookMyRide;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Login extends HttpServlet {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/BookRide";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "8076107814@Yash";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		if (login.isEmpty() || password.isEmpty() || !validateUser(login, password, response)) {
			RequestDispatcher req = request.getRequestDispatcher("Login.jsp");
			req.include(request, response);
		} else {
			response.sendRedirect("Home.jsp");
		}
	}

	private boolean validateUser(String username, String password, HttpServletResponse response) {
		try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
			String query = "SELECT * FROM users WHERE username = ? AND password = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, username);
				preparedStatement.setString(2, password);
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					if (resultSet.next()) {
						// If username and password match, set cookies and return true
						Cookie usernameCookie = new Cookie("username", URLEncoder.encode(username, "UTF-8"));
						usernameCookie.setMaxAge(3600);
						response.addCookie(usernameCookie);
						return true;
					}
				}
			}
		} catch (SQLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return false;
	}
}
