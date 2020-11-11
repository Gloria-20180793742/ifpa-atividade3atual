package servletsExerc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ServletRandomico", urlPatterns = {"/ServletRandomico"})
public class ServletRandomico extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Random geradorDeNumeros = new Random();
		String numero = Integer.toString(geradorDeNumeros.nextInt(100));
			
		PrintWriter writer = response.getWriter();
		writer.print("<html><body><h1>Numero randomico:</h1>");
		writer.print("<h2>"+numero+"</h2></body></html>");
	}
}
