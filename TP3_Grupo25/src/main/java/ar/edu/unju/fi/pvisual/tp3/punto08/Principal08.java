package ar.edu.unju.fi.pvisual.tp3.punto08;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.pvisual.tp3.punto03.Alumno;

public class Principal08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Scanner entrada = new Scanner(System.in);
		
		//Menu
		int op=0;
		
		//carga de datos
		String nom, ape;
		int lu;
		
		do {
			op = menu(entrada,op);
			double arreglonota[] = new double[5];
			int i;
			switch(op) {
				case 1:
					System.out.println("****** INGRESE DATOS DEL ALUMNO ******");
					System.out.print("Nombre: ");
					nom = entrada.next();
					System.out.print("Apellido: ");
					ape = entrada.next();
					System.out.print("LU: ");
					lu = entrada.nextInt();
					int cant = 0;
					do{
						System.out.print("Nota: ");
						arreglonota[cant] = entrada.nextDouble();	
						cant++;
					}while(cant<5);
					
					Alumno unalumno = new Alumno(nom,ape,lu,arreglonota);
					alumnos.add(unalumno);
					break;
				case 2:
					i=0;
					int eliminar=0;
					System.out.println("******* ELIMINA UN ALUMNO *******");
					System.out.print("Ingrese N° LU: ");
					lu = entrada.nextInt();
					for(Alumno a : alumnos) {
						if(lu == a.getLu()) {
							System.out.println("******* ALUMNO A ELIMINAR*******");
							System.out.println("Nombre y Apellido: "+a.getNombre()+" "+a.getApellido());
							System.out.println("LU: "+a.getLu()); 
							eliminar=i;
						}
						i++;
					}
					alumnos.remove(eliminar);
					break;
				case 3:
					i=0;
					int modifica=0;
					System.out.println("******* MODIFICA NOTAS DE UN ALUMNO *******");
					System.out.print("Ingrese N° LU: ");
					lu = entrada.nextInt();
					for(Alumno a : alumnos) {
						if(lu == a.getLu()) {
							System.out.println("******* ALUMNO *******");
							System.out.println("Nombre y Apellido: "+a.getNombre()+" "+a.getApellido());
							System.out.println("LU: "+a.getLu()); 
							System.out.println("Ingrese notas: ");
							cant = 0;
							do{
								System.out.print("Nota: ");
								arreglonota[cant] = entrada.nextDouble();	
								cant++;
							}while(cant<5);
							modifica=i;
						}
						i++;
					}
					alumnos.get(modifica).setNota(arreglonota);
					break;
				case 4:
					i=0;
					for(Alumno a : alumnos) {
						i++;
						System.out.println("******* ALUMNO "+i+" *******");
						System.out.println("Nombre y Apellido: "+a.getNombre()+" "+a.getApellido());
						System.out.println("LU: "+a.getLu()); 
						a.mostrar();
						System.out.println(" ");
					}
					break;
				case 5:
					i=0;
					for(Alumno a : alumnos) {
						i++;
						if(a.calcularPromedio()>6) {
							System.out.println("******* ALUMNO "+i+" *******");
							System.out.println("Nombre y Apellido: "+a.getNombre()+" "+a.getApellido());
							System.out.println("LU: "+a.getLu()); 
							System.out.println("El promedio es: " +a.calcularPromedio());
							System.out.println(" ");							
						}						
					}
					break;
				case 6:
					System.out.println("Fin del programa");
					break;
			default: System.out.println("Opcion incorrecta");	
			}
			
		}while(op!= 6);
		entrada.close();
	}
	
	public static int menu(Scanner entrada,int op) {
//		System.out.println("");
		System.out.println("****************** MENU ******************");
		System.out.println("1-Nuevo Alumno");
		System.out.println("2-Eliminar Alumno");
		System.out.println("3-Modifica notas del Alumno");
		System.out.println("4-Mostrar todos los alumnos");
		System.out.println("5-Mostrar los que superan el promedio 6");
		System.out.println("6-Salir");
		System.out.println("******************************************");
		System.out.print("Elija una opción: ");
		op = entrada.nextInt();
		return op;
	}


}
