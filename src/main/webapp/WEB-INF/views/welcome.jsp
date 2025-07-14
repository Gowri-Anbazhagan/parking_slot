<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Welcome to Smart Parking</title>
  <style>
    @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap');

    body {
      margin: 0;
      font-family: 'Poppins', sans-serif;
      background: url('/images/parking-bg.jpg') no-repeat center center fixed;
      background-size: cover;
      color: white;
      height: 100vh;
      display: flex;
      align-items: center;
      justify-content: center;
      text-align: center;
      background-image:url('/images/seven.png')
    }

    .welcome-box {
      background: rgba(0, 0, 0, 0.6);
      padding: 60px;
      border-radius: 15px;
      box-shadow: 0 0 25px rgba(0, 0, 0, 0.4);
    }

    h1 {
      font-size: 42px;
      margin-bottom: 20px;
      animation: fadeIn 2s ease-in-out;
    }

    p {
      font-size: 18px;
      margin-bottom: 40px;
      animation: fadeIn 3s ease-in-out;
    }

    .btn {
      padding: 14px 30px;
      margin: 10px;
      font-size: 16px;
      border: none;
      border-radius: 8px;
      cursor: pointer;
      background: #3498db;
      color: white;
      text-decoration: none;
      transition: 0.3s;
    }

    .btn:hover {
      background: #2980b9;
    }

    @keyframes fadeIn {
      from { opacity: 0; transform: translateY(-20px); }
      to { opacity: 1; transform: translateY(0); }
    }
  </style>
</head>
<body>
  <div class="welcome-box">
    <h1>🚗 Welcome to Smart Parking</h1>
    <p>Your hassle-free parking slot manager. Reserve, manage, and relax!</p>
    <a href="login" class="btn">Login</a>
    <a href="signup" class="btn">Sign Up</a>
  </div>
</body>
</html>
