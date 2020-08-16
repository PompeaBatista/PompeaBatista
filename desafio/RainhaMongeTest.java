package desafio;

public class RainhaMongeTest {
	
	
	public static void executar() {
		double [] qdeGrao = new double[64];
		double qdeCasa = 1;
		double [] somaGrao = new double[64];
		double somaCasa = 1;
			
		for(int x = 0; x<=63; x++) {
		qdeGrao [x] = qdeCasa;
		qdeCasa*=2;
		
		somaGrao[x] = somaCasa;
		somaCasa = somaCasa + qdeCasa;
		
		}
		for(int x=0; x<=63; x++) {
		System.out.print(qdeGrao[x] + " ");
		}
		
	}

}
