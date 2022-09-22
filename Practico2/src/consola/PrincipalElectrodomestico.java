package consola;
import logica.*;
import java.util.Scanner;
public class PrincipalElectrodomestico {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		Electrodomestico e1=new Electrodomestico();
		Electrodomestico e2=new Electrodomestico();
		System.out.println("Ingrese el Nombre: ");
		String nom=teclado.next();
		System.out.println("Ingrese la marca: ");
		String mar=teclado.next();
		System.out.println("Ingrese el consumo: ");
		double con=teclado.nextDouble();
		System.out.println("Ingrese el costo: ");
		double cos=teclado.nextDouble();
		
		e1.setNombre("Afeitadora");
		e1.setMarca("Zansung");
		e1.setConsumo(5);
		
		e2.setNombre(nom);
		e2.setMarca(mar);
		e2.setConsumo(con);
		e2.setCosto(cos);
		
		System.out.println("El nombre de e1 es: "+e1.toString2());
		System.out.println("Los datos de e2 son: "+e2.toString());

		
  }
}