// Exemplo prático da operação Split

package codigos_sessao_7;

public class Operacao_Split {

	public static void main(String[] args) {
		
		// String criada como exemplo.
		String s = "potato apple lemon";
		
		// Operação Split aplicada, tendo como referência o espaço.
		String[] vect = s.split(" ");
		
		// Strings criadas para armazenar os valores obtidos da operação Split.
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		// Saída do console.
		System.out.println("String original: " + s);
		System.out.println();
		System.out.println("Resultado após split:");
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		System.out.println();
		System.out.println("Fim da execução");
	}
}
