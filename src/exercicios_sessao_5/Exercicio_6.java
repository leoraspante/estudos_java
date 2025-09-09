package exercicios_sessao_5;

//Importação da biblioteca Scanner.
import java.util.Scanner;

//Importação da biblioteca Locale.
import java.util.Locale;

public class Exercicio_6 {

	public static void main(String[] args) {
		// Chamada da biblioteca Locale.
		Locale.setDefault(Locale.US);
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.printf("Identificador de intervalo.%n");
		
		
		// Mensagem solicitando o input do usuário.
		System.out.printf("Informe um valor desejado.%n");
		
		// Variáveis recebendo o valor numérico do usuário.	
		double valor = input.nextDouble();
		
		// Implementação das estruturas condicionais - IF/ELSE.
		// Intervalo [0,25].
		if (valor >= 0 && valor <= 25) {
			System.out.printf("O valor digitado %.2f está entre o intervalo: [0,25].%n",valor);
		} 
		// Intervalo (25,50].
		else if (valor > 25 && valor <= 50) {
			System.out.printf("O valor digitado %.2f está entre o intervalo: (25,50].%n",valor);
		}
		// Intervalo (50,75].
		else if(valor > 50 && valor <= 75) {
			System.out.printf("O valor digitado %.2f está entre o intervalo: (50,75].%n",valor);
		}	
		// Intervalo (75,100].
		else if(valor > 75 && valor <= 100) {
			System.out.printf("O valor digitado %.2f está entre o intervalo: (75,100].%n",valor);
		}	
		// Fora de intervalo.
		else {
			System.out.printf("O valor digitado %.2f está fora do intervalo.%n",valor);
		}
								
		// Fechamento do comando Scanner.
		input.close();
	}
}
