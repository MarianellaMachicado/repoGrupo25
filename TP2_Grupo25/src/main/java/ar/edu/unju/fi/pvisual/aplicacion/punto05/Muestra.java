package ar.edu.unju.fi.pvisual.aplicacion.punto05;

public class Muestra {
	public void mostrar_mientras(int Numero) {
		int resultado = Numero;
		while (resultado >= 160) {
			
			System.out.println(resultado);
			resultado = resultado - 20;
		}	
	}
	
	public void mostrar_repetir(int Numero) {
		int resultado = Numero;
		do {
			System.out.println(resultado);
			resultado = resultado - 20;
		} while (resultado >= 160 );	
	}
	
	public void mostrar_mesdelaño(int mes) {
		
		switch(mes) {
		case 1:System.out.println("El numero " + mes + " corresponde al mes ENERO");
				break;
		case 2:System.out.println("El numero " + mes + " corresponde al mes FEBRERO");
				break;
		case 3:System.out.println("El numero " + mes + " corresponde al mes MARZO");
				break;
		case 4:System.out.println("El numero " + mes + " corresponde al mes ABRIL");
				break;
		case 5:System.out.println("El numero " + mes + " corresponde al mes MAYO");
				break;
		case 6:System.out.println("El numero " + mes + " corresponde al mes JUNIO");
				break;
		case 7:System.out.println("El numero " + mes + " corresponde al mes JULIO");
				break;
		case 8:System.out.println("El numero " + mes + " corresponde al mes AGOSTO");
				break;
		case 9:System.out.println("El numero " + mes + " corresponde al mes SEPTIEMBRE");
				break;
		case 10:System.out.println("El numero " + mes + " corresponde al mes OCTUBRE");
				break;
		case 11:System.out.println("El numero " + mes + " corresponde al mes NOVIEMBRE");
				break;
		case 12:System.out.println("El numero " + mes + " corresponde al mes DICIEMBRE");
				break;
		default:System.out.println("NO existe este mes");
				 break;
		}	
	}	

	public void mostrar_condicionalumno(int Numero) {
		
		switch(Numero) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("Alumno desaprueba");
				break;
		case 6:System.out.println("Alumno regulariza");
				break;
		case 7:
		case 8:
		case 9:
		case 10:System.out.println("Alumno promociona");
				 break;
		default:System.out.println("Valor no permitido");
				 break;
		}	
	}	

}
