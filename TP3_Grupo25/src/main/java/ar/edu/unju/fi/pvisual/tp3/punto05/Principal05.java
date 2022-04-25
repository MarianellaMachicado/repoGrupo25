package ar.edu.unju.fi.pvisual.tp3.punto05;

import java.util.Scanner;

public class Principal05 {
	
	public static void main(String []args) {
		
		Scanner texto = new Scanner(System.in);
		// Ingreso de cadena de texto
		System.out.print("Ingrese una cadena de texto : ");
		String txt = texto.nextLine();
		
		int caracteres = txt.length()-1;
		int j=0,k= caracteres;
		// Estableciendo rango de arreglo
		char[] caract = new char[caracteres];
		
		for(int i=txt.length()-1; i >=0; i--) {
			char reverso = txt.charAt(i);		//Seleccion de caracter
			 k = k--;
			if( j>=0 && k>=0) {
				caract[j] = reverso;			//Alamcenar caracter dentro del arreglo 
				System.out.print(""+caract[j]);	//Mostrar por consola los carcateres dentro del arreglo
			}
		}
		texto.close();
	}
}
