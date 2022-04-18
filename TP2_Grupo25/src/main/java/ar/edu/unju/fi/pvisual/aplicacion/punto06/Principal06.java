package ar.edu.unju.fi.pvisual.aplicacion.punto06;

import java.util.Scanner;

public class Principal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int i = 2, num;
		
		while(i>=1) {
			System.out.print("Ingrese un Número entero del 1 - 10: ");
			num = entrada.nextInt();
			
			if (num == 6) {
				System.out.println("Alumno regulariza");
			}
			else {
				if (num >=7 && num <=10) {
					System.out.println("El alumno promociona");
				}
				else {
					if (num <6 && num>=1) {
						System.out.println("El alumno desaprueba");
					}
					else {
						System.out.println("Valor no permitido");
						i = 0;
					}

				}
			}
		}

	}

}
