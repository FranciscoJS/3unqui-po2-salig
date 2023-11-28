package ejercicio2;
import java.time.*;
import java.util.Comparator;


public class ActividadSemanal
{	
	private DiaDeLaSemana dia;
	private LocalTime horaInicio;
	private int duracion;
	private Deportes deporte;
	
	public ActividadSemanal( DiaDeLaSemana dia,  LocalTime horaInicio, int duracion, Deportes deporte)
	{
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	public DiaDeLaSemana getDia()
	{
		return this.dia;
	}
	
	public LocalTime getHoraInicio()
	{
		return this.horaInicio;
	}
	
	public int getDuracion()
	{
		return this.duracion;
	}
	
	public Deportes getDeporte()
	{
		return this.deporte;
	}
	
	public double costoActividad()
	{
		return this.dia.getCosteDia() * this.deporte.getNivelComplejidad();
	}
	
	@Override
	public String toString()
	{
		return String.format( "Dia: %-8s Hora: %-8s Actividad: %-8s Duracion en minutos: %-8d Costo de la actividad: %-3f", 
				this.dia.toString(), this.horaInicio.toString(), this.deporte.toString(), this.duracion, this.costoActividad() );
	}
	
	public static Comparator<ActividadSemanal> getComparadorPorCosto()
	{
		return Comparator.comparingDouble( ActividadSemanal::costoActividad );
	}

	
}
