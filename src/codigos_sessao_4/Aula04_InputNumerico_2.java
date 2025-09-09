package codigos_sessao_4;

//Importação da biblioteca Scanner.
import java.util.Scanner;

//Importação da biblioteca Locale.
import java.util.Locale; 

public class Aula04_InputNumerico_2 {

	public static void main(String[] args) {
		
		// Chamado o comando para alteração de localidade para US.
		Locale.setDefault(Locale.US);
				
		//Chamado o comando para permitir a captura de dados, usando como variável a palavra sc.
		Scanner sc = new Scanner(System.in);
								
		// Definição da variável para capturar dados, após o comando scanner digitado.
		double valor = sc.nextDouble(); // Atenção ao uso de .nextDouble(), trabalhando com variável do tipo Double, permitindo a captura de ponto flutuante.
		
		// Mensagem de saída.
		System.out.println("Você digitou: " + valor);
				
		// Não esquecer de fechar o comando de entrada.
		sc.close();
	}

}
