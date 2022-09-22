package logica;

public class Empleado	{
	private String cedula;
	private String nombre;
	private int antiguedad;
	private double sueldo;
	
	public double sueldoAnual() {
		return(sueldo*12);
	}
	public void presentismo(double s) {
		s=(s*1.10);
	}
	public Empleado() {
		
	}
	public Empleado(String c, String n, int a, double s) {
		cedula=c;
		nombre=n;
		antiguedad=a;
		sueldo=s;
	}
	public void setCedula(String c) {
		cedula=c;
	}
	public String getCedula() {
		return cedula;
	}
	public void setNombre(String n) {
		nombre=n;
	}
	public String getNombre() {
		return nombre;
	}

	public void setAntiguedad(int a) {
		antiguedad=a;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void setSueldo(double s) {
		sueldo=s;
	}
	public double getSueldo() {
		return sueldo;
	}
	
	
	public String toString() {
		return("\n Cedula: "+cedula+"\n Nombre: "+nombre+"\n Antiguedad: "+antiguedad+"\n Sueldo: "+sueldo+"\n Sueldo Anual: "+sueldoAnual());
	}
}