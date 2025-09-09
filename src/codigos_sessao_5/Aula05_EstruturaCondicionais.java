package codigos_sessao_5;

//Importação da biblioteca Scanner.
import java.util.Scanner;

public class Aula05_EstruturaCondicionais {
	
	public static void main(String[] args) {
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem solicitando ao usuário informar a hora.
		System.out.println("Informe a hora: ");
		
		// Variáveis recebendo o valor de hora do usuário.	
		int hora = input.nextInt();
		
		// Implementação das estruturas condicionais - IF/ELSE.
		if (hora < 12) { // Se hora for menor que 12.
			System.out.println("Bom dia");
		}
		
		// Se hora for maior que 12.
		else  { 
			System.out.println("Boa Tarde");
		}

		// Fechamento do comando Scanner.
		input.close();
	}
}
