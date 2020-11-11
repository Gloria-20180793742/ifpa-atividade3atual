package servletsExerc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletMegasena", urlPatterns = {"/ServletMegasena"})
	public class ServletMegasena extends HttpServlet {

		private static final long serialVersionUID = 1L;
		
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			
			String quantidade = request.getParameter("quantidade");
			if(quantidade.equals(""))
				request.getRequestDispatcher("jogoDaMega.jsp?erro=Numero invalido!").forward(request, response);
			else {
				Random geradorDeNumeros = new Random();
				PrintWriter writer = response.getWriter();
				Integer quantidadeJogos = Integer.parseInt(quantidade);
				writer.print("<html><body><h1>Seus Jogos: </h1>");
				
				for(int i=1;i<=quantidadeJogos;i++) {
					writer.print("<h2>Jogo"+ i +"</h2>");
					for(int j=5;j>=0;j--) {
						writer.print(geradorDeNumeros.nextInt(80));
						if(j>0)
							writer.print(", ");
					}
					writer.print("<br>");
				}
				writer.print("</body></html>");
			}
		}
	}

