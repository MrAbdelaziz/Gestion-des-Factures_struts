<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proprietaires</title>
<style type="text/css">@import url(css/styles.css);</style>
</head>
<body>
	<div>
	<s:form action="save" method="post">
		<s:hidden label="ID" name="proprietaire.id"></s:hidden>
		<s:textfield key="nom.label" name="proprietaire.nom"></s:textfield>
		<s:textfield key="prenom.label" name="proprietaire.prenom"></s:textfield>
	    <s:hidden name="editmode"></s:hidden>
		
		<s:submit value="Save"></s:submit>
	</s:form>
	</div>
	<div>
	<table class="table1">
		<tr>
		<th>ID</th><th>NOM</th><th>Prenom</th>
		</tr>
		
		<s:iterator value="proprietaires">
			<tr>
			<td> <s:property value="id"/> </td>
			<td> <s:property value="nom"/> </td>
			<td> <s:property value="prenom"/> </td>
			<s:url namespace="/" action="delete" var="lien1">
				<s:param name="ids">
					<s:property value="id"/>
				</s:param>
			</s:url>
			<s:url namespace="/" action="edit" var="lien2">
				<s:param name="ids">
					<s:property value="id"/>
				</s:param>
			</s:url>
			<td><s:a href="%{lien1}">Delete</s:a> </td>
			<td><s:a href="%{lien2}">Edit</s:a> </td>
			</tr>
		</s:iterator>
	</table>
	
	</div>
		
</body>
</html>