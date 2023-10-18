package banco;
import cliente.*;

import static org.junit.Assume.assumeFalse;

import java.util.ArrayList;
import java.util.Collection;

public class Banco implements SistemaInformatico
{
	private Collection<Cliente> listaClientes = new ArrayList<Cliente>();
	private Collection<SolicitudCredito> listaSolicitudesCredito = new ArrayList<SolicitudCredito>();
	

	public Collection<Cliente> getListaClientes()
	{
		return this.listaClientes;
	}
	
	public Collection<SolicitudCredito> getListaSolicitudesCredito()
	{
		return this.listaSolicitudesCredito;
	}
	
	public void agregarCliente(Cliente cliente)
	{
		this.listaClientes.add(cliente);
	}
	
	public void agregarSolicitud(SolicitudCredito solicitud)
	{
		this.listaSolicitudesCredito.add(solicitud);
	}
	
	public float calcularMontoDesenbolso()
	{
		return (float) this.listaSolicitudesCredito.stream().filter( solicitud -> solicitud.esAceptable() )
				.mapToDouble( solicitud -> solicitud.getMonto() )
				.sum();
	}
}
