package CapaLogica.Exceptions;

	public class YaTieneCalificacion extends Exception{
		private String mensaje;
		
		public YaTieneCalificacion (String mensaje){ 
			this.mensaje = mensaje; 
		}
		
		public String darMensaje(){ 
			return mensaje; 
		}
	}

