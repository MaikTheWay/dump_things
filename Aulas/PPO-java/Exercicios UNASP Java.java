// ------------------------- ESTRUTURA DE DADOS ------------------------ \\

// Leia do teclado um valor inteiro, positivo e calcule a média dos números pares entre 0
// e o valor informado pelo usuário. Imprima o resultado da seguinte forma: “A media dos
// primeiros {n} números eh {valor}”, sendo {n} o valor informado e {valor} o valor
// calculado. Se o valor informado for negativo, mostre a mensagem de erro “Erro. Valor
// negativo informado.”. Exemplos:

// Caso 1:
// Valor do teclado: 5
// Resultado: A media dos primeiros 5 números eh 2

// Caso 2:
// Valor do teclado: 20
// Resultado: A media dos primeiros 20 números eh 10

// Caso 3:
// Valor do teclado: -5
// Resultado: Erro. Valor negativo informado.

package Pacote;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

    int valor;
    int par 0;
    double media;
    int count = 0;

    System.out.println("Digite um numero:" ); 
    Scanner nome var scanner = new Scanner(System.in);
    valor = nome_var_scanner.nextInt();

    if(valor < 0) {
        System.out.println("Erro. Valor negativo informado.");
    }else {
        for(int i = 1; i < valor; i++) {
            if(i % 2 == 0) {
                par = i + par;
                count ++;
	  }
	}
	media = par / count;
	System.out.println("A media dos primeros + valor + números ch + media);
   }
}



// Leia do teclado um valor inteiro, positivo e exiba na tela todos os números entre 0 e o
// valor informado que sejam múltiplos de treze, com o seguinte formato {13, 26, 39}. Se
// o valor informado for negativo, mostre a mensagem de erro “Erro. Valor negativo
// informado.”. Exemplos:

// Caso 1:
// Valor do teclado: 30
// Resultado: {13, 26}

// Caso 2:
// Valor do teclado: 100
// Resultado: {13, 26, 39, 52, 65, 78, 91}

// Caso 3:
// Valor do teclado: -5
// Resultado: Erro. Valor negativo informado.

// Caso 4:
// Valor do teclado: 12
// Resultado: {}

package Pacote;
import java.util.Scanner;

public class Teste2 { 
    public static void main(String[] args) {

    int valor;

    System.out.println("Digite um numero multiplo de 13: "); 
    Scanner nome var scanner = new Scanner(System.in);
    valor = nome_var_scanner.nextInt();

    if (valor < 0) {
         System.out.println("Erro. Valor negativo informado." );
    }else{
	 for (int i = 0; i < valor; i++) { 
              if(i % 13 0) {
		  System.out.println("Resultado ("+ i + "}");
              }
           }
        }
    }
}

// Leia do teclado um valor inteiro e verifique se cada número entre 2 e o valor informado
// é um número primo, ou não. A saída deve ser no formato “O numero {n} eh primo” ou
// “O numero {n} nao eh primo”. Se o valor informado for menor ou igual a 1, mostre na
// tela a mensagem “O numero deve ser maior que um”. Exemplos:

// Caso 1:
// Número: 5
// Resultado:
// O numero 2 eh primo
// O numero 3 eh primo
// O numero 4 nao eh primo
// O numero 5 eh primo

// Caso 2:
// Salário: -10
// Resultado: O numero deve ser maior que um

package Pacote;
import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {

    int valor;

    System.out.println("Digite um numero:" ); 
    System.out.println("O numero deve ser maior que um");
    Scanner nome var scanner = new Scanner(System.in); 
    valor nome_var_scanner.nextInt();

    if(valor <= 1) {
	System.out.println("O numero deve ser maior que um" ); 
    }else {
        for (int i = 2 ; i <= valor; i++) {
             int numPrimo = i;
             int numDivisores = 0; 
             for(int j = 1; j <= numPrimo; j++) { 
	         if (numPrimo % j == 0) { 
                     numDivisores++; 
		 }
             }
             if(numDivisores == 2) {
		   System.out.println("O numero "+i+") eh prino"); 
		}else{ 
		    System.out.println("O numero "+i+ ") nao eh prino"); 
		}
	     }
	}
    }
}



// Um problema comum em computação é a verificação se uma cadeia de caracteres de
// uma variável armazena um valor numérico, ou não. Quer dizer, se em todas as posições
// desta variável só existem caracteres entre 0 e 9. Crie uma função chamada
// isNumero() numa classe ApenasCaracteres.java que recebe como
// argumento um parâmetro do tipo String e retorna um boolean, sendo true
// quando existirem apenas números e false se em alguma posição existir algo que não
// for um número.

// Caso 1:
// Parâmetro de entrada na função: 123456
// Resultado retornado: true

// Caso 2:
// Parâmetro de entrada na função: 123456A
// Resultado retornado: false

// Caso 3:
// Parâmetro de entrada na função: A983B
// Resultado retornado: false

import java.util.Scanner;

