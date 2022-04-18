package ar.edu.unju.fi.pvisual.aplicacion.punto03;

import java.util.Scanner;

public class Principal03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner leer = new Scanner (System.in);
				int i=1;
				do {
				System.out.print("ingrese valor: ");
				int num = leer.nextInt();
				if(num % 2== 0)
				{
					System.out.println("el valor es par");
				}
				else
				{
					System.out.println("el valor es impar");
				}
				   i++;
				}while (i<=5);
				System.out.println("Fin del Programa");
				
				leer.close();
	}
}
