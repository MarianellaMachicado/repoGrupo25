package ar.edu.unju.fi.pvisual.aplicacion.punto13;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Empleado emp = new Empleado();
       
       emp.setNombre("juan");
       System.out.println("Nombre: "+emp.getNombre());
       
       System.out.println("Fecha de ingreso es: "+emp.Fecha_ingreso);
       
       emp.setLegajo(4231);
       System.out.println("Legajo: "+emp.getLegajo());
       
       emp.setEmail("juancho34@gmail.com");
       System.out.println("Email: "+emp.getEmail());
      
       emp.setHoras_trabajadas(180);
       emp.setSueldo(emp.getHoras_trabajadas());
       System.out.println("el sueldo es: $ "+emp.getSueldo());
	   System.out.println("Horas trabajadas: "+emp.getHoras_trabajadas());
	}


}
