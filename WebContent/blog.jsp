<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>blog</title>
</head>
<body>
	
	<h1>Ola ${NOME_SESSION} </h1>
	<h2>Mensagem:</h2>
	<form action="ControleBlog">
		<textarea rows="3" cols="40" value="" name="mensagem"></textarea>

		<br> <input type="submit" value="ENVIAR" />
	</form>
	<%
			String msg = request.getParameter("erro");
			if (msg == null)
				msg =  "";
	%>
		<p><%=msg %></p>
	<jsp:include page="mensagens.jsp" flush="true" />
</body>
</html>