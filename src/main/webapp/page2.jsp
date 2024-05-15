<%--
  Created by IntelliJ IDEA.
  User: Christophe
  Date: 2024-05-14
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your JSP Page</title>
</head>
<body>
<h1>Form</h1>
<form action="AutreCalculatrice" method="post">
    <!-- Your form fields -->
    <input type="number" id="poids" name="poids" required><br><br>
    <!-- other fields -->
    <input type="submit" value="Submit">
</form>

<label>
    <!-- This label will be updated dynamically -->
    <!-- You can use EL to access a variable set in your servlet -->
    Résultat: ${result}
</label>
</body>
</html>