/* Código onde o usuário informa quantas iterações devem ocorrer.
Definina a quantidade de iterações o usuário informa dois valores reais, e tais valores são verificados.
É realizado um cálculo de divisão entre os valores, e caso o divisor seja igual a zero, uma mensagem de advertência é exibida. */

package exercicios_sessao_6;

//Importação da classe Locale.
import java.util.Locale;

// Importação da classe Scanner.
import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		// Locale utilizado para permitir o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Scanner utilizado para leitura de dados via console.
		Scanner input = new Scanner(System.in);
		
		// Definição de variável para limitar a quantidade de testes a serem realizados.
		System.out.printf("Informe quantos testes deseja realizar: ");
		int qtd_testes = input.nextInt();
		System.out.println(); // Espaçamento para melhor legibilidade.
		
		//Definição de variável para armazenar o resultado.
		double resultado = 0;
		
		// Criação do loop for, definindo quantas vezes o trecho a seguir será executado.
		for (int i = 0 ;  i < qtd_testes ; i ++) { // Execução limitada ao input qtd_testes.
			
			// Mensagens solicitando as entradas de dados do usuário.
			System.out.printf("Informe o primeiro valor: ");
			double valor_x = input.nextDouble();
			System.out.printf("Informe o segundo valor: ");
			double valor_y = input.nextDouble();
			
			// Mensagem informando qual o ciclo de operação em execução.
			System.out.printf("Teste nº: %d%n", i + 1);
			
			// Condicional que impede a divisão por zero.
			if (valor_y == 0) {
				System.out.println("Erro: Não é possível dividir por zero.");
				System.out.println("----------------------------");
			}
			else { // Condicional que realiza a divisão, com exibição dos resultados.
				resultado = valor_x / valor_y;
				System.out.printf("Resultado: %.2f%n", resultado);
				System.out.println("----------------------------");
			}
		}		
		// Mensagem de encerramento.
		System.out.println("Operações concluídas.");
		System.out.println("Fim do programa.");
		
		// Fechamento do comando Scanner.
		input.close();		
	}
}
