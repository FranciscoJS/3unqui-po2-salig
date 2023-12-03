package parcialEmpresaIngenieria.actividad;
import parcialEmpresaIngenieria.empresa.Empresa;

public class Transporte implements Actividad
{
	private double distancia;
	private double pesoCarga;
	private double precioPorKg;
	

	public Transporte(double distancia, double pesoCarga, double precioPorKg) 
	{
		super();
		this.distancia = distancia;
		this.pesoCarga = pesoCarga;
		this.precioPorKg = precioPorKg;
	}


	@Override
	public double costoTotal(Empresa empresa) 
	/* 
		En este caso, el atributo empresa no posee ninguna utilidad. En términos de diseño hace un poco de ruido pero
			no es un error tan grave como sería romper encapsulamiento.
	 */
	{
		return this.distancia * this.pesoCarga * this.precioPorKg;
	}
	
	
	
	
	
	
	
	
	

}
