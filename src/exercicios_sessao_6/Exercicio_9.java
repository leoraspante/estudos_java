// Código que verifica todos os divisores de um determinado valor informado pelo usuário.

package exercicios_sessao_6;

// Importação da classe Scanner.
import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		// Scaner definido para a captura de dados.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.println("Programa que informa todos os dividores de um número inteiro");
		System.out.println();
		
		// Declaração de variável para a entrada de dados.
		System.out.printf("Informe o valor inteiro desejado: ");
		int valor_x = input.nextInt();
		
		// Criação do loop for.
		for (int i = 1 ; i <= valor_x ; i++) { 
			if (valor_x % i == 0) {
				System.out.printf("Divisores de %d: %d%n", valor_x, i);
			}
		}
		// Mensagem de encerramento.
		System.out.println("----------------------------");
		System.out.println("Fim do programa.");
		// Fechamento da classe Scanner.
		input.close();
	}

}
