<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
    <style>
        body {
            margin: 0;
            font-family: 'Poppins', sans-serif;
            background: url('https://images.unsplash.com/photo-1595480093013-3ed7ff6e88aa') no-repeat center center fixed;
            background-size: cover;
            position: relative;
        }

        /* Overlay background color */
        body::before {
            content: "";
            position: fixed;
            top: 0;
            left: 0;
            height: 100%;
            width: 100%;
            background-color: rgba(0, 0, 0, 0.4); /* Dark overlay */
            z-index: -1;
        }

        .box {
            max-width: 420px;
            margin: 100px auto;
            background: rgba(255, 255, 255, 0.97);
            padding: 40px 30px;
            border-radius: 18px;
            box-shadow: 0 8px 25px rgba(0, 0, 0, 0.3);
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
            font-weight: 600;
            color: #1f618d;
        }

        input {
            width: 100%;
            padding: 12px 14px;
            margin: 10px 0;
            border-radius: 10px;
            border: 1px solid #bbb;
            font-size: 15px;
        }

        button {
            width: 100%;
            padding: 12px;
            background: linear-gradient(to right, #2ecc71, #27ae60);
            color: white;
            font-size: 16px;
            font-weight: bold;
            border: none;
            border-radius: 10px;
            cursor: pointer;
            transition: 0.3s ease;
        }

        button:hover {
            background: linear-gradient(to right, #27ae60, #1e8449);
        }

        .error {
            color: #e74c3c;
            text-align: center;
            margin-top: 12px;
            font-size: 14px;
        }

        a {
            display: block;
            margin-top: 20px;
            text-align: center;
            color: #2980b9;
            font-weight: 500;
            text-decoration: none;
            transition: 0.3s ease;
        }

        a:hover {
            color: #1c5980;
        }
    </style>
</head>
<body>
<div class="box">
    <h2>📝 Create Your Account</h2>
    <form method="post" action="signup">
        <input name="username" placeholder="Enter your username" required />
        <input type="password" name="password" placeholder="Enter your password" required />
        <button type="submit">Sign Up</button>
    </form>
    <div class="error">${error}</div>
    <a href="login">Already have an account? Login</a>
</div>
</body>
</html>
