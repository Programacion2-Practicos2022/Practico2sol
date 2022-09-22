package consola;
import logica.*;
import java.util.Scanner;
public class PrincipalEmpleado {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		Empleado e1=new Empleado("111","Pedro",4,2500);
		Empleado e2=new Empleado();
		System.out.println("Ingrese su cedula: ");
		String ced=teclado.next();
		System.out.println("Ingrese su Nombre: ");
		String nom=teclado.next();
		System.out.println("Ingrese antiguedad: ");
		int ant=teclado.nextInt();
		System.out.println("Ingrese su Sueldo: ");
		double su=teclado.nextDouble();
		
		e2.setCedula(ced);
		e2.setNombre(nom);
		e2.setAntiguedad(ant);
		e2.setSueldo(su);
		
		System.out.println("Los datos de e1 son: "+e1.toString());
		System.out.println("Los datos de e2 son: "+e2.toString());

		
  }
}