package codigos_sessao_4;

//Importação da biblioteca Locale.
import java.util.Locale; 

public class Aula04_Variaveis_ExpressoesMatematicas {

	public static void main(String[] args) {
		
		// Chamada da biblioteca Locale.
		Locale.setDefault(Locale.US);
		
		// Definição das variáveis e atribuição de valores.
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		// Expressão matemática simples.
		area = (b+B) / 2.0 * h;
		
		System.out.printf("Àrea total : %.2f.",area);
	
	}

}
