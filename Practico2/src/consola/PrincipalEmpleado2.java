package consola;

import logica.Empleado2;

public class PrincipalEmpleado2 {

	public static void main(String[] args) {

		System.out.println("Hola");
		Empleado2 e1= new Empleado2();  //constructor por defecto
		Empleado2 e2= new Empleado2("Ruiz","Daniel",30000);  //constructor especifico
		System.out.println("Los datos de e2 son: "+e1.toString());
		String nom1=e2.getNombre();
		System.out.println("El nombre de e2 es:" +nom1);
		e2.setNombre("Francisco");
		System.out.println("El nombre de e2 es:" +e2.getNombre());
		e2.presentismo();
		System.out.println("Los datos de e2 son: "+e2.toString());
	}

}