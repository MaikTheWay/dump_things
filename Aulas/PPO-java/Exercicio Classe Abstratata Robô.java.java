package Exercicio;

public abstract class Robô {
	
	private String id;
	
	public Robô(String id) {
		this.id = id.toUpperCase();
	}
	
	public String getId() {
		return this.id;
	}

	public abstract String comunicar (String mensagem);
	public abstract String locomover();

}