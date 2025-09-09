package exercicios_sessao_4;

//Importação da biblioteca Scanner.
import java.util.Scanner;

//Importação da biblioteca Locale.
import java.util.Locale;

public class exercicio_2 {
	
	public static void main(String[] args) {
		
		// Chamada do comando Locale.
		Locale.setDefault(Locale.US);
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Variável que recebe o valor da área.		
		double valor_1 = input.nextDouble();
		
		// Variável contendo o valor de pi.
		double pi = 3.14159;
		
		// Variável que realiza a potenciação do valor recebido em área.
		double pow = Math.pow(valor_1, 2);
		
		// Variável responsável pela realização do cálculo.
		double resultado = pow * pi;
		
		// Impressão do resultado
		System.out.printf("O raio do círculo é igual à: %.4f.%n", resultado);
		
		// Fechamento do comando Scanner.
		input.close();
	}

}
