package ar.edu.unju.fi.pvisual.tp3.punto03;

public class Alumno {

	private String nombre, apellido;
	private int lu;
	private double[] notaalu;

	public Alumno() {
		
	}
	
	Alumno(String nombre, String apellido, int lu, double[] nota) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.lu = lu;
		this.notaalu = nota;
	}

	public void mostrar() {
		for(int i=0; i< notaalu.length;i++ ) {
			System.out.println(notaalu[i]);
		}
	}
	
	public void calcularPromedio() {
		double promedio=0;
		double totalprom = 0;
		
		for(int i=0; i< notaalu.length;i++ ) {
			//System.out.println(notaalu[i]);
			promedio = promedio + notaalu[i];
		}
		totalprom = promedio/5;
		System.out.println("El promedio es: " +totalprom);
	}

	public void obtenerNotaMaxima() {
		double max=0;
		
		for(int i=0; i< notaalu.length;i++ ) {
			if(max < notaalu[i]) {
				max = notaalu[i];
			}
		}
		System.out.println("La nota mas alta es: "+max);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getLu() {
		return lu;
	}

	public void setLu(int lu) {
		this.lu = lu;
	}

	public double[] getNota() {
		return notaalu;
	}

	public void setNota(double[] nota) {
		this.notaalu = nota;
	}

	
	
		
}
