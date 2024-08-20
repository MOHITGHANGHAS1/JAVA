<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<%
    Map<String, String> userCookies = new HashMap<>();
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            userCookies.put(cookie.getName(), URLDecoder.decode(cookie.getValue(), "UTF-8"));
        }
    }

    String username = userCookies.get("username");
    if (username != null) {
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>Welcome to Book My Ride</title>");
        out.println("<style>");
        // Add your styles here if needed
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Hello " + username + "</h2>");
        // Add other content or messages here
        out.println("</body>");
        out.println("</html>");
    } else {
        // If the user is not authenticated, you can redirect them to the login page or take appropriate action
        response.sendRedirect("Login.jsp");
    }
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book My Ride</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            color: #555;
            background-image: url('WhatsApp Image 2023-11-23 at 18.59.04_20d57f76.jpg'); /* Replace 'your_background_image.jpg' with the actual image file path */
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        h2 {
            font-size: 36px;
            margin-bottom: 20px;
            color: #fff;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
        }

        .feature-links {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
        }

        .feature-link {
            text-decoration: none;
            color: #333;
            background-color: #fff;
            padding: 20px;
            margin: 10px;
            border-radius: 8px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
            transition: transform 0.3s ease-in-out;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .feature-link:hover {
            transform: scale(1.1);
        }

        img {
            margin-bottom: 10px;
        }
    </style>
</head>

<body>
    <h2>SELECT THE OPTION BELOW</h2>

    <div class="feature-links">
        <a href="Booking.jsp" class="feature-link">
            <img src="booking.jpg" alt="" width="140">
            <br>Book a Ride
        </a>
        <a href="rideStatus.jsp" class="feature-link">
            <img src="status.jpg" alt="" width="100">
            <br>Check Ride Status
        </a>
        <a href="AboutUs.jsp" class="feature-link">
            <img src="About us.png" alt="" width="120">
            <br>About us
        </a>
    </div>
</body>

</html>
