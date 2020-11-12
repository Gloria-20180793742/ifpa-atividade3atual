package servletsExerc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Vector;
import java.util.concurrent.Executor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsServer;

@WebServlet(name = "ControleBlog", urlPatterns = { "/ControleBlog" })
public class ControleBlog extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Recuperar a mensagem do formulário
		String msg = request.getParameter("mensagem");
		
		if(msg == "")
			request.getRequestDispatcher("blog.jsp?erro=Mensagem obrigatoria!").forward(request, response);
		else {
			
			// definir/criar o objeto de dados (BlogMensagem)
			MensagemBlog blogMsg = new MensagemBlog();
			blogMsg.setMensagem(msg);
			blogMsg.setUsuario((String)request.getSession().getAttribute("NOME_SESSION"));
			// carrega a lista de “mensagens”, cria a lista se necessário.
			Vector listaMsg = (Vector) request.getSession().getAttribute("BEAN_LISTA");
			if (listaMsg == null)
				listaMsg = new Vector();
			blogMsg.setId(listaMsg.size()+1);
			// adiciona o objeto "blogMsg" na lista
			listaMsg.add(blogMsg);
			// salvar a lista em tempo de sessao (como bean)
			request.getSession().setAttribute("BEAN_LISTA", listaMsg);
			// despacho para a página de blog
			request.getRequestDispatcher("blog.jsp").forward(request, response);
		} // fim do método
	}
}
