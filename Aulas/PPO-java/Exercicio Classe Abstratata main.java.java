package Exercicio;

public class main {

	public static void main(String[] args) {

		Robot robot = new Robot(" robot");
		
		System.out.println(robot.comunicar(" Cuidado Dr. Smith..."));
		
		System.out.println(robot.locomover());
		
		System.out.println(robot.comunicar(" And here's to you, Mrs Robinson"));

		System.out.println(robot.locomover());
		
		System.out.println(robot.alertar());
		
	}

}
