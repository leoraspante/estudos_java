// Código simples para a verificação de valores ímpares em um intervalo.

package exercicios_sessao_6;

// Importação da classe Scanner.
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// Scanner utilizado para leitura de dados via console.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação.
		System.out.println("Verificador de ímpares");
		System.out.println(); // Espaçamento.
		
		// Definição de variáveis para a entrada de dados.
		System.out.printf("Informe um número inteiro qualquer: ");
		int valor_x = input.nextInt();
		
		// Mensagem de saída.
		System.out.println("Resultado:");
		
		// Definição de loop for para verificação de intervalo.
		for (int i = 1 ; i <= valor_x ; i ++ ) {
			if (i % 2 != 0) // Checagem dos valores ímpares.
				System.out.printf("Número %d: %n",i); // Impressão dos resultados.
		}
		
		// Fechamento do Scanner para leitura de dados via console.
		input.close();
	}

}
