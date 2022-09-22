package logica;

public class Fecha	{
	
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha ()	{
		
	}

	public Fecha (int d, int m, int a)	{
		
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}
	
	
	
	public void setDia (int d)	{
		
		dia = d;
	}
	public void setMes (int m)	{
		
		mes = m;
	}
	public void setAnio (int a)	{
		
		anio = a;
	}
	
		
	public int getDia ()	{
		
		return dia;
	}
	public int getMes ()	{
		
		return mes;
	}
	public int getAnio ()	{
		
		return anio;
	}
	

	
	////////////////////////////////////////////
	  //compara dos fechas retorna true si son iguales
  @Override
  public boolean equals(Object obj) {
    Fecha other = (Fecha) obj;
    boolean iguales = false;
    if (other.dia == this.dia) {
      if (other.mes == this.mes) {
        if (other.anio == this.anio) {
          iguales = true;
        }
      }
    }
    return iguales;
  }

  //métodos especificos

	
	private boolean esBisiesto ()	{
		
		return ((anio % 4 == 0) && (anio % 100 != 0) || (anio %400 == 0));		
	}

	public boolean fechaCorrecta ()	{

		boolean diaCorrecto, mesCorrecto, anyoCorrecto;

		anyoCorrecto = (anio > 0);
		mesCorrecto = (mes >= 1) && (mes <= 12);

		switch (mes)	{

			case 2:

				if (esBisiesto ())	{

					diaCorrecto = (dia >= 1 && dia <= 29);

				} else	{

					diaCorrecto = (dia >= 1 && dia <= 28);
		}
			break;

			case 4:
			case 6:
			case 9:
			case 11:
					
				diaCorrecto = (dia >= 1 && dia <= 30);
				
				break;
		default:

			diaCorrecto = (dia >= 1 && dia <= 31);
		}

		return diaCorrecto && mesCorrecto && anyoCorrecto;

	}
	
public void diaSiguiente ()	{

		
		switch (mes)	{

			case 2:

				if (esBisiesto ()&& dia < 29)	{

					dia = dia+1;

				} else	{

					dia=1;
					mes=3;
				}
				break;

			case 4:
			case 6:
			case 9:
			case 11:
					
				if(dia < 30)
					dia=dia+1;
				else{

					dia=1;
					mes=mes+1;
				}
					
				
				break;
		default:

			if(dia < 31)
				dia=dia+1;
			else{

				dia=1;
				mes=mes+1;
			}
				
		}
		if (mes == 13) {
	        mes = 1;
	        anio++;
	      }

		

	}
	
	
		@Override
	public String toString (){
				
		return dia+ "/" + mes+ "/" + anio;
	}
	
	
}
