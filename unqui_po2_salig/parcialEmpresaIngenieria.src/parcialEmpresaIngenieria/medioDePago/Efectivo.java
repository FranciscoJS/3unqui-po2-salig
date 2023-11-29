package parcialEmpresaIngenieria.medioDePago;

import parcialEmpresaIngenieria.actividad.Material;

public class Efectivo implements MedioDePago
{

	@Override
	public double costoTotal(Material material)
	{
		return material.getCantidad() * material.getPrecioUnitario();
	}
	
	

}
