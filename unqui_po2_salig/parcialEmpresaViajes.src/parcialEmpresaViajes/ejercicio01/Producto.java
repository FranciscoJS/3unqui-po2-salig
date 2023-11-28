package parcialEmpresaViajes.ejercicio01;

import java.time.LocalDate;

public abstract class Producto
{
	protected double costoFijoPorPersona;
	
	protected abstract LocalDate getFechaInicio();
	protected abstract LocalDate getFechaFin();
	
	
	protected abstract double getImpuestos();
	
	public abstract double getCostoTotal();
	
	/*
	@Override
	public int compareTo(Producto o)
	{
		int compareValue = this.getFechaInicio().compareTo( o.getFechaInicio() );
		
		if( compareValue > 0 )
		{
			return 1;
		}
		else if( compareValue < 0 )
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	*/
	
}
