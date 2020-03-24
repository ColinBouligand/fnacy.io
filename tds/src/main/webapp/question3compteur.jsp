<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page language="java" import="compteur.Compteur" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	//durée de vie de page
	/*Compteur compteur = new Compteur();
	compteur.augmenterCompteur();
	out.print(compteur.getCompteur());*/
	
	//durée de vie de session
	//correction
	if(session.getAttribute("compteur")==null)
	{
		Compteur compteur = new Compteur();
		session.setAttribute("compteur", compteur);
	}
	else
	{
		Compteur c= (Compteur)session.getAttribute("compteur");
		c.augmenterCompteur();
		c= (Compteur)session.getAttribute("compteur");
		out.print(c.getCompteur());
	}
	
	//durée de vie application
	
	if(application.getAttribute("compteur")==null)
	{
		Compteur compteur = new Compteur();
		application.setAttribute("compteur", compteur);
	}
	else
	{
		Compteur c= (Compteur)application.getAttribute("compteur");
		c.augmenterCompteur();
		c= (Compteur)application.getAttribute("compteur");
		out.print(c.getCompteur());
	}
%>

</body>
</html>