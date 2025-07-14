<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Slot Released</title>
  <!-- Google Font -->
  <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@500;700&display=swap" rel="stylesheet">
  <style>
    body {
      margin: 0;
      font-family: 'Quicksand', sans-serif;
      background: linear-gradient(to right, #fceabb, #f8b500); /* Light yellow theme */
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
      text-align: center;
      max-width: 500px;
      width: 90%;
      box-shadow: 0 12px 25px rgba(0, 0, 0, 0.15);
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
      background-color: #3498db;
      color: #ffffff;
      text-decoration: none;
      border-radius: 10px;
      font-size: 16px;
      font-weight: bold;
      transition: all 0.3s ease;
    }

    a:hover {
      background-color: #2980b9;
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
  <h2>✅ Parking Slot Released Successfully!</h2>
  <a href="/viewslots">🔙 Back to Slots</a>
</div>
</body>
</html>
