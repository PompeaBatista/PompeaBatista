package desafio;

import javax.swing.JOptionPane;

public class Desafio4 {

	public static void main(String[] args) {
		contaPalavras();

	}

	public static void contaPalavras(){
		String frase = JOptionPane.showInputDialog("Por favor, digite uma frase:");
		int qdePalavras = 0;

		for(int x = 0; x<frase.length();x++) {
			char ch = frase.charAt(x);
			String frase2 = String.valueOf(ch);

			if(frase2.equalsIgnoreCase(" ")){
				qdePalavras = qdePalavras + 1;

			}

		}
		System.out.println(frase);
		System.out.print("A quantidade de palavras da frase  é: " + (qdePalavras+1));

	}
}