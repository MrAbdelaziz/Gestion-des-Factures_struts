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
								class="nav-link text-black-50">Facturation @MrAbdelaziz</a></li>
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
							<a href="${pageContext.request.contextPath}/admin"
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
							<a href="${pageContext.request.contextPath}/proprietairelist" class="list-group-item list-group-item-action  text-black-50">
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
							</a> <a href="${pageContext.request.contextPath}/factureslist"
								class="list-group-item list-group-item-action  text-black-50">
								<span class="menu-collapsed">Factures</span>
							</a> <a href="${pageContext.request.contextPath}/transactionslist"
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
								<h1 id="navbars">Factures</h1>
							</div>
						</div>


						<div class="card" style="clear: both">
							<div class="card-body p-0">
								<table class="table table-bordered" style="margin-bottom: 0px;">
									<thead style="background-color: #797574 !important;">
										<tr>
											<th scope="col">NumFacture</th>
											<th scope="col">Date Facture</th>
											<th scope="col">Proprietaire</th>
											<th scope="col">Montant</th>
											<th scope="col">Restant</th>
											<th scope="col">etat</th>
											<th scope="col" style="width: 18%; text-align: center">Action</th>
										</tr>
									</thead>
									<tbody>
										<s:iterator value="factures">
											<tr>
												<td><s:property value="numFacture" /></td>
												<td><s:property value="dateFacture" /></td>
												<td><s:property value="proprietaire.getNom()" /></td>
												<td><s:property value="montant" /></td>
												<td><s:property value="restant"/></td>
												<td><s:property value="etat"/></td>
												<td>
												<s:url namespace="/" action="show_facture" var="lien1">
														<s:param name="facid">
															<s:property value="numFacture" />
														</s:param>
														
														<s:param name="mont">
															<s:property value="montant" />
														</s:param>
												</s:url>
												
												

													<div class="btn-group-sm mr-2 text-center" role="group"
														aria-label="Second group">
														
														<s:a href="%{lien1}" type="button" class="btn btn-outline-info">Info
														<i class="fa fa-eye">
															</i></s:a>
													</div>
													
												</td>
											</tr>
										</s:iterator>
									</tbody>
								</table>
							</div>
							<a type="button" class="btn btn-primary"
								style="background-color: #797574; border-color: #fff;"
								href="${pageContext.request.contextPath}/add_facture">Ajouter</a>
						</div>



					</div>

				</div>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>


</body>
</html>