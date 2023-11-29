package parcialEmpresaIngenieria.medioDePago;
import parcialEmpresaIngenieria.actividad.Material;

public class Credito implements MedioDePago
{
	private int cantidadDeCuotas;

	
	public Credito(int cantidadDeCuotas) 
	{
		super();
		this.cantidadDeCuotas = cantidadDeCuotas;
	}

	@Override
	public double costoTotal(Material material) 
	{
		return ( material.getCantidad() * material.getPrecioUnitario() ) + // Se le suma el recargo por cuotas
				( (material.getCantidad() * material.getPrecioUnitario()) * this.interesCuotas() / 100); 
	}
	
	private double interesCuotas()
	{
		return cantidadDeCuotas * 4;
	}
	

}
