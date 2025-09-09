package exercicios_sessao_5;

//Importação da biblioteca Scanner.
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de boas vindas ao programa.
		System.out.printf("Tempo de jogatina !%n");
		
		// Mensagem solicitando o input do usuário.
		System.out.printf("Digite o horário de início e término.%n");
		
		// Variáveis recebendo o valor numérico do usuário.	
		int hr_inicial = input.nextInt();
		int hr_final = input.nextInt();
		
		//Variável para armazenar o resultado do cálculo.
		int resultado;
		
		// Implementação das estruturas condicionais - IF/ELSE.
		if (hr_inicial >= hr_final) {
			resultado = (24 - hr_inicial) + hr_final;
			System.out.printf("Você jogou por: %d hora(s).%n",resultado);					
		}
		
		// Caso a condição anterior não seja atendida.
		else {
			resultado = hr_final - hr_inicial ;
			System.out.printf("Você jogou por: %d hora(s).%n",resultado);
		}

		// Fechamento do comando Scanner.
		input.close();
	}
}
