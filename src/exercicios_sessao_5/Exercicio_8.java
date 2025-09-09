package exercicios_sessao_5;

//Importação da biblioteca Scanner.
import java.util.Scanner;

//Importação da biblioteca Locale.
import java.util.Locale;

public class Exercicio_8 {

	public static void main(String[] args) {
		// Chamada da biblioteca Locale.
		Locale.setDefault(Locale.US);
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.printf("Cálculo de Imposto de Renda.%n");
		
		// Print personalizado com os valores referenciais.
		System.out.printf("%nRenda Salarial               Imposto de Renda%n");
		System.out.println("     Faixa                       Tributação");
		System.out.println("De R$ 0.00 até R$ 2000.00          Isento");
		System.out.println("De R$ 2000.01 até R$ 3000.00         8%");
		System.out.println("De R$ 3000.01 até R$ 4500.00         18%");
		System.out.println("Acima de R$ 4500.00                  28%");
		
		// Mensagem solicitando o input do usuário.
		System.out.printf("%nInforme o valor do salário.%n");
		
		// Variáveis recebendo o salário do usuário.	
		double salario = input.nextDouble();
		System.out.println(" ");

		
		// Condicionais IF/ELSE.
		// Isento de impostos.
		if (salario <= 2000.00) {
			System.out.printf("Você recebe %.2f. Isento de impostos", salario);
		}
		// Faixa de 8%
		else if (salario <= 3000.00) {
			double imposto = (salario - 2000.00)* 0.08;
			System.out.printf("Você recebe R$ %.2f. Total a contribuir: R$ %.2f", salario, imposto);
		}
		// Faixa de 18%.
		else if (salario <= 4500.00) {
			double imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
			System.out.printf("Você recebe R$ %.2f. Total a contribuir: R$ %.2f", salario, imposto );
		}
		// Faixa de 28%.
		else {
			double imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;
			System.out.printf("Você recebe R$ %.2f. Total a contribuir: R$ %.2f", salario, imposto);
		}
					
		// Fechamento do comando Scanner.
		input.close();
	}
}
