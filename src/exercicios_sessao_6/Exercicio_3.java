package exercicios_sessao_6;

// Programa para verificar qual o combustível mais vendido em um posto de gasolina.

// Importação da biblioteca Scanner.
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		// Chamada da biblioteca Scanner, com definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.println("Controle de abastecimento");
		System.out.println(" ");
				
		// Definição das variáveis acumulando o tipo de combustível.
		int gasolina = 0;
		int etanol = 0;
		int diesel = 0;
		
		// Definição das variáveis de entrada de dados.
		System.out.printf("Informe o tipo do combustível desejado.%n1-Etanol / 2-Gasolina / 3-Diesel / 4-Fim: ");
		int tipo_combustivel = input.nextInt();
		System.out.println(" ");
		
		// Implementado while, para garantir a entrada correta de dados.
		while (tipo_combustivel != 4) {
			// Enquanto o valor digitado não for 4 o loop continua.
			System.out.printf("Informe o tipo do combustível desejado.%n1-Etanol / 2-Gasolina / 3-Diesel / 4-Fim: %n");
			tipo_combustivel = input.nextInt();
			System.out.println(" ");
			
			// Condicionais if/else verificando o tipo de combustível e acumulando em seus respectivos contadores.
			if (tipo_combustivel == 1) etanol += 1;
			else if (tipo_combustivel == 2) gasolina += 1;
			else if (tipo_combustivel == 3) diesel += 1;			
		}
		
		// Mensagens de saída fora do loop.
		System.out.println("Fim do expediente, muito obrigado.");
		System.out.println(" ");
		System.out.println("Total abastecido.");
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Etanol: %d%n", etanol);
		System.out.printf("Diesel: %d%n", diesel);
		
		// Fechamento do comando Scanner.
		input.close();

	}

}
