package parcialEmpresaIngenieria.actividad;
import java.util.ArrayList;
import java.util.List;
import parcialEmpresaIngenieria.empresa.Empresa;

public class Proyecto implements Actividad
{
	private List<Actividad> actividades = new ArrayList<Actividad>();

	
	public Proyecto() 
	{
	}

	public void add( Actividad nuevaActividad )
	{
		this.actividades.add(nuevaActividad);
	}
	
	public void remove( Actividad actividad )
	{
		actividades.remove(actividad);
	}
	
	@Override
	public double costoTotal(Empresa empresa)
	{
		return this.actividades.stream().mapToDouble( actividad -> actividad.costoTotal(empresa) ).sum() * this.porcentajeCostoGestion();
	}
	
	
	private double porcentajeCostoGestion()
	{
		return 1.20;
	}
	
	
}
