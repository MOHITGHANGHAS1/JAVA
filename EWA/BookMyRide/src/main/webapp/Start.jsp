<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Book My Ride</title>
  <style>
    html {
      background-color: #10151B;
      background: #10151B;
      -webkit-background-size: cover;
      -moz-background-size: cover;
      -o-background-size: cover;
      background-size: cover;
    }

    body {
      font-family: "Oswald", sans-serif;
      -webkit-font-smoothing: antialiased;
      font-smoothing: antialiased;
      margin: 0;
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100vh;
    }

    h1 {
      line-height: 0.95;
      color: #66fcf1;
      font-weight: 900;
      font-size: 60px;
      text-transform: uppercase;
      -webkit-user-select: none;
      -moz-user-select: none;
      -ms-user-select: none;
      user-select: none;
      pointer-events: none;
      margin-bottom: 20px;
    }

    .logo img {
      width: 300px;
      display: block;
      margin: 0 auto;
    }

    .btn {
  margin: 20px auto;
  display: block; /* Add this line to make the button a block element */
  width: 200px;
  height: 60px;
  border: 2px solid #66fcf1;
  border-radius: 2px;
  background: none;
  font-size: 16px;
  color: #fff;
  letter-spacing: 0.25em;
  text-decoration: none;
  font-weight: 600;
  text-transform: uppercase;
  text-align: center;
  transition: background .4s, color .4s;
  cursor: pointer;
}


    .btn:hover {
      background: #66fcf1;
      color: #10151B;
    }
  </style>
</head>

<body>
  <!-- Inspired by https://bert.house/en/-->
  <div>
    <h1>WELCOME TO BOOK MY RIDE</h1>
    <div class="logo">
      <img src="Logo.jpg" alt="Book My Ride Logo">
    </div>
    <div >
      <a href="Login.jsp">
        <button class="btn">Click Here To Continue</button>
      </a>
    </div>
  </div>
</body>

</html>
