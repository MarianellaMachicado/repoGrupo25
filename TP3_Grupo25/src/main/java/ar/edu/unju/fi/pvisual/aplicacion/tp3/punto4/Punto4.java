package ar.edu.unju.fi.pvisual.aplicacion.tp3.punto4;

import java.util.Scanner;

public class Punto4 {
public void mostrar(int arreglo[]) {      //muestra los valores del arreglo par o impar.
		
		for(int i=0;i<arreglo.length;i++) {
			 
			if(arreglo[i]%2 == 0){
				System.out.println("par: "+arreglo[i]);
			}
			else
				System.out.println("impar: "+arreglo[i]);
				
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner ingreso = new Scanner(System.in);
    int [] arreglo = new int [8];
    Punto4 ing = new Punto4();
    
    System.out.println("ingrese 8 numeros enteros");
     
     for(int i=0;i<arreglo.length;i++) {
    	 System.out.print("ingrese valor: ");
         arreglo[i]= ingreso.nextInt();
     }
     ing.mostrar(arreglo);
     ingreso.close();
	}
}
