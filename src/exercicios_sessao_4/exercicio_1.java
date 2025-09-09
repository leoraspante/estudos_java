package exercicios_sessao_4;

// Importação da biblioteca Scanner.
import java.util.Scanner;

public class exercicio_1 {
	
	public static void main(String[] args) {
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Variáveis que recebem os números tipo Int.		
		int valor_1 = input.nextInt();
		int valor_2 = input.nextInt();
		
		// Variável responsável pela realização do cálculo.
		int resultado = valor_1 + valor_2;
		
		// Impressão do resultado
		System.out.printf("A soma de %d + %d é igual à: %d.%n",valor_1, valor_2, resultado);
		
		// Fechamento do comando Scanner.
		input.close();
	}
}
