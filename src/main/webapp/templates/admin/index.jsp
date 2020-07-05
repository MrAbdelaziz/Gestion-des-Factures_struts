<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<title>Administration</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/custom.min.css"
	rel="stylesheet" type="text/css" />

</head>
<body>
	<header>
		<div class="bs-component">
			<nav class="navbar navbar-expand-lg navbar-dark bg-white">
				<div class="container">
					<!--  <a class="navbar-brand" th:href="@{/}">Administrator</a> -->
					<div class="collapse navbar-collapse" id="navbarColor01">
						<ul class="navbar-nav mr-auto">
							<li class="nav-item active"><a
								class="nav-link text-black-50">Gestion de pub</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</header>


	<div class="container mt-2">
		<div class="row">
			<div class="col-lg-3">
				<!-- Sidebar -->
				<div class="sidebar-expanded d-none d-md-block">
					<!-- d-* hiddens the Sidebar in smaller devices. Its itens can be kept on the Navbar 'Menu' -->
					<!-- Bootstrap List Group -->
					<ul class="list-group">
						<!-- Separator with title -->
						<li
							class="list-group-item sidebar-separator-title text-muted d-flex align-items-center menu-collapsed">
							<small>MAIN MENU</small>
						</li>
						<!-- /END Separator -->
						<!-- Menu with submenu -->
						<a href="#submenu1" data-toggle="collapse" aria-expanded="false"
							class="list-group-item list-group-item-action flex-column align-items-start">
							<div
								class="d-flex w-100 justify-content-start align-items-center">
								<span class="fa fa-dashboard fa-fw mr-3"></span> <span
									class="menu-collapsed text-black-50">Tableau de bord</span> <span
									class="submenu-icon ml-auto"></span>
							</div>
						</a>
						<!-- Submenu content -->
						<div id='submenu1' class="collapse sidebar-submenu">
							<a href="/admin"
								class="list-group-item list-group-item-action  text-black-50">
								<span class="menu-collapsed">Statistiques</span>
							</a>
						</div>
						<a href="#submenu2" data-toggle="collapse" aria-expanded="false"
							class="list-group-item list-group-item-action flex-column align-items-start">
							<div
								class="d-flex w-100 justify-content-start align-items-center">
								<span class="fa fa-user fa-fw mr-3"></span> <span
									class="menu-collapsed text-black-50">utilisateurs</span> <span
									class="submenu-icon ml-auto"></span>
							</div>
						</a>
						<!-- Submenu content -->
						<div id='submenu2' class="collapse sidebar-submenu">
							<a href="${pageContext.request.contextPath}/proprietairelist"
								class="list-group-item list-group-item-action  text-black-50">
								<span class="menu-collapsed">Proprietaires</span>
							</a>
						</div>


						<a href="#submenu3" data-toggle="collapse" aria-expanded="false"
							class="list-group-item list-group-item-action flex-column align-items-start">
							<div
								class="d-flex w-100 justify-content-start align-items-center">
								<span class="fa fa-tasks fa-fw mr-3"></span> <span
									class="menu-collapsed text-black-50">DATA</span> <span
									class="submenu-icon ml-auto"></span>
							</div>
						</a>
						<!-- Submenu content -->
						<div id='submenu3' class="collapse sidebar-submenu">
							
							
							<a href="${pageContext.request.contextPath}/cclist"
								class="list-group-item list-group-item-action  text-black-50">
								<span class="menu-collapsed">CC</span>
							</a>

							
							<a th:href="@{/admin/categories}"
								class="list-group-item list-group-item-action  text-black-50">
								<span class="menu-collapsed">Factures</span>
							</a>
							
							 
							 <a th:href="@{/admin/organismes}"
								class="list-group-item list-group-item-action  text-black-50">
								<span class="menu-collapsed">Transactions</span>
							 </a>
							
							

						</div>




						<!-- Logo -->
						<li
							class="list-group-item logo-separator d-flex justify-content-center">
							<img
							src='https://v4-alpha.getbootstrap.com/assets/brand/bootstrap-solid.svg'
							width="30" height="30" />
						</li>
					</ul>
					<!-- List Group END-->
				</div>
				<!-- sidebar-container END -->

			</div>
			<div class="col-lg-9 p-0" style="width: 100%">
				<div class="container">
				<div class="admin_content">
		<div
			class="d-flex justify-content-between align-items-center text-white">
			<div class="page-header" style="width: 100%">
             <h1 id="navbars">Statistiques</h1>
           </div>
		</div>

		<div class="card-deck mb-3 text-center mt-3">
			<div class="card mb-4 shadow-sm">
				<div class="card-header">
					<a type="button"
						class="btn btn-lg btn-block">Factures</a>
				</div>
				<div class="card-body">
<h1 class="card-title pricing-card-title" >
					
					<s:property value="countfactures"/>
					</h1>				</div>
			</div>
			<div class="card mb-4 shadow-sm">
				<div class="card-header">
					<a type="button" href="${pageContext.request.contextPath}/proprietairelist"
						class="btn btn-lg btn-block">Proprietaires</a>
				</div>
				<div class="card-body">

					<h1 class="card-title pricing-card-title" >
					
					<s:property value="countProprietaire"/>
					</h1>
				</div>
			</div>
			<div class="card mb-4 shadow-sm">
				<div class="card-header">
					<a type="button"
						class="btn btn-lg btn-block">Transactions</a>

				</div>
				<div class="card-body">
<h1 class="card-title pricing-card-title" >
					
					<s:property value="counttransaction"/>
					</h1>				</div>
			</div>
		</div>
	</div>
				
				</div>
			</div>
		</div>
	</div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

	
</body>
</html>