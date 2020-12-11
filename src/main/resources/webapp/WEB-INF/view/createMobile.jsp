<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Créer un Mobile</title>
</head>
<body>
<form action="saveMobile" method="post">
<pre>
nom : <input type="text" name="nomMobile">
prix : <input type="text" name="prixMobile">
date création : <input type="date" name="date">
<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeMobile">Liste Mobiles</a>
</body>
</html>