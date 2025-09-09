package exercicios_sessao_4;

//Importação da biblioteca Scanner.
import java.util.Scanner;

//Importação da biblioteca Locale.
import java.util.Locale;

public class exercicio_4 {
	
	public static void main(String[] args) {
		
		// Chamada do comando Locale.
		Locale.setDefault(Locale.US);
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Variáveis recebendo os valores para o cálculo.	
		double num_funcionario = input.nextDouble();
		double horas_trabalhadas = input.nextDouble();
		double valor_hora = input.nextDouble();
				
		// Variável responsável pela realização do cálculo.
		double resultado = horas_trabalhadas * valor_hora;
		
		// Impressão do resultado
		System.out.printf("Número do funcionário = %.0f.%n", num_funcionario);
		System.out.printf("Salário a receber = U$ %.2f.%n",resultado);
		
		// Fechamento do comando Scanner.
		input.close();
	}

}
