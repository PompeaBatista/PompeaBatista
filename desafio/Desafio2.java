package desafio;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		System.out.println("Por favor, digite o número: ");

		double num = leTeclado.nextDouble();
		double resultado = 0;



		for(int x = 0; x < num; x++) {
			resultado += (num - x)/(x + 1);

		}

		System.out.print(resultado + " ");
	}

}

