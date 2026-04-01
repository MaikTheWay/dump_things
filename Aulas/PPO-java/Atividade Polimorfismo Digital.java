package Polimorfismo;

import java.time.LocalTime;
	
	public class Digital extends Relogio {

		public Digital(String modelo) {
			super(modelo);
		}
		
		
		public String getModelo() {
			return modelo;
		}
		
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		
		public String MostrarHoras() {
			LocalTime horas = LocalTime.now();
			return("Neste momento são " + horas.toString().substring(0,8) + " h");
		}
	}
