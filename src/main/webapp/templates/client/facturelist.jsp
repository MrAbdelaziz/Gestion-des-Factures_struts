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
											<th scope="col">Montant</th>
											<th scope="col">Restant</th>
											<th scope="col">etat</th>
											<th scope="col" style="width: 18%; text-align: center">Action</th>
										</tr>
									</thead>
									<tbody>
										<s:iterator value="listbyclient">
											<tr>
												<td><s:property value="numFacture" /></td>
												<td><s:property value="dateFacture" /></td>
												<td><s:property value="montant" /></td>
												<td><s:property value="restant"/></td>
												<td><s:property value="etat"/></td>
												<td>
												<s:if test='%{etat != "paye"}'>
														
					                                    <s:if test='%{etat != "en cours"}'>
														<s:url namespace="/" action="paye_facture" var="lien1">
																<s:param name="facid">
																	<s:property value="numFacture" />
																</s:param>
																
																<s:param name="mont">
																	<s:property value="montant" />
																</s:param>
																
																<s:param name="idclient">
																	<s:property value="idclient" />
																</s:param>
																
																<s:param name="rest">
																	<s:property value="restant" />
																</s:param>
														</s:url>
														
														
		
															<div class="btn-group-sm mr-2 text-center" role="group"
																aria-label="Second group">
																
																<s:a href="%{lien1}" type="button" class="btn btn-outline-info">Payer
																<i class="fa fa-credit-card">
																	</i></s:a>
															</div>
															</s:if>
													</s:if>
												</td>
											</tr>
										</s:iterator>
									</tbody>
								</table>
							</div>
	
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