package servletsExerc;

import java.sql.Time;
import java.util.Date;

import javax.servlet.http.HttpServlet;

public class MensagemBlog {
	
		private String mensagem;
		private Date dataMensagem;
		private Time horaMensagem;
		private String usuario;
		private int id;
		
		public MensagemBlog() {
			this.dataMensagem = new Date();
			this.horaMensagem = new Time(System.currentTimeMillis());
		}
		
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

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
}
