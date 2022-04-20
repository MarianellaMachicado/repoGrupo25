package ar.edu.unju.fi.pvisual.aplicacion.punto13;

import java.time.LocalDate;

public class Principal13 {
	public static void main(String[] args) {
		/**
		 * Se crea el objeto Empleado usando el contructor Empleado(nombre,fechaIngreso,legajo,correo,horasTrabajadas) y lo muestra por pantalla
		 */
		LocalDate fecha = LocalDate.of(2017,10,20);
		Empleado e1 = new Empleado("facu",fecha,1000,"nombre@correo.com",100);
		
		System.out.println(e1.toString());
	}


}
