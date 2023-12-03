package parcialPromocionesCompras.Fase;
import parcialPromocionesCompras.Cliente.*;
import parcialPromocionesCompras.Supermercado.*;

public class Bienvenida implements Fase
{
	int cantidadCompras = 10;
	
	@Override
	public void actualizarEstado(Cliente cliente) 
	{
		if( this.cantidadCompras == 0 )
		{
			cliente.setEstado( new Consolidacion() );
		}
	}
	
	

	public double getDescuento(Cliente cliente, Supermercado supermercado, double monto)
	{
		this.cantidadCompras --;
		this.actualizarEstado(cliente);
		return 0.85;
	}

}

