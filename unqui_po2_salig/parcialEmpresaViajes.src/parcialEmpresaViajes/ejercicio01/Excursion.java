package parcialEmpresaViajes.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion extends Producto
{
	protected LocalDate fechaInicio;
	protected LocalDate fechaFin;
	private double montoImpuestos;

	public Excursion( LocalDate fechaInicio, LocalDate fechaFin, double costoFijoPorPersona, double montoImpuestos )
	{
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costoFijoPorPersona = costoFijoPorPersona;
		this.montoImpuestos = montoImpuestos;
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
		return this.montoImpuestos;
	}

	@Override
	public double getCostoTotal()
	{
		return this.costoFijoPorPersona - this.montoImpuestos;
	}
}
