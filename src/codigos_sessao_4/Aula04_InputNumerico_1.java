package codigos_sessao_4;

// Importação da biblioteca Scanner.
import java.util.Scanner;

public class Aula04_InputNumerico_1 {
	
	public static void main(String[] args) {
		
		//Chamado o comando para permitir a captura de dados, usando como variável a palavra sc.
		Scanner sc = new Scanner(System.in);
				
		// Definição da variável para capturar dados, após o comando scanner digitado.
		double valor = sc.nextDouble(); // Atenção ao uso de .nextDouble(), trabalhando com variável do tipo Double, permitindo a captura de ponto flutuante.

		// Mensagem de exibição.
		System.out.println("Você digitou: " + valor);
		
		// Não esquecer de fechar o comando de entrada.
		sc.close();
	}
		
}
