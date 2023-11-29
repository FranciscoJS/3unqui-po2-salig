package parcialEmpresaIngenieria.actividad;
import java.util.ArrayList;
import java.util.List;
import parcialEmpresaIngenieria.empresa.Empresa;

public class Obra implements Actividad
{
	
	private List<Operario> operarios = new ArrayList<Operario>();
	private List<Material> materiales = new ArrayList<Material>();
	
	
	public Obra(List<Operario> operarios, List<Material> materiales) 
	{
		super();
		this.operarios = operarios;
		this.materiales = materiales;
	}

	@Override
	public double costoTotal(Empresa empresa) 
	{
		double costoOperarios = this.operarios.isEmpty() ? 0 : this.operarios.stream().mapToDouble(operario -> operario.costoTotal()).sum();
		double costoMateriales = this.materiales.isEmpty() ? 0 : this.materiales.stream().mapToDouble(material -> material.costoTotal(empresa)).sum();
		return costoOperarios + costoMateriales;
	}
	
}
