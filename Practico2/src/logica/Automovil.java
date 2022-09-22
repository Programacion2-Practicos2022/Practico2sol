package logica;

public class Automovil {
	//atributos
	private String marca;
	private double precio;
	private int anio;
		
	//constructor por defecto
	public Automovil() {
		
	}
	
	//constructor especifico
	public Automovil(String marca1, double precio1, int anio1) {
		marca=marca1;
		precio=precio1;
		anio=anio1;
	}
	
	//getter y setter	get:obtener y set:poner
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca1) {
		marca=marca1;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio1) {
		precio=precio1;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio1) {
		anio=anio1;
	}
	
	//si el anio es 2008 o 2010 el precio es 60% sino es el 80%
	public double precioNeto() {
		
		double monto=precio;  //100%
		
		if (anio == 2008|| anio == 2010)
			monto = precio*0.60;	//60%
		else
			monto = precio*0.80;	//80%
		return monto;
	}
	
	//metodos especificos
	
  	//si el año es menor de 2000 el impuesto es 20% del precio
	//sino es un 50% del precio
	public double impuesto() {
		double valor;
		if (anio<2000)
			valor=precio*20/100;
		else
			valor=precio*50/100;
		
		return valor;
		
	}
	
	//toString
	@Override
	public String toString() {
		return "Marca: "+marca+
				" Precio: "+precio+
				" Anio: "+anio;
		
	}

}
