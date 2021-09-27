<%@page language="java" 
 contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>     
<jsp:useBean id="Teatro" scope="request" 
             type="model.Teatro"></jsp:useBean>
<html>
<head>
<meta charset="UTF-8">
<title>.: Sucesso :.</title>
</head>
<body>
 <h1> Teatro encontrado com sucesso! </h1>
 <hr> 
      ID: <c:out value="${Teatro.id}"/> <br>
      Nome: <c:out value="${Teatro.nome}"/> <br>
      Peça em exibição: <c:out value="${Teatro.peca}"/> <br> 
</body>
</html>