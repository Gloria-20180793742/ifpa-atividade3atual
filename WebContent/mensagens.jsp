<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mensagens</title>
</head>
<body>
	<h3>Mensagens postadas</h3>
	<display:table name="${BEAN_LISTA}" uid="objmsg" defaultsort="2" defaultorder="descending">
		<display:column property="mensagem" style="width: 50%;" />
		<display:column property="dataMensagem" title="Data" format="{0,date,dd-MM-yyyy}" style="width: 10%;" />
		<display:column property="horaMensagem" title="Hora" format="{0,date,HH:mm }" style="width: 10%;" />	
		<display:column property="usuario" style="width: 20%;"/>
		<display:column href="ControleExcluiMensagem" paramId="idchave"	paramProperty="id" style="width: 10%;">
			<img alt="Excluir" src="img/excluir.ico"> 
		</display:column>
	</display:table>
</body>
</html>