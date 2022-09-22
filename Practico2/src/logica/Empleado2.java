package logica;

public class Empleado2	{
	//atributos
	private String apellido;
	private String nombre;
	private double salario;
	
	//metodos constructores
	//constructor por defecto
	public Empleado2() {
		salario=50000;
		
	}
	
	//constructor espec�fico
	public Empleado2(String ape, String nom, double sal) {
		apellido=ape;
		nombre=nom;
		salario=sal;
	}
	
	//m�todos getter
	public  String getApellido() {
		return apellido;
	}
	
	public  String getNombre() {
		return nombre;
	}
	
	public  double getSalario() {
		return salario;
	}
	
	//m�todos setter
	public void setApellido(String apellido1) {
		apellido=apellido1;
	}
	
	public void setNombre(String nombre1) {
		nombre=nombre1;
	}
	
	public void setSalario(double salario1) {
		salario=salario1;
	}
	
	//metodos especificos
	public double sueldoAnual() {
		return salario*12;
	}
	
	public void presentismo() {
		salario=salario + salario*0.10;
	}
	
	
	@Override
	public String toString() {
		return "Apellido: "+apellido+" Nombre: "+nombre
				+" Salario: "+salario + "Sueldo anual es: "+
				this.sueldoAnual();
	}
	
	
	
	
	
}
