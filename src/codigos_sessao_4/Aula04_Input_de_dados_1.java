package codigos_sessao_4;

// Importação da biblioteca Scanner.
import java.util.Scanner;


public class Aula04_Input_de_dados_1 {
	
	public static void main(String[] args) {
		
		//Chamado o comando para permitir a captura de dados, usando como variável a palavra sc.
		Scanner sc = new Scanner(System.in);
				
		// Definição da variável para capturar dados, após o comando scanner digitado.
		char valor = sc.next().charAt(0); // Atenção ao uso de .charAt(0), permitindo a captura de somente a letra inicial, index 0.
		
		// Mensagem de saída.
		System.out.println("Você digitou: " + valor);
		
		// Não esquecer de fechar o comando de entrada.
		sc.close();
	}

}
