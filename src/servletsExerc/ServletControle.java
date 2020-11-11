package servletsExerc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletControle", urlPatterns = {"/ServletControle"})
public class ServletControle extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		if(nome.equals(""))
			request.getRequestDispatcher("exercicio2.jsp?erro=Nome inexistente!").forward(request, response);
		else {
			nome = nome.toUpperCase();
			request.getRequestDispatcher("bemvindo.jsp?nome="+nome).forward(request, response);
		}
	}
}
