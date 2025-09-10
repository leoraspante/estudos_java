package codigos_sessao_6;

// Programa onde o usuário informa números ATÉ um determinado valor.

// Importação da bilbioteca Scanner.
import java.util.Scanner;

public class Aula06_EstruturaRepetitiva_While {

	public static void main(String[] args) {

		// Chamada da biblioteca Scanner.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.println("Bem vindo ao acumulador de valores");
		System.out.println("Para encerrar digite o número: 0.");
		
		// Variável recebendo os dados do usuário.
		System.out.print("Informe um valor númerico inteiro: ");
		int numero = input.nextInt();
		
		// Variável acumulando valores.
		int acumulador = 0;
		

		// Criação do loop While, enquanto o valor digitado for diferente de 0.
		while (numero != 0) {
			System.out.println(numero); // Exibe o número digitado.
			acumulador += numero; // Acumula os valores digitados.
			System.out.print("Informe um valor númerico inteiro: "); // Continua solicitando o input do usuário enquanto while não for atendido.
			numero = input.nextInt();
		}
		
		// Mensagem de saída informando a soma dos valores digitados pelo usuário.
		System.out.println("Valor total digitado:");
		System.out.println(acumulador);
		
		// Mensagem de encerramento do programa.
		System.out.println("Obrigado por utilizar nosso programa, até breve.");
		
		// Fechamento do comando Scanner.
		input.close();

	}

}
