package ar.edu.unju.fi.pvisual.aplicacion.punto05;

import java.util.Scanner;

public class Principal05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int salir = 1;
		Muestra unmostrar = new Muestra();
		
		while (salir >= 0)
		{
			System.out.println("Ingrese un numero");
			int numero = entrada.nextInt();		
			
			unmostrar.mostrar_condicionalumno(numero);
			salir = numero;
		}
		
		entrada.close();

	}

}
