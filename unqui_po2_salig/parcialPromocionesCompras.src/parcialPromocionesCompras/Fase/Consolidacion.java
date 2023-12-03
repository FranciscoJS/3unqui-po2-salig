package parcialPromocionesCompras.Fase;
import parcialPromocionesCompras.Cliente.Cliente;
import parcialPromocionesCompras.Supermercado.*;

public class Consolidacion implements Fase
{
	int cantidadCuponesDescuento = 3;
	
	@Override
	public void actualizarEstado(Cliente cliente) 
	{
		if( this.cantidadCuponesDescuento == 0 )
		{
			cliente.setEstado( new Fidelizado() );
		}
	}
	
	public double getDescuento(Cliente cliente, Supermercado supermercado, double monto)
	{
		if( monto > 50000 )
		{
			this.cantidadCuponesDescuento --;
			this.actualizarEstado(cliente);
			return 0.60;
		}
		else
		{
			return 1;
		}
	}
	
	
	

}
