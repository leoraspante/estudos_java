/*Código para calcular a fatorial de um determinado valor informado pelo usuário.*/

package exercicios_sessao_6;

// Importação da classe Scanner.
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		// Scaner definido para a captura de dados.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.println("Calculadora Fatorial");
		System.out.println("Informe um inteiro qualquer para calcular seu respectivo fatorial.");
		System.out.println();
		
		// Definição de variável para a captura de dados.
		System.out.printf("Digite um valor: ");
		int valor_x = input.nextInt();
		
		// Declaração de uma variável para a acumulação de valores.
		int fatorial = 1;
		
		// Criação do loop for.
		if (valor_x == 0) {
			fatorial = 1;
			System.out.printf("Fatorial de: %d é %d%n", valor_x, fatorial);			
		}
		else {
			for (int i = valor_x ; i >= 1 ; i--) {
				fatorial *= i;
			}
			System.out.printf("Fatorial de: %d é %d%n", valor_x, fatorial);
		}

		// Fechamento da classe Scanner.
		input.close();

	}
}
