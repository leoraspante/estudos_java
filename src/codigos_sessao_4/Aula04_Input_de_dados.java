package codigos_sessao_4;

// Importação da bibliotca Scanner.
import java.util.Scanner;

public class Aula04_Input_de_dados {

	public static void main(String[] args) {
		
		// Comando para permitir a captura de dados, utilizando como variável a palavra sc.
		Scanner sc = new Scanner(System.in);
		
		// Definição da variável para capturar dados, após o comando Scanner digitado.
		String nome = sc.nextLine(); // O comando .nextLine() permite a captura de toda a frase.
		
		// Mensagem de saída.
		System.out.println("Você digitou: " + nome);
		
		// Fechamento do comando Scanner.
		sc.close();

	}

}
