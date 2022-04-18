package ar.edu.unju.fi.pvisual.aplicacion.punto12;

import java.util.Scanner;

public class Principal12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese altura: ");
        float num= leer.nextFloat();
        System.out.println("tiempo de caida: "+Math.sqrt((2*num)/9.81));
       
        leer.close();
	}

}
