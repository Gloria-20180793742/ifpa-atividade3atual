<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Jogo da Megasena</title>
<meta charset="UTF-8">
</head>
<body>
	<h1>Faça seu jogo!</h1>
	<form action="ServletMegasena">
		<label>Quantos jogos quer fazer? 
			<input type="text"	name="quantidade">
		</label>
		<button type="submit">Jogar</button>
	</form>
	<%
		String msg = request.getParameter("erro");
	if (msg == null)
		msg = "";
	%>
	<p><%=msg%></p>
</body>
</html>