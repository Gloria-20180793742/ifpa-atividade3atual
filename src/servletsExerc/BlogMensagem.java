package servletsExerc;

import java.sql.Date;
import java.sql.Time;

import javax.servlet.http.HttpServlet;

public class BlogMensagem extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public class Mensagem{
		private String mensagem;
		private Date dataMensagem;
		private Time horaMensagem;
		private String usuario;
		
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
		public Date getDataMensagem() {
			return dataMensagem;
		}
		public void setDataMensagem(Date dataMensagem) {
			this.dataMensagem = dataMensagem;
		}
		public Time getHoraMensagem() {
			return horaMensagem;
		}
		public void setHoraMensagem(Time horaMensagem) {
			this.horaMensagem = horaMensagem;
		}
		
		
	}
	
}
