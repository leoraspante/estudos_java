// Como exemplo, vamos desenvolver uma função capaz de retornar o maior valor dentre 3 números inteiros.

package codigos_sessao_7;

// Importação da classe Scanner.
import java.util.Scanner;

public class Criando_Funcoes {

	public static void main(String[] args) {

		// Declaração de um Scanner para permitir a captura de dados via console.
		Scanner input = new Scanner(System.in);
		
		// Declaração de variáveis para receber e armazenar os dados.
		System.out.println("Informe os valores inteiros:");
		System.out.printf("Valor de X: ");
		int x = input.nextInt();
		System.out.printf("Valor de Y: ");
		int y = input.nextInt();
		System.out.printf("Valor de Z: ");
		int z = input.nextInt();
		
		/* Normalmente esse tipo de verificação poderia ser realizada com um If/Else.
		 * Contudo com o objetivo de reutilização do código e facilidade de implementação.
		 * Vamos criar a função apenas uma única vez.
		 * Podendo a mesma ser reaproveitada quantas vezes forem necessárias.
		 * Sem a necessidade de reescrever toda vez o If/Else
		 */
		
		// Utilização da função max para a verificação do resultado.
		int higher = max(x,y,z);
		
		// Utilização da função showResult para exibição personalizada em console.
		showResult(higher);
		
		// Fechamento da classe Scanner.
		input.close();

	}
	// Criação da função max.
	
	/* A função deverá ser criada neste local.
	 * Onde o int se refere ao tipo de dado que a função retornará.
	 * Onde max se refere ao nome definido para a função.
	 * Os valores entre parênteses "x y z" serão as variáveis de alimentação da função.
	 * Dentro das chaves, definimos uma variável local para armazenar o resultado das verificações.
	 * Seguimos com a implementação da verificação com If/Else normalmente, armazenando o resultado na variável auxiliar.
	 * Ao conluírmos as verificações solicitamos o return, onde a variável irá retornar o resultado obtido para a variável auxiliar.
	 * Permitindo o uso deste valor posteriormente.*/
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	// Criação da função showResult.
	
	/* Como o tipo de dado retornado pela função será utilizado apenas para a exibição em console, não havendo reaproveitamento, definimos seu tipo como void.
	 * Uma vez que a função receberá um dado do tipo int, para realizar o processamento.
	 * Definimos como sendo do tipo int a variável de alimentação da função.
	 * A função não possui return devido ao seu tipo ser void, portanto sem retorno.*/
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
	
	
	
	
	
	
	
}
