package exercicios_sessao_5;

//Importação da biblioteca Scanner.
import java.util.Scanner;

//Importação da biblioteca Locale.
import java.util.Locale;

public class Exercicio_5 {

public static void main(String[] args) {
		
		// Chamada da biblioteca Locale padrão US.
		Locale.setDefault(Locale.US);		
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.printf("             CARDÁPIO%n%n");
		
		// Mensagem personalizada exibindo o cardápio.
		System.out.println("CÓDIGO     ESPECIFICAÇÃO     PREÇO");
		System.out.println("  1        Cachorro Quente   R$ 4.00");
		System.out.println("  2        X-Salada          R$ 4.50");
		System.out.println("  3        X-Bacon           R$ 5.00");
		System.out.println("  4        Torrada simples   R$ 2.00");
		System.out.println("  5        Refrigerante      R$ 1.50");
		
		// Mensagem solicitando o input do usuário.
		System.out.printf("%nInforme o código do produto desejado e a quantidade.%n");
		
		// Variáveis armazenando os valores dos produtos.
		double cod_1 = 4.00; // Preço cachorro quente.
		double cod_2 = 4.50; // Preço x-salada.
		double cod_3 = 5.00; // Preço x-bacon.
		double cod_4 = 2.00; // Preço torrada simples.
		double cod_5 = 1.50; // Preço refrigerante.
						
		// Variáveis recebendo o valor numérico do usuário.	
		int cod_produto = input.nextInt();
		int qtd = input.nextInt();
		
		// Implementação das estruturas condicionais - IF/ELSE.
		// Condição do cachorro quente.
		if (cod_produto == 1) {
			double valor_compra = qtd * cod_1;
			System.out.printf("Valor total: R$ %.2f.%n",valor_compra);
		} 
		// Condição do x-salada.
		else if (cod_produto == 2) {
			double valor_compra = qtd * cod_2;
			System.out.printf("Valor total: R$ %.2f.%n",valor_compra);
		}
		// Condição do x-bacon.
		else if(cod_produto == 3) {
			double valor_compra = qtd * cod_3;
			System.out.printf("Valor total: R$ %.2f.%n",valor_compra);
		}	
		// Condição da torrada simples.
		else if(cod_produto == 4) {
			double valor_compra = qtd * cod_4;
			System.out.printf("Valor total: R$ %.2f.%n",valor_compra);
		}	
		// Condição do refrigerante.
		else {
			double valor_compra = qtd * cod_5;
			System.out.printf("Valor total: R$ %.2f.%n",valor_compra);
		}
								
		// Fechamento do comando Scanner.
		input.close();
	}
}
