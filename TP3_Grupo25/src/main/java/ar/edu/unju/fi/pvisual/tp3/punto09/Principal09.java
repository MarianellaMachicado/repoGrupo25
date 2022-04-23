package ar.edu.unju.fi.pvisual.tp3.punto09;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal09 {

	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Scanner entrada = new Scanner(System.in);
		//Menu
		int opc=0;
		//Carga de producto
		int codigo;
		String descripcion, marca;
		double precio;
		
		do {
			opc= menu(entrada,opc);
			switch(opc) {
				case 1:
					System.out.println("****** Info Producto ******");
					System.out.print("Código: ");
					codigo = entrada.nextInt();
					System.out.print("Descripción: ");
					descripcion = entrada.next();
					System.out.print("Precio: ");
					precio = entrada.nextDouble();
					System.out.print("Marca: ");
					marca = entrada.next();
					
					Producto prod= new Producto(codigo,descripcion,precio,marca);
					productos.add(prod);
				break;
				case 2:
					int i=0;
					for(Producto p : productos) {
						i++;
						System.out.println("******* Elemento "+i+" *******");
						System.out.println("Código: "+p.getCodigo());
						System.out.println("Descripción: "+p.getDescripcion());
						System.out.println("Precio: "+p.getPrecio());
						System.out.println("Marca: "+p.getMarca());
					}
				break;
				case 3:
					for(Producto p : productos)
						p.setPrecio(p.getPrecio()+100.25);
					System.out.println("Precio modificado!!!");
				break;
				case 4:
					double total=0;
					for(Producto p : productos)
						total = total + p.getPrecio();
					System.out.println("Total: "+total);
				break;
				case 5:
					System.out.println("Fin del programa");
				break;
			default: System.out.println("Opcion incorrecta");
			}
			
		}while(opc!=5);
		entrada.close();
	}
	
	public static int menu(Scanner entrada,int opc) {
		System.out.println("****************** MENU ******************");
		System.out.println("1-Nuevo producto");
		System.out.println("2-Mostrar todos los productos");
		System.out.println("3-Incrementar precio a todos los productos");
		System.out.println("4-Monto total de todos los productos");
		System.out.println("5-Fin");
		System.out.println("******************************************");
		System.out.print("Elija una opción: ");
		opc = entrada.nextInt();
		return opc;
	}

}
