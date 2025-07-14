<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Login</title>
<style>
  body {
    margin: 0;
    font-family: 'Segoe UI', sans-serif;
    background: url('https://images.unsplash.com/photo-1581091215367-1e7bdf7eebf4') no-repeat center center fixed;
    background-size: cover;
    background-image:url('/images/seven.png')
  }
  .box {
    max-width: 400px;
    margin: 100px auto;
    background: rgba(255, 255, 255, 0.95);
    padding: 40px;
    border-radius: 16px;
    box-shadow: 0 0 20px rgba(0,0,0,0.2);
  }
  h2 {
    text-align: center;
    color: #34495e;
  }
  input {
    width: 100%;
    padding: 12px;
    margin: 10px 0;
    border-radius: 8px;
    border: 1px solid #ccc;
  }
  button {
    width: 100%;
    padding: 12px;
    background: #2c3e50;
    color: white;
    border: none;
    border-radius: 8px;
    cursor: pointer;
  }
  button:hover {
    background: #1a252f;
  }
  .error {
    color: red;
    text-align: center;
    margin-top: 10px;
  }
  a {
    display: block;
    margin-top: 15px;
    text-align: center;
    color: #2980b9;
    text-decoration: none;
  }
</style>
</head>
<body>
<div class="box">
  <h2>🔐 Login</h2>
  <form method="post" action="login">
    <input name="username" placeholder="Username" required />
    <input type="password" name="password" placeholder="Password" required />
    <button type="submit">Login</button>
  </form>
  <div class="error">${error}</div>
  <a href="signup">Don't have an account? Sign up</a>
</div>
</body>
</html>
