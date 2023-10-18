package propiedad;

public class Propiedad
{
	private String descripcion;
	private String direccion;
	private float valorFiscal;
	
	public Propiedad(String descripcion, String direccion, float valorFiscal)
	{
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
	
	String getDescripcion()
	{
		return this.descripcion;
	}
	
	String getDireccion()
	{
		return this.direccion;
	}
	
	public float getValorFiscal()
	{
		return this.valorFiscal;
	}
	
	
}
