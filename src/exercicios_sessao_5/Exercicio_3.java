package exercicios_sessao_5;

//Importação da biblioteca Scanner.
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de boas vindas ao programa.
		System.out.printf("Bem vindo ao Verificador de Multiplicidade !%n");
		
		// Mensagem solicitando o input do usuário.
		System.out.printf("Digite dois números inteiros qualquer.%n");
		
		// Variáveis recebendo o valor numérico do usuário.	
		int numero_1 = input.nextInt();
		int numero_2 = input.nextInt();
		
		// Implementação das estruturas condicionais - IF/ELSE.
		if (numero_1 % numero_2 == 0 || numero_2 % numero_1 == 0) { // Verifica se o número é múltiplo.
			System.out.printf("O número %d e o número %d: São múltiplos.",numero_1, numero_2);
		} 
		
		// Caso a condição anterior não seja atendida.
		else {
			System.out.printf("O número %d e o número %d: Não são múltiplos.",numero_1, numero_2);
		}

		// Fechamento do comando Scanner.
		input.close();
	}
}
