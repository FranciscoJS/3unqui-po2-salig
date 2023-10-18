package cliente;

public class CreditoPersonal extends SolicitudCredito
{

	CreditoPersonal(Cliente cliente, float monto, int plazo)
	{
		super(cliente, monto, plazo);
	}
	
	@Override
	public boolean esAceptable()
	{
		return this.cliente.getSueldoNetoAnual() >= 15000 & (this.montoCuotaMensual() <= ( this.cliente.getSueldoNetoMensual() * 0.7 ));
	}
}
