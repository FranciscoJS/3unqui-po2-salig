package cliente;
import propiedad.Propiedad;

public class CreditoHipotecario extends SolicitudCredito
{
	private Propiedad propiedad;
	
	CreditoHipotecario(Cliente cliente, float monto, int plazo, Propiedad propiedad)
	{
		super(cliente, monto, plazo);
		this.propiedad = propiedad;
	}
	
	@Override
	public boolean esAceptable()
	{
		return this.montoCuotaMensual() <= ( this.cliente.getSueldoNetoMensual() * 0.5 ) & this.monto <= propiedad.getValorFiscal() * 0.7 & this.cumpleEdad();
	}
	
	private boolean cumpleEdad()
	{
		return (cliente.getEdad() + this.plazo) <= 65;
	}
	
}
