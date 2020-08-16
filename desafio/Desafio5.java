package desafio;

public class Desafio5 {

	public static void main(String[] args) {
		int numero = 5;
		mostraSerieFibo(numero);

	}
	static int mostraSerieFibo(int N) {
		if(N==1 || N==2){
			return 1;

		}else {
			
			return mostraSerieFibo(N-1) + mostraSerieFibo(N-2);

		}
	}
		
		for(int i=1; i <= numero; i++) {
		int numero;
		System.out.println(mostraSerieFibo(i));
	}
}
}
	


	



