/* Código onde o usuário informa quantas iterações devem ocorrer.
Definina a quantidade de iterações o usuário informa três valores reais, e tais valores são verificados.
É realizado um cálculo de média entre os três valores, onde cada valor possui um peso diferente em relação ao outro.*/

package exercicios_sessao_6;

// Importação da classe Scanner.
import java.util.Scanner;

// Importação da classe Locale.
import java.util.Locale;

public class Exercicio_6 {

	public static void main(String[] args) {
		// Locale utilizado para permitir o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);		
		
		// Scanner utilizado para leitura de dados via console.
		Scanner input = new Scanner(System.in);
				
		// Definição de variável para limitar a quantidade de testes a serem realizados.
		System.out.printf("Informe quantos testes deseja realizar: ");
		int qtd_testes = input.nextInt();
		System.out.println(); // Espaçamento para melhor legibilidade.
		
		// Criação do loop de verificação.
		for (int i = 0 ;  i < qtd_testes ; i ++) {
			System.out.printf("Informe o primeiro valor: ");
			double valor_x = input.nextDouble();
			System.out.printf("Informe o segundo valor: ");
			double valor_y = input.nextDouble();
			System.out.printf("Informe o terceiro valor: ");
			double valor_z = input.nextDouble();
			double media = (valor_x*2 + valor_y*3 + valor_z*5) / 10.0; // Lógica de cálculo da média.
			System.out.println();
			System.out.printf("Teste nº: %d%n", i + 1);
			System.out.printf("Media dos valores: %.1f%n", media);
			System.out.println("----------------------------");
			System.out.println();
		}
		// Mensagem de saída.
		System.out.println("Todos os testes foram concluídos.");
		System.out.println("Programa encerrado.");
		
		// Fechamento do comando Scanner.
		input.close();
	}
}
