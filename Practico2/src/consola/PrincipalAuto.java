package consola;
import logica.Auto;

public class PrincipalAuto {

	public static void main(String[] args) {
    Auto a1 = new Auto("Chevrolet",150,90,10000);
    Auto a2 = new Auto();
    System.out.println(a1);
    System.out.println(a2);

  }
}