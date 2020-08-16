package desafio;

import javax.swing.JOptionPane;

public class Desafio3 {
	
	public static void main(String[] args) {
		contaLetra();
	}
		static public void contaLetra() {
			String frase = JOptionPane.showInputDialog("Por favor, digite uma frase:");
			int qdeLetras = 0;
			
			for(int x = 0; x<frase.length();x++) {
				char ch = frase.charAt(x);
				String frase2 = String.valueOf(ch);
				
				if(frase2.equalsIgnoreCase("a")){
					qdeLetras = qdeLetras + 1;
					
				}
				
			}
			System.out.println(frase);
			System.out.print("A quantidade de letras A é: " + qdeLetras);
	}

}
