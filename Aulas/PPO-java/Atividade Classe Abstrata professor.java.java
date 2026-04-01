package Exercicio;

public abstract class professor {
	
	private String nome;
	
	public professor (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public abstract String lecionar();
}