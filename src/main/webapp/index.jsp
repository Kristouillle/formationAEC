<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculatrice de BMR</title>
</head>
<body>
<h1>Formulaire de données</h1>
<form method="get">
    <label for="poids">Poids (en kg):</label>
    <input type="number" id="poids" name="poids" required><br><br>

    <label for="taille">Taille (en cm):</label>
    <input type="number" id="taille" name="taille" required><br><br>

    <label for="age">Âge:</label>
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

    <input type="submit" value="Soumettre">
    <input type="text" name="result" value="${result}" readonly>
</form>
<br/>
<a href="page2.jsp">Hello Servlet</a>
</body>
</html>