<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	if(request.getParameter("champFormHtmlTexte") != null)
	{
		if(request.getParameter("champFormHtmlTexte").length()>=1){
			out.print(request.getParameter("champFormHtmlTexte"));
		}
		else
			response.sendRedirect("question2form.html");
	}
	else {
	//	response.encodeRedirectURL("question2form.html");
		response.sendRedirect("question2form.html");
	}
	
	%>
</body>
</html>