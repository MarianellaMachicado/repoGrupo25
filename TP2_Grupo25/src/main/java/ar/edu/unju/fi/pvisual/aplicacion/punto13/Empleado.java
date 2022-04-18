package ar.edu.unju.fi.pvisual.aplicacion.punto13;

public class Empleado {
	private String Nombre;
	private String Fecha_ingreso;
	private int Legajo;
	private String Email;
	private float Sueldo;
	private float Horas_trabajadas;
	
	//Metodo getter mostramos el nombre
	public String getNombre() {
		return Nombre;
	}
	//Metodo setter Establesemos el nombre
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getFecha_ingreso() {
		return Fecha_ingreso;
	}
	public void setFecha_ingreso(String fecha_ingreso) {
		this.Fecha_ingreso = fecha_ingreso;
	}
	public int getLegajo() {
		return Legajo;
	}
	public void setLegajo(int legajo) {
		Legajo = legajo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public float getSueldo() {
		return Sueldo;
	}
	public void setSueldo(float sueldo) {
	float total_hs,horas_extra,total_extra,horas_sem,total_sueldo;
         total_hs = sueldo;             
    if (total_hs > 160 )
       {
          horas_extra = total_hs - 160;
          horas_sem = 160 * 600;
          total_extra = horas_extra * 650;
          total_sueldo = horas_sem + total_extra;
  
         }
else
  total_sueldo = total_hs * 600;
		this.Sueldo = total_sueldo;
	}
	public float getHoras_trabajadas() {
		return Horas_trabajadas;
	}
	public void setHoras_trabajadas(float horas_trabajadas) {
		this.Horas_trabajadas = horas_trabajadas;
       
	}

}
