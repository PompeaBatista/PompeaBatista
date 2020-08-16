package desafio;

public class Desafio7 {

	public static void main(String[] args) {
		calculaFatorial();
		System.out.println();

	}
	public static void calculaFatorial() {
		int [] numerosPares = new int[50];
		for(int x = 0; x<=numerosPares.length; x++) {
			int i = 0;
			numerosPares[x] = i;
			i += 2;
			
			int [] numerosImpares = new int [50];
			for(int y = 0; y<=numerosImpares.length; y++) {
				int j = 1;
				numerosImpares[y]= j;
				j += 2;

				for(int z = 0; z>=5; z++) {
					if(z == 1) {

						System.out.println(z);;
					}
					
					System.out.println();
				}

			}
		}

	}
}




