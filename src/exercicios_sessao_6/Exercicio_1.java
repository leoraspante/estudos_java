package exercicios_sessao_6;

// Programa verificador de senha com loop while.
// Senha correta: 2002.

// Importação da biblioteca Scanner.
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		// Acionamento do comando Scanner.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.println("Programa que simula a tentativa de login em um sistema.");
		
		// Definição das variáveis de entrada.
		System.out.print("Informe o seu nome de usuário: ");
		String nome = input.next();
		
		System.out.print("Informe a senha: ");
		int senha = input.nextInt();
		
		// Criação do loop while para checagem da senha.
		while (senha != 2002) { // Senha precisa ser igual a 2002.
			System.out.print("Senha incorreta, tente novamente: "); // Mensagem de instrução ao usuário.
			senha = input.nextInt(); // Nova solicitação de senha.
		}
		
		// Mensagem informando login com sucesso.
		System.out.println("Acesso autorizado !");
		System.out.printf("Bem vindo de volta, %s !%n", nome);
		System.out.println("Fim do programa.");			
		
		// Fechamento do comando Scanner.
		input.close();

	}

}
