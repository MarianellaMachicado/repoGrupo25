package ar.edu.unju.fi.pvisual.aplicacion.punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {
		//Atributos
		private LocalDate fecha1;
		private LocalDate fecha2;
		private LocalTime fecha3;
		private LocalTime fecha4;
		private LocalDateTime fecha5;
		private LocalDateTime fecha6;
		
		//Constructortes
		public ProcesoFecha() {
		}

		public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
			super();
			this.fecha1 = fecha1;
			this.fecha2 = fecha2;
		}

		public ProcesoFecha(LocalTime fecha3, LocalTime fecha4) {
			super();
			this.fecha3 = fecha3;
			this.fecha4 = fecha4;
		}

		public ProcesoFecha(LocalDateTime fecha5, LocalDateTime fecha6) {
			super();
			this.fecha5 = fecha5;
			this.fecha6 = fecha6;
		}
		
		// Getters y Setters
		public LocalDate getFecha1() {
			return fecha1;
		}

		public void setFecha1(LocalDate fecha1) {
			this.fecha1 = fecha1;
		}

		public LocalDate getFecha2() {
			return fecha2;
		}

		public void setFecha2(LocalDate fecha2) {
			this.fecha2 = fecha2;
		}

		public LocalTime getFecha3() {
			return fecha3;
		}

		public void setFecha3(LocalTime fecha3) {
			this.fecha3 = fecha3;
		}

		public LocalTime getFecha4() {
			return fecha4;
		}

		public void setFecha4(LocalTime fecha4) {
			this.fecha4 = fecha4;
		}

		public LocalDateTime getFecha5() {
			return fecha5;
		}

		public void setFecha5(LocalDateTime fecha5) {
			this.fecha5 = fecha5;
		}

		public LocalDateTime getFecha6() {
			return fecha6;
		}

		public void setFecha6(LocalDateTime fecha6) {
			this.fecha6 = fecha6;
		}
		
		//Métodos
		public Period contarTiempoTranscurrido() {
			Period periodo = Period.between(fecha1, fecha2);
			return periodo;
		}
		
		public String formatearFecha(LocalDate fecha) {
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return formateador.format(fecha);
		}
		
		public String compararFechas() {
			if(this.fecha1.isAfter(this.fecha2))
				return "La fecha "+formatearFecha(this.fecha1)+" es posterior a la "+formatearFecha(this.fecha2);
			else
				if(this.fecha1.isBefore(fecha2))
					return "La fecha "+formatearFecha(this.fecha1)+" es anterior a la "+formatearFecha(this.fecha2);
				else
					return "Son iguales";
		}
		
}
