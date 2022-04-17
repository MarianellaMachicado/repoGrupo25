package ar.edu.unju.fi.pvisual.aplicacion.punto15;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	//Atributos de la clase
	private String nombre;
	private LocalDate fechaNac;
	
	/**
	 * Constructor con todos los atributos de la clase Persona.
	 * @param nombre
	 * @param fechaNac
	 */
	public Persona(String nombre, LocalDate fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	//Método toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNac=" + fechaNac + "]";
	}
	
	//Métodos
	/**
	 * Muestra por pantalla la cantidad de años que tiene actualmente.
	 */
	public void cantidadAnios() {
		LocalDate hoy = LocalDate.now();
		Period anios = Period.between(this.fechaNac,hoy);
		System.out.println("Tiene: "+anios.getYears());
	}
	
	/**
	 * Muestra por pantalla de que signo es.
	 */
	public void signoZodiacal() {
		int mes = this.fechaNac.getMonthValue();
		int dia = this.fechaNac.getDayOfMonth();
		
		if((mes==1 && 20<dia)||(mes==2 && dia<20))
			System.out.println("Es de Acuario");
		else
			if((mes==2 && 19<dia)||(mes==3 && dia<21))
				System.out.println("Es de Piscis");
			else
				if((mes==3 && 20<dia)||(mes==4 && dia<21))
					System.out.println("Es de Aries");
				else
					if((mes==4 && 20<dia)||(mes==5 && dia<21))
						System.out.println("Es de Tauro");
					else
						if((mes==5 && 20<dia)||(mes==6 && dia<22))
							System.out.println("Es de Geminis");
						else
							if((mes==6 && 21<dia)||(mes==7 && dia<22))
								System.out.println("Es de Cancer");
							else
								if((mes==7 && 21<dia)||(mes==8 && dia<24))
									System.out.println("Es de Leo");
								else
									if((mes==8 && 23<dia)||(mes==9 && dia<24))
										System.out.println("Es de Virgo");
									else
										if((mes==9 && 23<dia)||(mes==10 && dia<24))
											System.out.println("Es de Libra");
										else
											if((mes==10 && 23<dia)||(mes==11 && dia<23))
												System.out.println("Es de Escorpio");
											else
												if((mes==11 && 22<dia)||(mes==12 && dia<22))
													System.out.println("Es de Sagitario");
												else
													if((mes==12 && 21<dia)||(mes==1 && dia<21))
														System.out.println("Es de Capricornio");
	}
	
	/**
	 * Muestra por pantalla en que estación del año nacio.(Según la zona que es Argentina)
	 */
	public void estacionDeNacimiento() {
		int mes = this.fechaNac.getMonthValue();
		int dia = this.fechaNac.getDayOfMonth();
		
		if((mes==12 && 20<dia)||mes==1 || mes==2|| (mes==3 && dia<20))
			System.out.println("Nació en Verano");
		else
			if((mes==3 && 19<dia)|| mes==4 || mes==5 || (mes==6 && dia<21))
					System.out.println("Nació en Otoño");
			else
				if((mes==6 && 20<dia)|| mes==7 || mes==8 || (mes==9 && dia<23))
					System.out.println("Nació en Invierno");
				else
					if((mes==9 && 22<dia)|| mes==10 || mes==11 || (mes==12 && dia<21))
						System.out.println("Nació en Primavera");
	}
}
