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
	{
		return this.distancia * this.pesoCarga * this.precioPorKg;
	}
	
	
	
	
	
	
	
	
	

}
