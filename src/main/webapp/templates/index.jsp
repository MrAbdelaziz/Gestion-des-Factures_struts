<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME</title>
</head>
<body>
		<h1>Hello Z3d</h1>
		<s:url namespace="/" action="cartescredits" var="l1"></s:url>
		<s:a href="%{l1}">cartescredit</s:a>
		
		
		<s:url namespace="/" action="proprietaires" var="l2"></s:url>
		<s:a href="%{l2}">proprietaires</s:a>
		
</body>
</html>