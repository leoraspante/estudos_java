package exercicios_sessao_4;

//Importação da biblioteca Scanner.
import java.util.Scanner;

//Importação da biblioteca Locale.
import java.util.Locale;

public class exercicio_6 {
	
	public static void main(String[] args) {
		
		// Chamada do comando Locale.
		Locale.setDefault(Locale.US);
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Variáveis recebendo os valores para a realização dos cálculos.	
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		// Variável responsável pelo cálculo de área do triângulo.
		double triangulo = (A * C) / 2;
		
		// Bloco responsável pelo cálculo de área do círculo.
		double pi = 3.14159;
		double potencia = Math.pow(C, 2);
		double circulo = pi * potencia;
		
		// Variável responsável pelo cálculo de área do trapézio.
		double trapezio = ((A + B) * C) / 2;
		
		// Variável responsável pelo cálculo do quadrado.
		double quadrado = Math.pow(B, 2);
		
		// Variável responsável pelo cálculo do retângulo.
		double retangulo = A * B;
		
		// Impressão dos resultados.
		System.out.printf("Área do triângulo: %.3f.%n",triangulo);
		System.out.printf("Área do círculo: %.3f.%n",circulo);
		System.out.printf("Área do trapézio: %.3f.%n",trapezio);
		System.out.printf("Área do quadrado: %.3f.%n",quadrado);
		System.out.printf("Área do retângulo: %.3f.%n",retangulo);
				
		// Fechamento do comando Scanner.
		input.close();
	}

}
