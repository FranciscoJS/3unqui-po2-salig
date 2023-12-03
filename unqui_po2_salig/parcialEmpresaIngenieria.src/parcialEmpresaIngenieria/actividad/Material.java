package parcialEmpresaIngenieria.actividad;

import parcialEmpresaIngenieria.empresa.Empresa;

public class Material 
{
	private double precioUnitario;
	private int cantidad;
	
	
	public Material(double precioUnitario, int cantidad) 
	{
		super();
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}

	public double costoTotal(Empresa empresa)
	{
		// return empresa.getMedioDePago().costoTotal(this);
		return empresa.costoTotalAplicandoMetodoPago(this);
	}

	public double getPrecioUnitario() 
	{
		return precioUnitario;
	}

	public int getCantidad() 
	{
		return cantidad;
	}

}
