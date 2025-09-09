package codigos_sessao_5;

// Importação da biblioteca Locale.
import java.util.Locale;

public class Aula05_CondicionalTernaria {

	public static void main(String[] args) {
		
		// Habilitação da biblioteca Locale.
		Locale.setDefault(Locale.US);
		
		//Definição de uma variável para utilizar como exemplo.
		double preco = 34.5;
		
		//Implementação da condição ternária.
		//Podendo substituir o uso de if/else em casos mais simples como o a seguir.
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		//Mensagem de saída.
		System.out.println(desconto);
		
	}

}
