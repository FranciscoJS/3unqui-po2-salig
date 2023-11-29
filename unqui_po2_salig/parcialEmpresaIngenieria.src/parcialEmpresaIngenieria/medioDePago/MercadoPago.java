package parcialEmpresaIngenieria.medioDePago;

import parcialEmpresaIngenieria.actividad.Material;

public class MercadoPago implements MedioDePago
{

	@Override
	public double costoTotal(Material material) 
	{
		return ( material.getCantidad() * material.getPrecioUnitario() ) - // Se le resta el descuento
				( (material.getCantidad() * material.getPrecioUnitario()) * this.porcentajeDescuento() / 100); 
	}
	
	private double porcentajeDescuento()
	{
		return 3;
	}
	
}
