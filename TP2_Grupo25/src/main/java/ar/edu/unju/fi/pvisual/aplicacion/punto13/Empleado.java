package ar.edu.unju.fi.pvisual.aplicacion.punto13;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private LocalDate fechaIngreso;
	private int legajo;
	private String email;
	private float sueldo;
	private float horasTrabajadas;
	
	public Empleado(String nombre, LocalDate fechaIngreso, int legajo, String email, int horasTrabajadas) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.email = email;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldo=sueldo();
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", legajo=" + legajo + ", email="
				+ email + ", sueldo=" + sueldo + ", horasTrabajadas=" + horasTrabajadas + "]";
	}
	
	public float sueldo() {
		float total;
		int primerasHoras=600*160;
		
		if(this.horasTrabajadas<=160)
			total=600*this.horasTrabajadas;
		else
			total=primerasHoras+650*(this.horasTrabajadas-160);
		return total;
	}

}
