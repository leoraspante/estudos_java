package codigos_sessao_6;

// Sistema simples para cálculo do valor de um terreno por metro quadrado.

// Importação da biblioteca Locale.
import java.util.Locale;

// Importação da biblioteca Scanner.
import java.util.Scanner;

public class Aula06_Debug {

	public static void main(String[] args) {

		// Chamada da biblioteca Locale.
		Locale.setDefault(Locale.US);
		
		// Chamada da biblioteca Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Mensagem de aprensentação do programa.
		System.out.println("🛠️ Calculadora de Terreno");
		System.out.println("--------------------------");
				
		// Definição das variáveis de entrada de dados com instruções de input.
		System.out.print("Digite a lagura do terreno (em metros): ");
		double largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno (em metros): ");
		double comprimento = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado (em reais): ");
		double metroQuadrado = sc.nextDouble();
		
		// Realização do cálculo.
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		// Mensagem de saída.
		System.out.printf("Área total do terreno = %.2f%n", area);
		System.out.printf("Preço do terreno = R$ %.2f%n", preco);
		
		// Mensagem de encerramento.
		System.out.println("✅ Cálculo concluído. Obrigado por usar o sistema!");
		
		// Fechamento do comando Scanner.
		sc.close();

	}

}
