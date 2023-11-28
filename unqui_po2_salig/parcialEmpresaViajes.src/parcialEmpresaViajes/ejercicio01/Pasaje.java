package parcialEmpresaViajes.ejercicio01;

import java.time.LocalDate;

public class Pasaje extends Producto
{
	protected LocalDate fechaInicio;
	protected LocalDate fechaFin;
	private String aeropuartoLlegada;
	private iOperator operadorExterno;

	
	public Pasaje( LocalDate fechaInicio, LocalDate fechaFin, double costoFijoPorPersona, String aeropuartoLlegada, iOperator operadorExterno ) 
	{
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costoFijoPorPersona = costoFijoPorPersona;
		this.aeropuartoLlegada = aeropuartoLlegada;
		this.operadorExterno = operadorExterno;
	}

	public LocalDate getFechaInicio()
	{
		return this.fechaInicio;
	}

	public LocalDate getFechaFin()
	{
		return this.fechaFin;
	}
	
	@Override
	protected double getImpuestos() 
	{
		return this.operadorExterno.taxes(this.aeropuartoLlegada, this.fechaFin);
	}

	@Override
	public double getCostoTotal() 
	{
		return this.costoFijoPorPersona - this.getImpuestos();
	}	
	
	public void setOperador( iOperator nuevoOperador )
	{
		this.operadorExterno = nuevoOperador;
	}
}
