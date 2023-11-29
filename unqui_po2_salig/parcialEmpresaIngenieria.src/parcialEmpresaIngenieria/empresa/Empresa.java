package parcialEmpresaIngenieria.empresa;
import parcialEmpresaIngenieria.actividad.Proyecto;
import parcialEmpresaIngenieria.medioDePago.MedioDePago;

public class Empresa
{
	private String nombre;
	private String cuit;
	private MedioDePago medioDePago;
	private Proyecto proyectoActual;

	public Empresa(String nombre, String cuit, MedioDePago medioDePago, Proyecto proyectoActual)
	{
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.medioDePago = medioDePago;
		this.proyectoActual = proyectoActual;
	}
	
	public String getNombre()
	{
		return nombre;
	}

	public String getCuit() 
	{
		return cuit;
	}

	public void setMedioDePago( MedioDePago medio )
	{
		this.medioDePago = medio;
	}

	public MedioDePago getMedioDePago() 
	{
		return medioDePago;
	}
	
	public double costoActividadActual()
	{
		return this.proyectoActual.costoTotal(this);
	}
	
}
