<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Mobiles</title>
</head>
<body>
 <h1 >
 Liste des Mobiles
 </h1>
 <table >
 <tr>
 <th>ID</th><th>Nom Mobile</th><th>Prix</th><th>Date
Cr�ation</th><th>Suppression<th>Edition</th>
 </tr>
 <c:forEach items="${mobile}" var="p">
 <tr>
 <td>${p.idMobile }</td>
 <td>${p.nomMobile }</td>
 <td>${p.prixMobile }</td>
 <td><fmt:formatDate pattern="dd/MM/yyyy"
value="${p.dateCreation}" /></td>
 <td><a onclick="return confirm('Etes-vous s�r ?')"
href="supprimerMobile?id=${p.idMobile }">Supprimer</a></td>
 <td><a href="modifierMobile?id=${p.idMobile }">Edit</a></td>
 </tr>
 </c:forEach>
 </table>
</body>
</html>
