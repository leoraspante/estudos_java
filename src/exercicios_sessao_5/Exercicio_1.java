package exercicios_sessao_5;

//Importação da biblioteca Scanner.
import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de boas vindas ao programa.
		System.out.printf("Bem vindo ao NumCheck !%n");
		
		// Mensagem solicitando o input do usuário.
		System.out.printf("Digite um número inteiro qualquer.%n");
		
		// Variável recebendo o valor numérico do usuário.	
		int numero = input.nextInt();
		
		// Implementação das estruturas condicionais - IF/ELSE.
		if (numero < 0) { // Verifica se o número é negativo.
			System.out.printf("O número %d é um número negativo.",numero);
		} 
		
		// Caso a condição anterior não seja atendida.
		else {
			System.out.printf("O número %d é um número positivo.",numero);
		}

		// Fechamento do comando Scanner.
		input.close();
	}

}
