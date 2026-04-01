package Animais;

public class Gato extends Animal {

	private String nome;
	
	public Gato(String raça, String peso, String nome) {
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
	
	public void Miar() {
		System.out.println("MIAUUUUUU (aquele meme kk)");
	}
}
