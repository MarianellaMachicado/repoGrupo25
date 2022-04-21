package ar.edu.unju.fi.pvisual.aplicacion.punto07;

public class Principal07 {
	
	public static void main(String[] args) {
		
		int j = 40;
		int aux = 3;
		int k = j;

        for(int i=2; i<=40; i++)
        {
        	if (j == 40) {
        		j = j*2;
        		System.out.print(j);
        		System.out.print(" ");
        	}
        	j = j + k-aux;
            System.out.print(j);
        	System.out.print(" ");
        	aux = aux+2;
        	
        } 
	}


}