public class ApenasCaracteres {
	
// Classe Publica: Pode chamar em qualquer lugar, Classe Static: Se ela não fosse Static, teria de criar um objeto... 
// Para futuramente ser chamada. Classe retorna Boolean e recebe a String variavel "Valor"

public static boolean isNumero(String valor){

// Se valor NÃO FOR VAZIO VAI FAZER:
   if (!(valor == null)) {

    // Para toda posição zero até valor final, faça com todo numero
       for(int i = 0; i < valor.length(); i++) {
				
	// Todo toda posição do caracter de i, será comparado com numeros de 0 a 9
	   if ((valor.charAt(i) == '0') || (valor.charAt(i) == '1') || (valor.charAt(i) == '2') || (valor.charAt(i) == '3') || (valor.charAt(i) == '4') || (valor.charAt(i) == '5') || (valor.charAt(i) == '6') || (valor.charAt(i) == '7') || (valor.charAt(i) == '8') || (valor.charAt(i) == '9')) {
					
	        // Ele vai dar continuidade até ser feito com todos os valores
		continue;
					
	   } else {
		return false;
	   }		
	}
	return true;
   } else {
	return false;
   }
} 
	
public static void main(String[] args) {
		
    // Criar interface para o usuario digitar
    System.out.println("Digite um numero:" );
		
    // Ler o valor do usuario 
    Scanner nome_var_scanner = new Scanner(System.in);
    String valor = nome_var_scanner.next();
		
    // Resposta vai ser boolean e o a função isNumber vai ler o valor de "valor"
    boolean resposta = isNumero(valor);
    System.out.println(resposta);
  }
}



// Todo número decimal possui também uma representação binária, sendo o seu valor
// apresentado apenas com os dígitos "0" e "1". Por exemplo, o número 12 em base
// decimal possui como representação binária o valor 1100 (pois 1 * 23 + 1 * 22 + 0 * 21 + 0 * 20). // Implemente a função baseBinaria() da classe Binaria.java que recebe
// como parâmetro um número inteiro positivo e devolve a sua representação binária.
// Essa função deve ser recursiva.

// Caso 1:
// Parâmetro de entrada na função: 12
// Resultado retornado: 1100

// Caso 2:
// Parâmetro de entrada na função: 15
// Resultado retornado: 1111

import java.util.Scanner;

public class classeBinaria {

public static String baseBinaria(int valor) {
		
    // Variavel para armazenar o resultado do resto da divisão
    int guardar;
		
    // Se valor for maior que zero será feito:
    if (!(valor < 0)){
			
       // Criei a variavel "Resposta", o StringBuffer é responsavel por adicionar o valor "guardar" em "resposta"
       StringBuffer resposta = new StringBuffer();
       while(valor > 0){
				
	// Guardar armazenara o resto do valor do usuario dividido por 2
	guardar = (valor % 2);
				
	// A variavel "Resposta" Vai armazenar o resto e o resultado de "valor" Será repetido novamente e entrará no laço
	resposta.append(guardar);
	valor = valor / 2;
     }
			
	// Retorne o valor da String "Resposta" ao contrario, "toString()" server para transformar o StringBuffer() em uma String normal
	return resposta.reverse().toString();
    }else {
	return "Digite um valor valido";
    }
}

public static void main(String[] args) {
		
    System.out.println("Digite um numero:" );
    Scanner nome_var_scanner = new Scanner(System.in);
    int valor = nome_var_scanner.nextInt();
		
    String resposta = baseBinaria(valor);
    System.out.println(resposta);

    }
}

			   

// Uma cadeia de caracteres é dita ser um palíndromo quando pode ser lida nos dois
// sentidos com o mesmo resultado, por exemplo, as palavras “ama”, “ovo” e “abcba”.
// Implemente a função isPalindromo() da classe Palavras.java que recebe um
// vetor de caracteres representando uma palavra e retorna true se os caracteres
// representarem um palíndromo, ou false, caso contrário. Essa função deve ser recursiva.

// Caso 1:
// Parâmetro de entrada na função: ama
// Resultado retornado: true

// Caso 2:
// Parâmetro de entrada na função: ovo
// Resultado retornado: true

// Caso 3:
// Parâmetro de entrada na função: professor
// Resultado retornado: false

import java.util.Scanner;

public class palavras {

public static boolean isPalindromo(String palavra){
		
    //String responsavel por guardar a resposta ao contrario 
    String armazenar;
		
    //Se palavra não for vazia
    if(!(palavra == null)){
			
       // Pega StringBuffer resposta e atribui o valor de new StringBuffer
       StringBuffer resposta = new StringBuffer();
			
       // Adiciona "palavra" em "resposta"
       resposta.append(palavra);
			
       // Armazenar vai guardar a resposta reversa e "toString()" server para transformar o StringBuffer() em uma String normal
       armazenar = resposta.reverse().toString();
			
       // Equals compara o TEXTO de palavra com armazenar 
       if(palavra.equals(armazenar)){
	   return true;
       }else {
	   return false;
       }
   } return false;
}

public static void main(String[] args) {

    System.out.println("Digite uma palavra: " );
    Scanner nome_var_scanner = new Scanner(System.in);
    String palavra = nome_var_scanner.next();
			
    boolean resposta = isPalindromo(palavra);
    System.out.println(resposta);
  }
}	   
