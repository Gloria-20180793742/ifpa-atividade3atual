package servletsExerc;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ControleExcluiMensagem", urlPatterns = { "/ControleExcluiMensagem" })
public class ControleExcluiMensagem extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Recuperar a mensagem do formulário
		int exclui = Integer.parseInt(request.getParameter("idchave"));
		Vector listaMsg = (Vector) request.getSession().getAttribute("BEAN_LISTA");
		
		for(int i = 0;i < listaMsg.size(); i++) {
			MensagemBlog aux = (MensagemBlog)listaMsg.get(i);
		
			if(exclui == aux.getId())
				listaMsg.remove(i);
		}
		request.getSession().setAttribute("BEAN_LISTA", listaMsg);
		// despacho para a página de blog
		request.getRequestDispatcher("blog.jsp").forward(request, response);
	}
}
