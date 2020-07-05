<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<title>Accueil</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    
	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/css/custom.min.css" rel="stylesheet" type="text/css"/>
	
</head>
<body>
<header>
	<div class="bs-component">
        <nav class="navbar navbar-expand-lg navbar-dark bg-white">
            <div class="container">
                <div class="collapse navbar-collapse" id="navbarColor01">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link text-black-50">Gestion de pub</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</header>
	<!-- content -->
	<div class="container mt-3">
		 <div class="row">
		 test
		 </div>
	</div>
	
	<script th:src="@{/js/jquery.js}" ></script>
    <script th:src="@{/js/bootstrap.min.js}" ></script>
</body>
</html>