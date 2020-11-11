<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Entrada</title>
		<meta charset="UTF-8">	
	</head>
	<body>
		<h1>Bem-vindo!</h1>
		<form action="ServletControle">
			<label>Entre com seu nome:
				<input type="text" name="nome">
			</label>
			<button type="submit">Entrar</button>
		</form>
		<%
			String msg = request.getParameter("erro");
			if (msg == null)
				msg =  "";
		%>
		<p><%=msg %></p>
	</body>
</html>