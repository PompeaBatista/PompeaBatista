package desafio;

import javax.swing.JOptionPane;

public class Desafio6 {

	public static void main(String[] args) {
		medePalavras();

	}
	
	public static void medePalavras(){
		String frase = JOptionPane.showInputDialog("Por favor, digite uma frase:");
		int tamPalavras = 0;

		for(int x = 0; x<frase.length();x++) {
			char ch = frase.charAt(x);
			String frase2 = String.valueOf(ch);

			if(frase2.equalsIgnoreCase(" ")){
				tamPalavras = tamPalavras + 1;

			}

		}
		System.out.println(frase);
		System.out.print("A quantidade de palavras da frase  é: " + tamPalavras);

	}

}
