public class Calculadora {

	private int init;
	private int razao;
	private int iteracoes;
	private int resultnesimo;
	private int resultsoma;
	
	public int nesimo (int init, int razao, int iteracoes) {
		this.init = init;
		this.razao = razao;
		this.iteracoes = iteracoes;
		
		this.resultnesimo = init + (razao * (iteracoes - 1));
		
		return this.resultnesimo;
	}
	
	public int soma (int init, int razao, int iteracoes) {
		this.init = init;
		this.razao = razao;
		this.iteracoes = iteracoes;
		
		this.resultnesimo = init + (razao * (iteracoes - 1));
		
		
		this.resultsoma = iteracoes * (init + resultnesimo) /2 ;
		
		
				
		return this.resultsoma;
	}
	
}
