package exercicios_sessao_6;

// Programa que lê coordenadas X,Y no plano cartesiano.
// A execução é encerrada quando X ou Y for igual a zero.

// Importação da biblioteca Locale.
import java.util.Locale;

// Importação da biblioteca Scanner.
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		// Habilitação da biblioteca Locale, seguida da biblioteca Scanner.
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.println("Bem vindo ao QuadranteFinder.");
		
		// Definição das variáveis de entrada de dados.
		System.out.print("Informe o valor de X: ");
		double valor_x = input.nextDouble();

		System.out.print("Informe o valor de Y: ");
		double valor_y = input.nextDouble();
		
		// Criação do loop while para checagem.
		while (valor_x != 0 && valor_y != 0) {
			
			// Condicional if sera executada sempre que um valor digitado pelo usuário seja diferente de 0.
			if (valor_x > 0 && valor_y > 0) System.out.println("Primeiro Quadrante.");
			
			else if (valor_x < 0 && valor_y > 0) System.out.println("Segundo Quadrante.");
			else if (valor_x < 0 && valor_y < 0) System.out.println("Terceiro Quadrante.");
			else if (valor_x > 0 && valor_y < 0) System.out.println("Quarto Quadrante.");
				
			else System.out.println("Valor inválido.");
			
			// Continua solicitando o input dos valores ao usuário.
			System.out.print("Informe o valor de X: ");
			valor_x = input.nextDouble();

			System.out.print("Informe o valor de Y: ");
			valor_y = input.nextDouble();
		}
		
		// Fora do loop while, mensagem de encerramento.
		System.out.println("Fim do programa.");
	}

}
