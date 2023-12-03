package parcialPromocionesCompras.Fase;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import parcialPromocionesCompras.Cliente.Cliente;
import parcialPromocionesCompras.Supermercado.Supermercado;

public class Fidelizado implements Fase
{
	MailSender operador;


	
	public Fidelizado(MailSender operador) 
	{
		super();
		this.operador = operador;
	}

	@Override
	public void actualizarEstado(Cliente cliente) {}
	
	@Override
	public double getDescuento(Cliente cliente, Supermercado supermercado, double monto) throws Exception 
	{
		long diasDeDiferencia = ChronoUnit.DAYS.between( supermercado.fechaUltimaCompra(cliente), LocalDate.now() );
		if( diasDeDiferencia < 1  )
		{
			operador.enviarMail( cliente.getDireccionEmail(), "Gracias por elegirnos", 
					"Gracias por permanecer con nosotros, es un orgullo tenerte como cliente");
			return 1;
		}
		else
		{
			return 1;
		}
	}	
	
}
