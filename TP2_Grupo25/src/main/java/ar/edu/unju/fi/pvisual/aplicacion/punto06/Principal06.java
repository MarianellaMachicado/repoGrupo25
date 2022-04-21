package ar.edu.unju.fi.pvisual.aplicacion.punto06;

import java.util.Scanner;

public class Principal06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i = 2;
		
		while(i>=1) {
			
			System.out.print(" \n Ingrese un Número entero del 1 - 10: ");
			int num = entrada.nextInt();
			
			if (num > 10) {
				num = 1;
			}
			else {
				if (num == 6) {
					System.out.println(" Alumno regulariza ");
				}
				else {
					if (num >=7 && num <=10) {
						System.out.println(" El alumno promociona ");
					}
					else {
						if (num <6 && num >=1){
							System.out.println(" El alumno desaprueba ");
						}
						else {
							if (num <=0) {
								System.out.println(" Valor no permitido ");
								i = 0;
							}
						}
					}
				}
			}
		}
		entrada.close();

	}

}
