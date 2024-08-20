<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ride Status</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            color: #555;
            background-image: url(download.jpeg);
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

        .status-button {
            margin: 10px;
            padding: 15px;
            font-size: 18px;
            color: #fff;
            background-color: #333;
            border: none;
            border-radius: 8px;
            cursor: pointer;
        }

        .status-button:hover {
            background-color: #555;
        }
        
            .tip-button {
        font-size: 18px;
        padding: 20px;
    }
        
        
    </style>
</head>
<body>
    <h2>Ride Status</h2>
   
<div class="status-buttons">
      <form action="/BookMyRide/" method="post">
        <button class="status-button" type="submit">Check Ride Status</button>
    </form>

    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ride Status</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            color: #555;
            background-image: url(download.jpeg);
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

        .status-button {
            margin: 10px;
            padding: 15px;
            font-size: 18px;
            color: #fff;
            background-color: #333;
            border: none;
            border-radius: 8px;
            cursor: pointer;
        }

        .status-button:hover {
            background-color: #555;
        }
        
            .tip-button {
        font-size: 18px;
        padding: 20px;
    }
        
        
    </style>
</head>
<body>
    <h2>Ride Status</h2>
   
<div class="status-buttons">
      <form action="/BookMyRide/" method="post">
        <button class="status-button" type="submit">Check Ride Status</button>
    </form>

    <a href=""><button class="status-button" type="submit">Cancel Ride</button></a>

      <form action="/BookMyRide/ChatServlet" method="post">
        <button class="status-button" type="submit">Chat with the Rider</button>
    </form>

     <button id="addTipButton" class="status-button">Add a Tip</button>
  <form action="/BookMyRide/TipServlet" method="post">
    <div class="tip-buttons">
        <button class="tip-button" type="submit" name="tipAmount" value="20">Give 20 Rupees</button>
        <button class="tip-button" type="submit" name="tipAmount" value="40">Give 40 Rupees</button>
        <button class="tip-button" type="submit" name="tipAmount" value="60">Give 60 Rupees</button>
        <button class="tip-button" type="submit" name="tipAmount" value="80">Give 80 Rupees</button>
    </div>
</form>

</div>


</body>
</html>

































    

      <form action="/BookMyRide/ChatServlet" method="post">
        <button class="status-button" type="submit">Chat with the Rider</button>
    </form>

     <button id="addTipButton" class="status-button">Add a Tip</button>
  <form action="/BookMyRide/TipServlet" method="post">
    <div class="tip-buttons">
        <button class="tip-button" type="submit" name="tipAmount" value="20">Give 20 Rupees</button>
        <button class="tip-button" type="submit" name="tipAmount" value="40">Give 40 Rupees</button>
        <button class="tip-button" type="submit" name="tipAmount" value="60">Give 60 Rupees</button>
        <button class="tip-button" type="submit" name="tipAmount" value="80">Give 80 Rupees</button>
    </div>
</form>

</div>


</body>
</html>

































