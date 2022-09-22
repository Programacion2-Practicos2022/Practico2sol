package consola;
import logica.*;
import java.util.Scanner;
public class PrincipalCarta {

	public static void main(String[] args) {
		Carta c1=new Carta();
		for(int i=1;i<= 48;i=i+1) {
			System.out.println(c1);
			c1.siguienteCarta();
		}
	}
}