<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home - Parking Slot System</title>
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Rubik:wght@400;600&display=swap" rel="stylesheet">
    <style>
        body {
            margin: 0;
            font-family: 'Rubik', sans-serif;
            background: linear-gradient(to right, #e0f7fa, #a1c4fd);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            background: #ffffff;
            padding: 60px 50px;
            border-radius: 20px;
            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 700px;
            width: 90%;
        }

        h1 {
            font-size: 30px;
            color: #2c3e50;
            margin-bottom: 40px;
        }

        .btn {
            display: inline-block;
            margin: 15px 15px;
            padding: 15px 35px;
            font-size: 16px;
            font-weight: 600;
            background: #00b894;
            color: white;
            text-decoration: none;
            border: none;
            border-radius: 12px;
            transition: all 0.3s ease;
            box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
        }

        .btn:hover {
            background: #009874;
            transform: scale(1.05);
        }

        .btn-danger {
            background: #d63031;
        }

        .btn-danger:hover {
            background: #b52a2a;
        }

        @media (max-width: 600px) {
            .container {
                padding: 30px 20px;
            }

            h1 {
                font-size: 24px;
            }

            .btn {
                display: block;
                width: 100%;
                margin: 10px 0;
                padding: 14px;
            }
        }
    </style>
</head>
<body>
<div class="container">
    <h1>👋 Welcome, <strong>${sessionScope.user.username}</strong></h1>
    <a class="btn" href="addslot">➕ Add Slot</a>
    <a class="btn" href="viewslots">📋 View Slots</a>
    <a class="btn btn-danger" href="logout">🚪 Logout</a>
</div>
</body>
</html>
