<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="jq" %>

<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

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
<script type="text/javascript">
var idcl = getUrlParameter('idclient');

$.get("getSubForm2?idclient="+idcl,function(data){
	 $("#subForm").html(data);	
	});


function getUrlParameter(sParam) {
    var sPageURL = window.location.search.substring(1),
        sURLVariables = sPageURL.split('&'),
        sParameterName,
        i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : decodeURIComponent(sParameterName[1]);
        }
    }
};
	  </script>
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
														<s:url namespace="/" action="home_client" var="lien1">
																<s:param name="idclient">
																	<s:property value="idclient" />
																</s:param>
														</s:url>					
					
										
										<s:a href="%{lien1}" type="button" class="btn btn-outline-info">Back
																<i class="fa fa-credit-card">
																	</i></s:a>
																	
						<s:form action="paye_avec_sucess" method="post" class="mb-5">

							<div class="card" style="width: 100%">
								<div class="card-body">
						
								</div>
								<div class="card mt-2" style="width: 100%; border: 0px">
									<label for="inputNom" class="col-sm-2 col-form-label"
										style="font-weight: bold">num Facture :</label>
<%
String facn ;
if(request.getAttribute("facid")==null){
	facn="F000000";
}else{
	facn = (String) request.getAttribute("facid");
}
%>
									<div class="form-group row">
										<div class="col-sm-10">
											<input type="text" value="<%=facn%>" name="facture.numFacture"
												class="form-control" placeholder="Update num Facture"
												id="save_facture_facture_numFacture" disabled="disabled"/>
										</div>
									</div>


									<label for="inputNom" class="col-sm-2 col-form-label"
										style="font-weight: bold">Montant :</label>

									<div class="form-group row">
										<div class="col-sm-10">
<%
int mont=0;
int rest=0;
try{
mont =Integer.parseInt(request.getParameter("mont"));
rest =Integer.parseInt(request.getParameter("rest"));
if(rest!=0)
	mont=rest;
	
}catch(Exception e){
	mont=0;
}
%>
											<input   value="<%=mont%>" type="text" name="facture.montant"
												class="form-control" placeholder="Update Montant"
												id="save_facture_facture_montant" disabled="disabled"/>
										</div>
									</div>
									
									
			
									
									
									
									<label for="inputNom" class="col-form-label"
										style="font-weight: bold">Sélectionner votre carte :</label>
										
									<div class="form-group row">
									<div style="margin-left:15px" id="subForm"></div>
									</div>
									
									<label for="inputNom" class="col-form-label"
										style="font-weight: bold">Montant à Payer :</label>
									<div class="form-group row">
										<div class="col-sm-10">
										
										<input max="<%=mont%>" min="1"  type="number" name="transaction.montantpaiement"
												class="form-control"
												 required="required">
										</div>
									</div>
									
									<button type="submit" class="btn btn-warning">Confirm</button>
									
									
				
											</div>

							</div>
							<s:if test="%{facid != null}">
								<s:hidden name="facid"></s:hidden>
									<s:hidden name="idclient"></s:hidden>
							</s:if>
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