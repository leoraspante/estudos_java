package exercicios_sessao_4;

//Importação da biblioteca Scanner.
import java.util.Scanner;

public class exercicio_3 {
	
	public static void main(String[] args) {
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Variáveis recebendo os valores para o cálculo.	
		int valor_1 = input.nextInt();
		int valor_2 = input.nextInt();
		int valor_3 = input.nextInt();
		int valor_4 = input.nextInt();
				
		// Variável responsável pela realização do cálculo.
		int resultado = (valor_1 * valor_2) - valor_3 * valor_4;
		
		// Impressão do resultado
		System.out.printf("A diferença é igual a: %d.%n",resultado);
		
		// Fechamento do comando Scanner.
		input.close();
	}

}
