package Exercicio;

public class Main {

	public static void main(String[] args) {
		
		EnsinoMedio profmedio = new EnsinoMedio("Claudio","Fisica");
		Universitario profuniver = new Universitario("Thais");
		
		
		System.out.println(profmedio.lecionar());
		System.out.println(profuniver.lecionar());
	}
}