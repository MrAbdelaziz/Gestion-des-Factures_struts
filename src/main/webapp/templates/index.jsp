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
	<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet" type="text/css"/>
	
</head>
<body>
<header>
	<div class="bs-component">
        <nav class="navbar navbar-expand-lg navbar-dark bg-white">
            <div class="container">
                <div class="collapse navbar-collapse" id="navbarColor01">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link text-black-50">Payer vos factures</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</header>
	<!-- content -->
	<div class="container mt-3">
		 <div class="login-container text-c animated flipInX">
                <div>
                    <h1 class="logo-badge text-whitesmoke"><span class="fa fa-user-circle"></span></h1>
                </div>
                    <h3 class="text-whitesmoke">Payer vos factures</h3>
                    <p class="text-whitesmoke">Payer vos factures ou celles d'un proche en toute sécurité en remplissant le formulaire ci-dessous.
Toutes les transactions bancaires sont cryptées et 100% sécurisées selon les derniers critères en vigueur.
Le service du paiement en ligne n’est pas facturé par votre banque.</p>
                <div class="container-content">
                    <form class="margin-t">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="NumCarte" required="">
                        </div>
                        <button type="submit" class="form-button button-l margin-b">Valider</button>
                    </form>
                    <p class="margin-t text-whitesmoke"><small> MrAbdelaziz &copy; 2020</small> </p>
                </div>
            </div>
	</div>
	
	<script th:src="@{/js/jquery.js}" ></script>
    <script th:src="@{/js/bootstrap.min.js}" ></script>
</body>
</html>