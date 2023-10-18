package banco;
import cliente.*;

public interface SistemaInformatico
{
	void agregarCliente(Cliente cliente);
	
	void agregarSolicitud(SolicitudCredito solicitud);
	
	float calcularMontoDesenbolso();
}
