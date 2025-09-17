// Exemplo de programa que realiza a conversão de escala Celsius para Farenheit.

package codigos_sessao_6;

// Importação da classe Scanner.
import java.util.Scanner;

// Importação da classe Locale.
import java.util.Locale;

public class Aula_06_Do_While {

	public static void main(String[] args) {
		
		// Habilitação da classe Locale, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
				
		// Scanner permitindo a captura de dados via console.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.println("Conversor de Escalas");
		System.out.println("Celsius para Farenheit");
		System.out.println();
				
		// Declaração de variável para permitir a continuidade do programa.
		String continuar;
		
		// Uso do loop Do-While para a verificação. Note a entrada de dados já "dentro" do loop Do-While. Indicando a execução imediata do código.
		do {
			// Bloco referente a entrada de dados por parte do usuário.
			System.out.printf("Informe o valor em Celsius: ");
			double valorCelsius = input.nextDouble();
			
			// Espaçamento para melhor legibilidade.
			System.out.println();
			
			// Fórmula usada para a conversão entre as escalas.
			double resultado = valorCelsius * 1.8 + 32;
			
			// Mensagem informando a sáida dos dados convertidos.
			System.out.println("Resultado:");
			System.out.printf("%.2f ºF%n", resultado);
			
			// Bloco responsável pela continuidade da execução do programa.
			System.out.printf("Deseja continuar? S ou N: ");
			continuar = input.next();
			
			// Espaçamento para melhor legibilidade.
			System.out.println();
			
			// Condição cque permite a continuidade do programa. "IgnoreCase" utilizado para ler maiúsculas ou minúsculas.
		} while (continuar.equalsIgnoreCase("S"));
		
		// Mensagem de encerramento do programa.
		System.out.println("----------------------------");
		System.out.println("Fim do programa.");
		
		// Fechamento da classe Scanner.
		input.close();
	}

}
