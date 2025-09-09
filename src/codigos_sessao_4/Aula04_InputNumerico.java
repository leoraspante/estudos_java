package codigos_sessao_4;

//Importação da biblioteca Scanner.
import java.util.Scanner; 

public class Aula04_InputNumerico {
	
	public static void main(String[] args) {
		
		//Chamado o comando para permitir a captura de dados, usando como variável a palavra sc.
		Scanner sc = new Scanner(System.in);
		
		// Definição da variável para capturar dados, após o comando scanner digitado.
		int nome = sc.nextInt(); // Atenção ao uso de .nextInt(), trabalhando com variável do tipo int.

		// Mensagem de exibição.
		System.out.println("Você digitou: " + nome);
		
		// Não esquecer de fechar o comando de entrada.
		sc.close();
	}	
	
}
