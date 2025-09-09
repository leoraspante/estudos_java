package codigos_sessao_4;

public class Aula04_FuncoesMatematicas {
	
	public static void main(String[] args) {
		
		// Definição de variáveis para simulação de cálculos.
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		
		// Definição de variáveis para receber os resultados.
		double A, B, C; // Nota: Tipo double atribuído a três variáveis de uma única vez.
		
		// Aplicação da função de raiz quadrada.
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		// Resultados das raízes realizadas acima.
		System.out.println("Resultado das raízes:");
		System.out.println(" ");
		
		System.out.printf("Raiz quadrada de :%.2f é igual a: %f.%n", x, A);
		System.out.printf("Raiz quadrada de :%.2f é igual a: %f.%n", y, B);
		System.out.printf("Raiz quadrada de :25,00 é igual a: %f.%n", C);
		
		// Apenas uma quebra de linha para facilitar a leitura.
		System.out.println(" ");
		
		// Aplicação da função de potenciação.
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		
		// Resultados das potências realizadas acima.
		System.out.println("Resultado das potências:");
		System.out.println(" ");
		
		System.out.printf("%.2f elevado à potência de :%.2f é igual a: %f.%n", x, y, A);
		System.out.printf("%.2f elevado à potência de :2,00 é igual a: %f.%n", x, B);
		System.out.printf("5,00 elevado à potência de :2,00 é igual a: %f.%n", C);
		
		// Apenas uma quebra de linha para facilitar a leitura.
		System.out.println(" ");
		
		// Aplicação da função ABS.		
		A = Math.abs(y);
		B = Math.abs(z);
		
		
		// Resultados da função ABS.
		System.out.println("Resultado da função ABS:");
		System.out.println(" ");
		
		System.out.printf("A função ABS de: %.2f é igual a: %f.%n", y, A);
		System.out.printf("A função ABS de: %.2f é igual a: %f.%n", z, B);
		
		
	}

}
