package ar.edu.unju.fi.pvisual.aplicacion.punto15;

import java.time.LocalDate;

public class Principal15 {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(1993,12,20);
		
		Persona p1 = new Persona("Marianella",fecha);
		
		p1.cantidadAnios();
		p1.signoZodiacal();
		p1.estacionDeNacimiento();
	}

}
