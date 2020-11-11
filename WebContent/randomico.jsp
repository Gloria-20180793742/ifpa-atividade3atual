<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Randômico</title>
		</head>
		<body>
		
			<!-- scriptlet -->
			<%
				Random geradorDeNumeros = new Random();
			%>
			<!-- expression -->
			<%= geradorDeNumeros.nextInt(100) %>
			
		</body>
	</html>
