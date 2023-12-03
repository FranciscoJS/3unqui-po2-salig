package parcialPromocionesCompras.Fase;
import parcialPromocionesCompras.Cliente.*;
import parcialPromocionesCompras.Supermercado.*;

public interface Fase 
{
	
	public void actualizarEstado(Cliente cliente);
	
	public double getDescuento(Cliente cliente, Supermercado supermercado, double monto) throws Exception;

}
