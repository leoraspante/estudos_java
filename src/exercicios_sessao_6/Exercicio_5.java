/* Código onde o usuário informa quantas iterações devem ocorrer.
Definina a quantidade de iterações o usuário informa um valor inteiro, e tal valor é verificado.
A quantidade de valores que atendam ao filtro if, é armazenada em uma variável contadora "in".
A quantidade de valores que não atendem a condição if são armazenados em variáveis contadoras "out".*/

package exercicios_sessao_6;

// Importação da classe Scanner.
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		// Scanner utilizado para leitura de dados via console.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.println("Verificador de intervalo");
		System.out.println("Os valores entre 10 e 20 serão selecionados.");
		System.out.println(); // Espaçamento para legibilidade.
		
		// Definição de variável para limitar a quantidade de dados a serem inseridos.
		System.out.printf("Informe quantos valores deseja verificar: ");
		int limite_x = input.nextInt();
		System.out.println(); // Espaçamento para melhor legibilidade.
		
		// Declaração de variáveis acumuladoras.
		int in = 0;
		int out = 0;
			
		// Criação do loop for para a verificação.
		for (int i = 0 ; i < limite_x ; i ++ ) {
			System.out.println("Digite um número inteiro qualquer:");
			int valor_x = input.nextInt();
			if ( valor_x >= 10 && valor_x <= 20) // Condição definida.
				in ++; // Condição verdadeira.
			else
				out ++; // Condição falsa.
		}
		// Mensagens de saída.
		System.out.println(); // Espaçamento para melhor legibilidade.
		System.out.printf("In: %d%n", in);
		System.out.printf("Out: %d%n", out);
		
		// Fechamento da classe Scanner.
		input.close();
	}
}
