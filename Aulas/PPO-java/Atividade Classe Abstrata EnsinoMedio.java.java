package Exercicio;

public class EnsinoMedio extends professor {
	
	private String disciplina;
	
	
	public EnsinoMedio(String nome, String disciplina) {
		super(nome);
		this.disciplina = disciplina;
	}
	
	
	public String getDisciplina() {
		return this.disciplina;
	}
	
	public String lecionar() {
		return "Prof " + this.getNome() + " Leciona " + this.getDisciplina();
	}
}