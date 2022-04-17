package ar.edu.unju.fi.pvisual.aplicacion.punto01;

public class Factorial {

	public void calcula_factorial(int Numero) {
		int resultado = 1;
		while (Numero != 0) {
			resultado = resultado * Numero;
			//System.out.println(resultado);
			Numero--;
		}
		
		System.out.println("El factorial es");
		System.out.println(resultado);
	}

}
