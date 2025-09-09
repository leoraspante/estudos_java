package exercicios_sessao_4;

//Importação da biblioteca Scanner.
import java.util.Scanner;

//Importação da biblioteca Locale.
import java.util.Locale;

public class exercicio_5 {
	
	public static void main(String[] args) {
		
		// Chamada do comando Locale.
		Locale.setDefault(Locale.US);
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Variáveis recebendo os valores para o cálculo 1ª remessa.	
		int cod_peca = input.nextInt();
		int qtd_peca = input.nextInt();
		double valor_peca = input.nextDouble();
		
		// Variáveis recebendo os valores para o cálculo 2ª remessa.	
		int cod_peca1 = input.nextInt();
		int qtd_peca1 = input.nextInt();
		double valor_peca1 = input.nextDouble();
				
		// Variável responsável pela realização do cálculo parcial 1.
		double parcial1 = qtd_peca * valor_peca;
		
		// Variável responsável pela realização do cálculo parcial 2.
		double parcial2 = qtd_peca1 * valor_peca1;
		
		// Variável responsável pela realização do cálculo final.
		double resultado = parcial1 + parcial2;
		
		// Impressão do resultado
		System.out.printf("Código das peças escolhidas: %d e %d.%n",cod_peca, cod_peca1);
		System.out.printf("Valor total a pagar: R$ %.2f.",resultado);
		
		// Fechamento do comando Scanner.
		input.close();
	}
}
