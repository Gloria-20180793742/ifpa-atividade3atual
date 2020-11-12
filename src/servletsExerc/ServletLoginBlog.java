package servletsExerc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletLoginBlog", urlPatterns = { "/ServletLoginBlog" })
public class ServletLoginBlog extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		request.getSession().setAttribute("NOME_SESSION",nome);
		request.getRequestDispatcher("blog.jsp").forward(request,response);
		
	}

}
