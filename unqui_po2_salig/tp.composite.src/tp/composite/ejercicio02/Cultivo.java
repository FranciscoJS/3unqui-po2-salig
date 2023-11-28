package tp.composite.ejercicio02;

public class Cultivo extends Parcela
{
	private double precio;
	private float nombreCultivo;
	
	public Cultivo(double precio, float nombreCultivo)
	{
		super();
		this.precio = precio;
		this.nombreCultivo = nombreCultivo;
	}
	
	
	public double getPrecio()
	{
		return precio;
	}
	
	
	public void setPrecio(double precio)
	{
		this.precio = precio;
	}

	
	public float getNombreCultivo()
	{
		return nombreCultivo;
	}
	
	
	
	
	

}
