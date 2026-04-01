package Animais;

public class main {

	public static void main(String[] args) {
		
		Animal crocodilo = new Animal("Reptil", "160");
		crocodilo.Andar();
		
		Cachorro billy = new Cachorro("Puddle", "15", "Billie");
		billy.Comer();
		billy.Latir();
		
		Gato bebe = new Gato("Vaquinha", "9", "bebe");
		bebe.Andar();
		bebe.Miar();
	}
}