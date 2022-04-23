package ar.edu.unju.fi.pvisual.tp3.punto07;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal07 {

	public static void main(String[] args) {
		ArrayList<String> arreglo = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in); 
		int numero;
		String fruta,resp;
		
		/**
		 * Agrega nombres de frutas, pedidos por consola, al arreglo.
		 */
		do {
			System.out.print("Ingrese el nombre de una fruta: ");
			fruta = entrada.nextLine();
			arreglo.add(fruta);
			
			System.out.print("¿Desea continuar?(s/n): ");
			resp = entrada.nextLine();
		}while(!("n".equals(resp)) && !("N".equals(resp)));
		
		/**
		 * Muestra una lista de frutas que tienen índice par.
		 */
		System.out.println("*********** Posiciones par ***********");
		for(int i=0;i<arreglo.size();i=i+2)
			System.out.println(arreglo.get(i));
		System.out.println("**************************************");
		/**
		 * Elimina un elemento del arreglo luego muestra su contenido y la cantidad de elementos del arreglo
		 */
		do{
			System.out.print("Ingrese un número entero: ");
			numero = entrada.nextInt();
			if(numero<0 || numero-1>arreglo.size())
				System.out.println("Fuera del rango del arreglo!!\n");
			else {
				arreglo.remove(numero);
				System.out.println("Se elimino la fruta en la posición "+numero);
				for(String f: arreglo)
					System.out.println(f);
				System.out.println("Cantidad de elementos: "+arreglo.size());
			}
		}while(numero<0 || numero-1>arreglo.size());
		System.out.println("Fin del programa");
		entrada.close();
	}

}
