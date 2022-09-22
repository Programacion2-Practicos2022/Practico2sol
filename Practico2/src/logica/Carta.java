package logica;

public class Carta {
	private int numero;
	private String palo;
		
	public Carta(){
		numero=1;
		palo= "basto";
	}
	public Carta(int n, String p) {
		palo=p;
		numero=n;
		int comp=0;
		int comp2=0;
		do {
			if(numero>12) {
				comp2=2;
				System.out.println("El numero tiene que ser de 1 a 12");
			}
			else
				comp2=1;
		}while(comp2!=1);
		do {
		switch(palo){
		
		case "basto":
			comp=1;
			break;
		case "copa":
			comp=1;
			break;
		case "espada":
			comp=1;
			break;
		case "oro":
			comp=1;
			break;
			
			default:
				System.out.println("Palo invalido!!!!!!!");
				comp=2;
				
		
		}
		}while(comp!=1);
	}
	public void siguienteCarta() {
		if(numero<=11) {
			numero=numero+1;
		}
		else {
			numero=1;
		}
		switch(palo) {
		case "basto":
			if(numero==1) {
				palo="copa";
			}
			break;
		case "copa":
			if(numero==1) {
				palo="espada";
			}
			break;
		case "espada":
			if(numero==1) {
				palo="oro";
			}
			break;
		case "oro":
			if (numero==1) {
				palo="basto";
			}
			break;
			default:
				System.out.println("Error");
				break;
		}
		
	}
	
	public String toString() {
		return(numero+" de "+palo);
	}
	
	
	
	
	
	
	
	
}
