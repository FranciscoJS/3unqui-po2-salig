package parcialPromocionesCompras.Cliente;
import parcialPromocionesCompras.Supermercado.*;
import java.time.LocalDate;
import parcialPromocionesCompras.Fase.*;

public class Cliente 
{
	Fase faseActual;
	private String direccionEmail;
	
	public void realizarCompra( Supermercado supermercado, double precio, String medioDePago ) throws Exception
	{
		supermercado.registrarCompra(this, new Compra( this, supermercado, precio, medioDePago ));
	}

	public void setEstado( Fase nuevoEstado )
	{
		this.faseActual = nuevoEstado;
	}
	
	public Fase getFaseActual()
	{
		return this.faseActual;
	}

	public String getDireccionEmail()
	{
		return direccionEmail;
	}
	
	// percibirDescuento(double monto)
	public double percibirDescuento( Supermercado supermercado, double monto ) throws Exception 
	{
		return this.faseActual.getDescuento(this, supermercado, monto);
	}
	
	
}
