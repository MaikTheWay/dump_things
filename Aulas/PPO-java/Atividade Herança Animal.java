package Animais;

public class Animal {
	
// Atriutos
	
	private String raça;
	private String peso;
	
	public Animal(String raça, String peso) {
		super();
		this.raça = raça;
		this.peso = peso;
	}
	
// Funções

	public String getRaça() {
		return raça;
	}
	
	public void setRaça(String raça) {
		this.raça = raça;
	}

	
	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

// Método

	public void Andar() {
	System.out.println("Caminhando por ai...");
	}
	
	public void Comer() {
		System.out.println("Minhaminhames");
	}
}