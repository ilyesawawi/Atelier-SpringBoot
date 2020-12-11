<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Modifier un Produit</title>
</head>
<body>
<form action="updateMobile" method="post">
<pre>
id : <input type="text" name="idMobile" value="${mobile.idProduit}">
nom :<input type="text" name="nomMobile" value="${mobile.nomProduit}">
prix :<input type="text" name="prixMobile" value="${mobile.prixProduit}">
Date création :
 <fmt:formatDate pattern="yyyy-MM-dd" value="${mobile.dateCreation}"
var="formatDate" />
 <input type="date" name="date" value="${formatDate}"></input>
<input type="submit" value="Modifier">
</pre>
</form>
<br/>
<br/>
<a href="Listemobiles">Liste Produits</a>
</body>
</html>
