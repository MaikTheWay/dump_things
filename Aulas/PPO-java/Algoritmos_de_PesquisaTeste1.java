package Pesquisa;

public class Algoritmos_de_PesquisaTeste1 {
	public boolean busca(int v, int[] valores) {
		for (int i = 0; i < valores.length; ++i) {
			if (v == valores[i]) {
				return true;
			}
		}
		return false;
	}
}
