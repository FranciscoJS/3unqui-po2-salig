package parcialPromocionesCompras.Cliente;
import java.time.LocalDate;
import parcialPromocionesCompras.Supermercado.*;

public class Compra 
{
	LocalDate fechaDeCompra;
	private double montoOriginal;
	private String medioDePago;
//	private double montoFinal;
	private double descuentoAplicado;
	// final Cliente cliente;

	
	public Compra( Cliente cliente, Supermercado supermercado, double montoOriginal, String medioDePago ) throws Exception
	{
		this.montoOriginal = montoOriginal;
		this.fechaDeCompra = LocalDate.now();
		this.medioDePago = medioDePago;
		this.descuentoAplicado = cliente.percibirDescuento(supermercado, montoOriginal);
	}
	
	public LocalDate getFechaDeCompra() 
	{
		return fechaDeCompra;
	}

	public double getMontoOriginal()
	{
		return montoOriginal;
	}

	public String getMedioDePago() 
	{
		return medioDePago;
	}

	public double getMontoFinal()
	{
		return this.montoOriginal * this.descuentoAplicado;
	}
	
}
