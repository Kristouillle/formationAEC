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
<form action="BMRServlet" method="post">
    <label for="weight">Weight (kg):</label>
    <input type="number" id="weight" name="weight" required><br><br>

    <label for="height">Height (cm):</label>
    <input type="number" id="height" name="height" required><br><br>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age" required><br><br>

    <label >Genre:</label><br>
    <input type="radio" id="homme" name="genre" value="homme" required>
    <label for="homme">Homme</label><br>
    <input type="radio" id="femme" name="genre" value="femme" required>
    <label for="femme">Femme</label><br><br>

    <label for="activityLvl">Niveau d'activité:</label>
    <select id="activityLvl" name="activityLvl" required>
        <option value="0">Peu/Pas d'activités</option>
        <option value="1">Activités légères</option>
        <option value="2">Modéré (3-5 fois/semaine)</option>
        <option value="3">Très actif (6-7 fois/semaine)</option>
        <option value="4">Extra (actif et job physique)</option>
    </select><br><br>

    <input type="submit" value="Calculate BMR">
</form>

<label>
    <!-- This label will be updated with the BMR result -->
    BMR: ${bmr}
</label>
<br>
<a href="index.jsp">Retour en arrière</a>

</body>
</html>