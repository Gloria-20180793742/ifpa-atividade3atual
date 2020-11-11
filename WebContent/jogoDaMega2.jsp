<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Random"%>
<!DOCTYPE html>
<html>
<head>
<title>Jogo da Megasena-2</title>
<meta charset="UTF-8">
</head>
<body>
	<h1>Faça seu jogo JSP!</h1>
	<form action="jogoDaMega2.jsp">
		<label>Quantos jogos quer fazer? 
			<input type="text"	name="quantidade">
		</label>
		<button type="submit">Jogar</button>
	</form>
	<%
		String msg = request.getParameter("quantidade");
	if (msg == null || msg == "")
		out.print("Digite uma quantidade valida!");
	
	else{
		Random geradorDeNumeros = new Random();
		
		Integer quantidadeJogos = Integer.parseInt(msg);
		out.print("<h1>Seus Jogos: </h1>");
		
		for(int i=1;i<=quantidadeJogos;i++) {
			out.print("<h2>Jogo"+ i +"</h2>");
			for(int j=5;j>=0;j--) {
				out.print(geradorDeNumeros.nextInt(80));
				if(j>0){
					out.print(", ");
				}
			}
			out.print("<br>");
		}
		
	}
	%>
	
</body>
</html>