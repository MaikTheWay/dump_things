package Polimorfismo;

import java.time.LocalTime;

public class Relogio {
		
		protected String modelo;
	
		public Relogio(String modelo) {
			this.modelo = modelo;
		}
		
		// Set and get
		

		public String getModelo() {
			return modelo;
		}
		
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		// Métodos 
		
		public String MostrarHoras() {
			LocalTime horas = LocalTime.now();
			return("Neste momento sao " + horas.toString().substring(0,5) + " h");
		}

}
