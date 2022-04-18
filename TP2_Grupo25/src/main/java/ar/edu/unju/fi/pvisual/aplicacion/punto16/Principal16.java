package ar.edu.unju.fi.pvisual.aplicacion.punto16;

import java.util.Scanner;

public class Principal16 {

		
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			//int acumulador = 1;
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Ingrese un numero: ");
			int num = entrada.nextInt();
			
			CalculoMatematico calculo = new CalculoMatematico(num);
			
			System.out.println(calculo.getN());
					
		    System.out.println( );
		    System.out.println("La Sumatoria" );
		    calculo.calcularSumatoria();
			
			System.out.println( );
		    System.out.println("Productoria" );
			calculo.calcularProductoria();
			
		    System.out.println("salir");
		    entrada.close();
		}

}
