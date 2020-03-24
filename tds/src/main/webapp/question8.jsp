<%@ page import ="java.util.Date" %> 
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss ZZZZ");
out.println(request.getRemoteAddr() + " -- ["+sdf.format(new Date())+"]");
out.println("Permet d'obtenir le code du pays du client : ");
out.println(request.getLocale().getDisplayCountry());
out.println("Permet d'obtenir le nom du protocole : ");
out.println(request.getProtocol());
out.println("Permet d'obtenir le nom de la page demandée : ");
out.println(request.getRequestURL());
out.println("Permet d'obtenir le nom de la page demandée et les paramètres associés : ");
//http://127.0.0.1:8080/tds/question8.jsp?param=1
out.println(request.getRequestURI()+request.getParameter("param"));
out.println(request.getRequestURL()+"?"+request.getQueryString());
out.println("Permet d'obtenir le chemin absolu de la ressource demandée : ");
out.println(request.getRealPath(request.getRequestURI()));



%>