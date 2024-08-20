<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ride Status</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            margin: 0;
            padding: 0;
            color: #555;
            background-image: url('WhatsApp Image 2023-11-23 at 11.23.03_6e0840de.jpg');
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

        .status-buttons {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .status-button, .tip-button {
            margin: 10px;
            padding: 15px;
            font-size: 18px;
            color: #fff;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .status-button {
            background-color: #333;
        }

        .status-button:hover {
            background-color: #555;
        }

        .tip-button {
            background-color: #ff6f61;
        }

        .tip-button:hover {
            background-color: #ff8c7f;
        }

        .tip-buttons {
            display: flex;
            justify-content: space-between; /* Make the buttons horizontal */
            width: 100%; /* Ensure the buttons take up the full width */
        }
    </style>
</head>
<body>
    <h2>Ride Status</h2>
   
    <div class="status-buttons">
        <a href="Status.jsp" class="status-button">Ride Status</a>
        <a href="Cancel.jsp" class="status-button">Cancel Ride</a>
        <a href="chat.jsp" class="status-button">Chat with Rider</a>

        <button id="addTipButton" class="tip-button">Add a Tip</button>
        
        <form action="/BookMyRide/TipServlet" method="post" class="tip-buttons">
            <button class="tip-button" type="submit" name="tipAmount" value="20">Give 20 Rupees</button>
            <button class="tip-button" type="submit" name="tipAmount" value="40">Give 40 Rupees</button>
            <button class="tip-button" type="submit" name="tipAmount" value="60">Give 60 Rupees</button>
            <button class="tip-button" type="submit" name="tipAmount" value="80">Give 80 Rupees</button>
        </form>
    </div>
</body>
</html>
