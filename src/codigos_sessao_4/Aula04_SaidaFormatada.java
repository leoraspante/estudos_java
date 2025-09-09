package codigos_sessao_4;

/**
 * SaidaFormatada.java
 * 
 * Sessão 4 — Introdução à linguagem Java
 * 
 * Este programa demonstra:
 * - Comandos de impressão com System.out.println
 * - Concatenação de variáveis na saída
 * - Formatação de casas decimais usando System.out.printf
 * 
 */

import java.util.Locale; // Importação da biblioteca Locale.

public class Aula04_SaidaFormatada {
	
	public static void main(String[] args) {
		
		// Chamada da biblioteca Locale.
		Locale.setDefault(Locale.US);
		
		// Definição das variáveis e atribuição de valores.
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		// Mensagens de saída formatadas
		System.out.println("Products:");

		System.out.printf("%s, which price is $ %.2f%n%s, which price is $ %.2f%n",product1,price1,product2,price2);
		System.out.println(" ");
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n",age,code,gender);
		System.out.println(" ");
		
		System.out.printf("Measue with eight decimal places: %.8f%nRouded (Three decimal places): %.3f%n", measure,measure);
		
		System.out.printf("US Decimal point %.3f%n",measure);
		
	}

}
