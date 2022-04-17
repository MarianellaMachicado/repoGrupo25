package ar.edu.unju.fi.pvisual.aplicacion.punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal17 {

	public static void main(String[] args) {
		//b_1
		LocalDate fecha1=LocalDate.of(2021, 12, 4);
		LocalDate fecha2=LocalDate.of(1992, 4, 20);
		
		ProcesoFecha pf1 = new ProcesoFecha(fecha1,fecha2);
		
		System.out.println(pf1.getFecha1());
		System.out.println(pf1.getFecha2());
		
		//b_2
		LocalTime time1=LocalTime.of(12,5);
		LocalTime time2=LocalTime.of(5,40);
		
		ProcesoFecha pf2 = new ProcesoFecha(time1,time2);
		
		pf2.setFecha3(time1.plusHours(5));
		pf2.setFecha4(time2.minusMinutes(20));
		
		System.out.println(pf2.getFecha3());
		System.out.println(pf2.getFecha4());
		
		//b_3
		System.out.println(pf1.compararFechas());
		
		//b_4
		LocalDateTime dateTime1=LocalDateTime.of(fecha1, time1);//toma el valor de la variable no del atributo del objeto
		LocalDateTime dateTime2=LocalDateTime.of(fecha2, time2);
		
		ProcesoFecha pf3 = new ProcesoFecha(dateTime1,dateTime2);
		
		System.out.println(pf3.getFecha5());
		System.out.println(pf3.getFecha6());
		
		//b_5
		fecha1=LocalDate.of(1993, 12, 20);
		fecha2=LocalDate.now();
		
		ProcesoFecha pf4 = new ProcesoFecha(fecha1,fecha2);
		
		int anios,meses,dias;
		anios=pf4.contarTiempoTranscurrido().getYears();
		meses=pf4.contarTiempoTranscurrido().getMonths();
		dias=pf4.contarTiempoTranscurrido().getDays();
		
		System.out.println("Han transcurrido "+anios+" años, "+meses+" meses y "+dias+" días desde la fecha "+pf4.formatearFecha(fecha1)+" hasta la fecha "+pf4.formatearFecha(fecha2));
		
		//b_6
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese una fecha(dd/MM/yyyy): ");
		String fechaSrt = sc.next();
		
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//b_7
		boolean band;
		do {
			try {
				band=false;
				LocalDate fecha = LocalDate.parse(fechaSrt,formateador);
				ProcesoFecha pf5 = new ProcesoFecha();
				pf5.setFecha1(fecha);
				
				LocalDate fechaIncremento=fecha;
				fechaIncremento=fechaIncremento.plusDays(365);
				
				System.out.println(fechaIncremento);
			}catch(DateTimeParseException e) {
				band=true;
				System.out.print("Ingrese una fecha(dd/MM/yyyy): ");
				fechaSrt = sc.next();	
			}	
			sc.close();
		}while(band);
	}

}
