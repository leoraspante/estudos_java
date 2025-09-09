package codigos_sessao_5;

import java.util.Scanner;

public class Aula05_SwitchCase {

	public static void main(String[] args) {
		
		// Chamada do comando Scanner atribuído a variável input.
		Scanner input = new Scanner(System.in);
		
		//Mensagem de instrução ao usuário.
		System.out.println("Digite um número: ");
		
		//Definição da variável de entrada por parte do usuário.
		int x = input.nextInt();
		
		//Definição da variável dia.
		String dia;
		
		//Criação da estrutura switch-case.
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		
		//Mensagem de saída.
		System.out.println("Dia da semana " + dia);
		
		//Fechamento do comando Scanner.
		input.close();
		
	}	
}
		
		