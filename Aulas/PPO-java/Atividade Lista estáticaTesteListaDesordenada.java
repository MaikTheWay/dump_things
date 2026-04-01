
public class TesteListaDesordenada {
	
	public static void main(String[] args) {
		
	ListaDesordenada lista = new ListaDesordenada(10);
	
	lista.inserir(10);
	lista.inserir(20);
	lista.inserir(50);
	
	lista.remover(2);
	lista.imprimir();
	
	}
}