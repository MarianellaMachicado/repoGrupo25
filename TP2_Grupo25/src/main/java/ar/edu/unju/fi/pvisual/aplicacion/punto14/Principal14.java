package ar.edu.unju.fi.pvisual.aplicacion.punto14;

import java.time.LocalDate;

import ar.edu.unju.fi.pvisual.aplicacion.punto13.Empleado;



public class Principal14 {

	public static void main(String[] args) {
		/**
		 * Se crea un objeto de tipo Empleado con el constructor por defecto y lo muestra por pantalla.
		 */
		Empleado e1 = new Empleado();
		System.out.println(e1.toString());
		
		/**
		 * Se crea un objeto de tipo Empleado con el constructor(nombre,legajo,horasTrabajadas) y lo muestra por pantalla.
		 */
		Empleado e2 = new Empleado("Luca",937,600);
		System.out.println(e2.toString());
		
		/**
		 * Se crea un objeto de tipo Empleado con el contructor(nombre,fechaIngreso,horasTrabajadas) y lo muestra por pantalla.
		 */
		LocalDate fecha = LocalDate.of(2015, 11, 1);
		Empleado e3 = new Empleado("Tomas",fecha,100);
		System.out.println(e3.toString());
		
		/**
		 * Se crea un objeto de tipo Empleado con el contructor(nombre,horasTrabajadas) y lo muestra por pantalla.
		 */
		Empleado e4 = new Empleado("Sofia",300);
		System.out.println(e4.toString());

	}

}
