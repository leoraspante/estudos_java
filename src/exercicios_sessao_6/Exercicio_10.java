/* Programa em que o usuário informa um determinado valor_x e com este valor, operações matemáticas são realizadas. */

package exercicios_sessao_6;

// Importação da classe Scanner.
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		// Scaner definido para a captura de dados.
		Scanner input = new Scanner(System.in);
		
		// Declaração de variável para a entrada de dados.
		System.out.printf("Informe o valor inteiro desejado: ");
		int valor_x = input.nextInt();
		
		// Mensagens para um melhor layout.
		System.out.println("----------------------------");
		System.out.println("Resultado:");
		
		// Criação do loop for para iterar conforme entrada "valor_x" usuário.
		for (int i = 1 ; i <= valor_x ; i++ ) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		
		// Mensagem de encerramento.
		System.out.println("----------------------------");
		System.out.println("Fim do programa.");
		
		// Fechamento da classe Scanner.
		input.close();
	}

}
