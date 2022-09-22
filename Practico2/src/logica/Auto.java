package logica;

public class Auto	{
//complete aquí el código	
	private String marca;
	private double velMax , precio;
	private int potencia;

	public Auto() {
	
	}  
	
	public Auto(String a, int b, double c, double d) {
		marca =a;
		potencia =b;
		velMax =c;
		precio =d;
	}
	
	public void setMarca(String a) {
		marca = a;
	}	
	public void setPotencia(int b) {
		potencia = b;
	}	
	public void setVelMax(double c) {
		velMax = c;
	}	
	public void setPrecio(double d) {
		 precio = d;
	}
	
	public String getMarca(){
		return marca;
	}
	public int getPotencia(){
		return potencia;
	}
	public double getVelMax(){
		return velMax;
	}	public double getPrecio(){
		return precio;
	}
	public String toString() {
		return(" marca: "+marca+"\n potencia: "+potencia+"\n velMax: "+velMax+"\n precio: "+precio);
	}
		
}