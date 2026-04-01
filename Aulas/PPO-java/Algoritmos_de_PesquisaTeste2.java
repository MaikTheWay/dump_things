package Pesquisa;

class Algoritmos_de_PesquisaTeste2 {
	String nome;
	int idade;
}

public class Algoritmos_de_PesquisaTeste2 {
	public boolean busca(Teste2 p, Teste2[] valores) {
		for (int i = 0; i < valores.length; ++i) {
			if (p.nome.equals(valores[i].nome)) {
			  return true;
			}
		}	
		return false;
}
	
	public static void main(String[] s) {
		Teste2 a = new Teste2(); a.nome = "Maria"; a.idade = 10;
		Teste2 b = new Teste2(); b.nome = "Jose"; b.idade = 20;
		Teste2 c = new Teste2(); c.nome = "Pedro"; c.idade = 30;
	
		Teste2[] dados = new Teste2[]{a, b, c};
	
			Teste2 t = new Teste2();
			boolean existe = t.busca(a, dados);
			System.out.println(existe);
	}
}

