package Animais;

public class Cachorro extends Animal {

	private String nome;
	
	public Cachorro(String raça, String peso, String nome) {
		super(raça, peso);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
// Método
	
	public void Latir() {
		System.out.println("Auau");
	}
}
