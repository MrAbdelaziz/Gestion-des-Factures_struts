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
							<a th:href="@{/admin}"
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
							<a class="list-group-item list-group-item-action  text-black-50">
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

							<a th:href="@{/admin/deciplines}"
								class="list-group-item list-group-item-action  text-black-50">
								<span class="menu-collapsed">Proprietaires</span>
							</a> <a th:href="@{/admin/publications}"
								class="list-group-item list-group-item-action  text-black-50">
								<span class="menu-collapsed">CC</span>
							</a> <a th:href="@{/admin/categories}"
								class="list-group-item list-group-item-action  text-black-50">
								<span class="menu-collapsed">Factures</span>
							</a> <a th:href="@{/admin/organismes}"
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
<a href="${pageContext.request.contextPath}/proprietairelist"
										class="btn btn-outline-info">Back </a>
						<s:form action="edit_proprietaire" method="post" class="mb-5">

							<div class="card" style="width: 100%">
								<div class="card-body">
									<div class="media">
										<img src="https://www.nourbook.com/publice/images/user.png"
											class="mr-4">
										<div class="media-body">
											<div class="d-flex w-100 justify-content-between">
												<h5 class="mt-0">
												<label>Nom: </label>
												<s:property  value="proprietaire.nom" />
													</br><label>Preom: </label>
												<s:property value="proprietaire.prenom" />


												</h5>
											</div>
										</div>

									</div>




								</div>
								<div class="card mt-2" style="width: 100%; border: 0px">
									<label for="inputNom" class="col-sm-2 col-form-label"
										style="font-weight: bold">Nom :</label>

									<div class="form-group row">
										<div class="col-sm-10">
											<input type="text" name="proprietaire.nom"
												class="form-control" placeholder="Update Nom"
												id="edit_proprietaire_proprietaire_nom" />
										</div>
									</div>


									<label for="inputNom" class="col-sm-2 col-form-label"
										style="font-weight: bold">Prenom :</label>

									<div class="form-group row">
										<div class="col-sm-10">
											<input type="text" name="proprietaire.prenom"
												class="form-control" placeholder="Update Prenom"
												id="edit_proprietaire_proprietaire_prenom" />
										</div>
									</div>
									<button type="submit" class="btn btn-warning">Confirm</button>
									
									
									<s:if test="%{ids != 0}">
									<s:url namespace="/" action="delete_proprietaire" var="lien2">
										<s:param name="ids">
											<s:property value="ids" />
										</s:param>
									</s:url>
									<s:a href="%{lien2}" cssClass="btn btn-danger">Delete</s:a>
						
									</s:if>
											</div>

							</div>
							<s:hidden label="ID" name="proprietaire.id"></s:hidden>
						</s:form>
						
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