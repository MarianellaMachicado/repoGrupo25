package ar.edu.unju.fi.pvisual.aplicacion.punto16;

public class CalculoMatematico {
	
	//Atributo
	private int n;
	private int acumulador;

	//Constructor
	public CalculoMatematico(int n) {
		super();
		this.n = n;
	}

	// Getters y Setters
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	//Métodos

	public void calcularSumatoria() {

		acumulador = 0;			
		for(int i=1; i<=n; i++) {
			  acumulador  += i;
			   System.out.println (acumulador);
			}
	}

	public void calcularProductoria() {

		acumulador = 1;			
		for(int i=1; i<=n; i++) {
			  acumulador  = acumulador * i;
			   System.out.println (acumulador);
			}
	}


}
