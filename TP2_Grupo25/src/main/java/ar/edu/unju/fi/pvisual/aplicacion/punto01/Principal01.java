package ar.edu.unju.fi.pvisual.aplicacion.punto01;

import java.util.Scanner;

public class Principal01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		
		int numero = entrada.nextInt();		
		while (numero > 10 || numero < 0)
		{
			System.out.println("Ingrese un numero entre 0 y 10");
			numero = entrada.nextInt();
		}
		
		Factorial unfactor = new Factorial();
		unfactor.calcula_factorial(numero);
		
		entrada.close();

	}

}
