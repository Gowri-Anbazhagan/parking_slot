<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Add Slot</title>
  <!-- Google Font -->
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: 'Poppins', sans-serif;
      background: linear-gradient(to right, #ff9a9e, #fad0c4);
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .box {
      background: #ffffff;
      padding: 50px 40px;
      border-radius: 20px;
      box-shadow: 0 10px 30px rgba(0, 0, 0, 0.15);
      max-width: 500px;
      width: 90%;
      text-align: center;
    }

    h2 {
      margin-bottom: 30px;
      font-weight: 600;
      color: #2c3e50;
    }

    input {
      width: 100%;
      padding: 14px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 8px;
      font-size: 15px;
    }

    button {
      width: 100%;
      padding: 14px;
      background-color: #e67e22;
      border: none;
      border-radius: 8px;
      color: #ffffff;
      font-size: 16px;
      font-weight: 600;
      cursor: pointer;
      transition: all 0.3s ease;
    }

    button:hover {
      background-color: #ca6916;
      transform: scale(1.03);
    }

    @media (max-width: 600px) {
      .box {
        padding: 30px 20px;
      }

      h2 {
        font-size: 22px;
      }

      input, button {
        font-size: 14px;
      }
    }
  </style>
</head>
<body>
<div class="box">
  <h2>➕ Add New Parking Slot</h2>
  <form action="addslot" method="post">
    <input type="text" name="slotNumber" placeholder="Enter Slot Number" required />
    <button type="submit">Add Slot</button>
  </form>
</div>
</body>
</html>
