package ar.edu.unju.fi.pvisual.aplicacion.tp3.punto1;

import java.util.Scanner;

public class Principal {
Scanner ingreso = new Scanner(System.in);
	
	public  void ingreso(int array[]) {            //metodo para el ingreso de datos
		int i;
	       for(i=0;i<array.length;i++)
	       {
	    	   System.out.print("ingrese valor: ");
	    	   array[i]=ingreso.nextInt();	       }
	  }
	
	public void calculoDivision(int array[],int array2[]) {        //calculo de division
		int i,resultado;
		
		  for(i=0;i<array2.length;i++){
			  try {  
			  resultado=array[i]/array2[i];
			  System.out.println("cociente: "+resultado); 	}
		catch(ArithmeticException e) {
			System.out.println("no se puede dividir por cero ");   }
		}
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	       int [] array = new int[5];
	       int [] array2 = new int [5];
	      Principal div = new Principal();
	      
	     System.out.println("arreglo 1: ");
	     div.ingreso(array);
	     System.out.println("arreglo 2: ");
	     div.ingreso(array2);
	     System.out.println("Resultado: ");
	     div.calculoDivision(array,array2);        	      
		}
}
