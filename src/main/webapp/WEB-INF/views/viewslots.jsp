<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>View Slots</title>
<style>
  body {
    font-family: 'Segoe UI', sans-serif;
    background: linear-gradient(to right, #c9ffbf, #ffafbd);
    padding: 20px;
  }
  .container {
    max-width: 1000px;
    margin: auto;
    background: white;
    padding: 30px;
    border-radius: 16px;
    box-shadow: 0 0 20px rgba(0,0,0,0.1);
  }
  h2 {
    text-align: center;
    color: #2c3e50;
    margin-bottom: 20px;
  }
  table {
    width: 100%;
    border-collapse: collapse;
    text-align: center;
  }
  th, td {
    padding: 15px;
    border: 1px solid #ddd;
  }
  th {
    background-color: #2c3e50;
    color: white;
  }
  .book {
    background-color: #2ecc71;
    color: white;
    padding: 8px 16px;
    border-radius: 8px;
    text-decoration: none;
  }
  .release {
    background-color: #e74c3c;
    color: white;
    padding: 8px 16px;
    border-radius: 8px;
    text-decoration: none;
  }
  .logout {
    float: right;
    background: #e67e22;
    color: white;
    padding: 10px 20px;
    border-radius: 8px;
    text-decoration: none;
  }
</style>
</head>
<body>
<div class="container">
  <a class="logout" href="logout">Logout</a>
  <h2>📋 Parking Slot Status</h2>
  <table>
    <tr><th>ID</th><th>Slot No</th><th>Status</th><th>Action</th></tr>
    <c:forEach var="s" items="${slots}">
      <tr>
        <td>${s.id}</td>
        <td>${s.slotNumber}</td>
        <td><c:choose>
          <c:when test="${s.occupied}">Occupied</c:when>
          <c:otherwise>Available</c:otherwise>
        </c:choose></td>
        <td><c:choose>
          <c:when test="${s.occupied}">
            <a class="release" href="releaseslot/${s.id}">Release</a>
          </c:when>
          <c:otherwise>
            <a class="book" href="bookslot/${s.id}">Book</a>
          </c:otherwise>
        </c:choose></td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>
