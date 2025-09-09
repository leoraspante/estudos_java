package codigos_sessao_5;

//Importação da biblioteca Scanner.
import java.util.Scanner;

public class Aula05_EstruturasCondicionais_1 {

	public static void main(String[] args) {
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem solicitando ao usuário informar a hora.
		System.out.println("Informe a hora: ");
		
		// Variáveis recebendo o valor de hora do usuário.	
		int hora = input.nextInt();
		
		// Implementação das estruturas condicionais - IF/ELSE.
		// Se hora for menor que 12.
		if (hora < 12) { 
			System.out.println("Bom dia");
		}
		
		// Se hora for maior que 12 e menor que 18.
		else if (hora >= 12 && hora <18) {
			System.out.println("Boa Tarde");
		} 
		else {
			System.out.println("Boa noite");
		}

		// Fechamento do comando Scanner.
		input.close();
	}
}
