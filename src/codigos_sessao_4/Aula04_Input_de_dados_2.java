package codigos_sessao_4;

// Importação da biblioteca Scanner.
import java.util.Scanner;


public class Aula04_Input_de_dados_2 {
	
	public static void main(String[] args) {
		
		//Chamado o comando para permitir a captura de dados, usando como variável a palavra sc.
		Scanner sc = new Scanner(System.in);
				
		// Definição da variável para capturar dados, após o comando scanner digitado.
		int valor = sc.nextInt(); // .nextInt() capturando Integer.
		
		// Comando para capturar a quebra de linha e permitir a execução completa do código
		sc.nextLine();
		
		// Continuação normal do código.
		String texto_1 = sc.nextLine(); // .next() capturando a frase até a quebra de linha.
		String texto_2 = sc.nextLine(); // .next() capturando a frase até a quebra de linha.
		String texto_3 = sc.nextLine(); // .next() capturando a frase até a quebra de linha.
				
		//Mensagens de saída.
		System.out.println("Valores digitados:");
		System.out.println(" ");
		
		System.out.println(valor);
		System.out.println(texto_1);
		System.out.println(texto_2);
		System.out.println(texto_3);
		
				
		// Não esquecer de fechar o comando de entrada.
		sc.close();
	}

}
