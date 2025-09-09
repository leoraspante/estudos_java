package codigos_sessao_5;

// Importação da biblioteca Scanner.
import java.util.Scanner;

//Importação da biblioteca Locale.
import java.util.Locale;

public class Aula05_EstruturasCondicionais_2 {
	public static void main(String[] args) {
		
		// Chamada da biblioteca Locale.
		Locale.setDefault(Locale.US);
		
		// Chamada do comando Scanner atribuído a variável input.
		Scanner input = new Scanner(System.in);
		
		//Mensagem de instrução ao usuário.
		System.out.println("Informe quantos minutos você consumiu.");
		System.out.println(" ");
		
		// Variável de entrada.
		int minutos = input.nextInt();
		
		// Definição da variável conta, armazenando o valor do plano.
		double conta = 50.00;
		
		//Definição das condicionais.
		// Consumo acima de 100 minutos.
		if (minutos > 100) {
			// Criação de variável para armazenar o resultado.
			// Feito uso de operador com atribuição cumulativa. (conta +=)
			conta += (minutos - 100) * 2.00;
			System.out.printf("Você consumiu: %d minutos. Valor total: R$ %.2f",minutos, conta);
		}
		// Consumo abaixo de 100 minutos.
		else {
			System.out.printf("Você consumiu: %d minutos. Valor total: R$ %.2f.", minutos, conta);
		}
		
		// Fechamento do comando Scanner.
		input.close();
		
	}
}
