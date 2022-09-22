package logica;

public class Electrodomestico	{
	private String nombre;
	private String marca;
	private double consumo, costo;
	

	public Electrodomestico() {
		
	}
	public Electrodomestico(String n, String m, double c,double co) {
		nombre=n;
		marca=m;
		consumo=c;
		costo=co;
	}
	
	public void setNombre(String n) {
		nombre=n;
	}
	public String getNombre() {
		return nombre;
	}

	public void setMarca(String m) {
		marca=m;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setConsumo(double c) {
		consumo=c;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setCosto(double co) {
		costo=co;
	}
	public double getCosto() {
		return costo;
	}
	
	
	public String toString() {
		return("\n Nombre: "+nombre+"\n Marca: "+marca+"\n Consumo: "+consumo+"\n Costo: "+costo+"\n Costo + 20%: "+precioVenta());
	}
	public String toString2() {
		return("\n Nombre: "+nombre);
	}

  	public double precioVenta() {
	return(costo+costo*0.20);
	}
}