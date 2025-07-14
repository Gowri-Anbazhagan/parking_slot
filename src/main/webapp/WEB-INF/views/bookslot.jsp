<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Slot Booked</title>
  <!-- Google Font -->
  <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;700&display=swap" rel="stylesheet">
  <style>
    body {
      font-family: 'Nunito', sans-serif;
      margin: 0;
      background: linear-gradient(to right, #c9ffbf, #ffafbd); /* Light green to pink */
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      color: #333;
    }

    .box {
      background: #ffffff;
      padding: 50px 40px;
      border-radius: 20px;
      max-width: 500px;
      width: 90%;
      box-shadow: 0 10px 30px rgba(0,0,0,0.1);
      text-align: center;
    }

    h2 {
      font-size: 28px;
      margin-bottom: 30px;
      font-weight: 700;
      color: #2c3e50;
    }

    a {
      display: inline-block;
      padding: 14px 28px;
      background-color: #27ae60;
      color: white;
      text-decoration: none;
      border-radius: 10px;
      font-size: 16px;
      font-weight: 600;
      transition: all 0.3s ease;
    }

    a:hover {
      background-color: #1e8449;
      transform: scale(1.05);
    }

    @media (max-width: 600px) {
      .box {
        padding: 30px 20px;
      }

      h2 {
        font-size: 22px;
      }

      a {
        padding: 12px 24px;
        font-size: 15px;
      }
    }
  </style>
</head>
<body>
<div class="box">
  <h2>🎉 Parking Slot Successfully Booked!</h2>
  <a href="/viewslots">🚗 View All Slots</a>
</div>
</body>
</html>
