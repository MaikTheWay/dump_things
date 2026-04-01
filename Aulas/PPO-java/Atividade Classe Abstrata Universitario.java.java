package Exercicio;

public class Universitario extends professor {
	
	public Universitario(String nome) {
		super(nome);
	}
	
	public String lecionar() {
		return "Prof " + this.getNome() + " Leciona POO";
	}
}