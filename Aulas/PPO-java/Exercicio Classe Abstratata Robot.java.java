package Exercicio;

public class Robot extends Robô{ 
	
	public Robot(String id) {
	super(id);
	}
	
	public String comunicar(String mensagem) {
		return this.getId() +  mensagem; 
	}
	
	public String locomover() {
		return this.getId() +  " se locomoveu ";
	}
	
	public String alertar() {
		return this.comunicar(" balançando os braços descontroladamente) DANGER, Will Robinson... DANGER");
	}
	
}