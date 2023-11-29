package parcialEmpresaIngenieria.actividad;

public class Operario 
{
	
	private int horasTrabajadas;
	private double costoPorHora;
	private int antiguedad;

	
	public Operario(int horasTrabajadas, double costoPorHora, int antiguedad) 
	{
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.costoPorHora = costoPorHora;
		this.antiguedad = antiguedad;
	}

	
	public double costoTotal()
	{
		return this.costoPorHora * this.horasTrabajadas * this.porcentajeExtraPorAntiguedad();
	}
	
	
	private double porcentajeExtraPorAntiguedad()
	{
		if( this.antiguedad > 5 )
		{
			return 1.10;
		}
		else
		{
			return 1;
		}
	}
	
}
