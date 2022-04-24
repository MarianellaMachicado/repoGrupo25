package ar.edu.unju.fi.pvisual.tp3.punto03;

import java.util.Scanner;

public class Principal03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double Notas[] = new double[5];
		//Variables				
		String nom, ape;
		int lu;
		//Ingreso de datos
		System.out.println("   INGRESE DATOS DEL ALUMNO");
		System.out.print("Nombre: ");
		nom = entrada.next();
		System.out.print("Apellido: ");
		ape = entrada.next();
		System.out.print("LU: ");
		lu = entrada.nextInt();		
		int cant=0;
		
		do{
			System.out.print("Nota: ");
			Notas[cant] = entrada.nextDouble();	
			cant++;
		}while(cant<5);
		
		Alumno unalumno = new Alumno(nom,ape,lu,Notas);
		
		System.out.println("Nombre y Apellido: "+unalumno.getNombre()+" "+unalumno.getApellido());
		System.out.println("LU: "+ unalumno.getLu());
		unalumno.calcularPromedio();
		unalumno.obtenerNotaMaxima();
		entrada.close();
	}

}
