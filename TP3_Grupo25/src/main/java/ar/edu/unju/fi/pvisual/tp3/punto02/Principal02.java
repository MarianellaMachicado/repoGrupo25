package ar.edu.unju.fi.pvisual.tp3.punto02;

import java.util.Scanner;

public class Principal02 {
	
public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		Scanner respuesta = new Scanner(System.in);
		/**
		 * Establecemos el rango y los valores que tomara el arreglo
		 */
		int[] numeros = {0,1,2,3,4,5,6,7,8,9,10};
		int i=2;
	
		while (i==2) {
			System.out.print(" \n Ingrese un Número Entero del 1 - 9: ");
			int num = numero.nextInt();
			
			if (num>=1 && num<=9){
				System.out.print("\n Tabla de Multiplicar "+(num));
				
				for (int k=0; k<numeros.length; k++) {
					System.out.print("\n "+(num)+ " X "+(k) +" = "+(num*k));
				}

				System.out.print("\n ¿Desea ingresar un nuevo Número? ¿S/N? : ");
				String res = respuesta.nextLine();
				
				if("N".equals(res) || "n".equals(res)) {
					
					i= i-1;
				}
			}
			else {
				System.out.println("\n El número ingresado no corresponde al rango permitido ");
			}

		}
		numero.close();
		respuesta.close();
	}

}
