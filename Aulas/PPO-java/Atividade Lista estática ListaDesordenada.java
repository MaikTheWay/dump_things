public class ListaDesordenada {
		
		int quantidade;
		int[] elementos;
		
		
		public ListaDesordenada(int tamanho) {	
			
			this.quantidade = 0;
			this.elementos = new int[tamanho];
		}
		
		
		boolean inserir(int elemento) {
			if (quantidade >= elementos.length) {
				return false;
			}
			
			this.elementos[quantidade] = elemento;
			quantidade ++;
			return true;
					
			}
		
		public void imprimir() {
			for(int i = 0; i < quantidade; i++) {
				
				System.out.println(elementos[i]);
			}
		}
		
		public void remover(int indiceParaRemover){
			for(int i = indiceParaRemover; i < elementos.length - 1; i++) {
				elementos[i] = elementos[i+1];
			}
			quantidade --;
		}
}