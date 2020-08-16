package desafio;

import java.text.NumberFormat;
import java.util.Scanner;

public class Desafio8 {
	
	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		System.out.println("Por favor, digite valor de 'a': ");
		double a = leTeclado.nextDouble();
		System.out.println("Por favor, digite valor de 'b': ");
		double b = leTeclado.nextDouble();
		System.out.println("Por favor, digite valor de 'c': ");
		double c = leTeclado.nextDouble();
		
		double delta;
		
		delta = ((a*b) - (4*a*c));
		double x1 = 0;
		double x2 = 0;
		
		if(delta>=0) {
			x1 = ((b + (Math.sqrt(delta)))/2);
			x2 = ((b - (Math.sqrt(delta)))/2);

				NumberFormat inteiro1 = NumberFormat.getInstance();
				NumberFormat inteiro2 = NumberFormat.getInstance();
				
				System.out.print("x1 = " + inteiro1.format(x1) + "x2 = " + inteiro1.format(x2));
		}

		System.out.print("Inderteminadas");
	}

}
