package ar.edu.unju.fi.pvisual.aplicacion.punto04;

import java.util.Scanner;

public class Principal04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes;
		do {
			System.out.print("Ingrese un número: ");
			mes = sc.nextInt();

			if(mes==1)
				System.out.println("El número "+mes+" corresponde al mes ENERO.");
			else
				if(mes==2)
					System.out.println("El número "+mes+" corresponde al mes FEBRERO.");
				else
					if(mes==3)
						System.out.println("El número "+mes+" corresponde al mes MARZO.");
					else
						if(mes==4)
							System.out.println("El número "+mes+" corresponde al mes ABRIL.");
						else
							if(mes==5)
								System.out.println("El número "+mes+" corresponde al mes MAYO.");
							else
								if(mes==6)
									System.out.println("El número "+mes+" corresponde al mes JUNIO.");
								else
									if(mes==7)
										System.out.println("El número "+mes+" corresponde al mes JULIO.");
									else
										if(mes==8)
											System.out.println("El número "+mes+" corresponde al mes AGOSTO.");
										else
											if(mes==9)
												System.out.println("El número "+mes+" corresponde al mes SEPTIEMBRE.");
											else
												if(mes==10)
													System.out.println("El número "+mes+" corresponde al mes OCTUBRE.");
												else
													if(mes==11)
														System.out.println("El número "+mes+" corresponde al mes NOVIEMBRE.");
													else
														if(mes==12)
															System.out.println("El número "+mes+" corresponde al mes DICIEMBRE.");
														else
															System.out.println("No existe este mes.");
		}while(mes>0 && mes<13);
		System.out.println("\nFin del ingreso de número.");
		sc.close();
	}

}
