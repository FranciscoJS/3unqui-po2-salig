package cliente;

public abstract class SolicitudCredito
{
	final Cliente cliente;
	protected float monto;
	protected int plazo;
	
	SolicitudCredito(Cliente cliente, float monto, int plazo)
	{
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}
	
	public float getMonto()
	{
		return this.monto;
	}
	
	protected float montoCuotaMensual()
	{
		return this.monto / plazo;
	}
	
	public abstract boolean esAceptable();
	
	public String getNombreSolicitante()
	{
		return this.cliente.getNombre() + " " + this.cliente.getApellido();
	}

}
