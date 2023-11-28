package ejercicio2;
import java.util.List;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class GestorActividades
{
	
	public static List<ActividadSemanal> getFutbol(List<ActividadSemanal> actividades)
	{
		return actividades.stream().filter( actividad -> actividad.getDeporte() == Deportes.FUTBOL).toList();
	}
	
	public static List<ActividadSemanal> getComplejidad(List<ActividadSemanal> actividades, int nivelComplejidad)
	{
		return actividades.stream().filter( actividad -> actividad.getDeporte().getNivelComplejidad() == nivelComplejidad ).toList();
	}
	
	public static double getHorasTotales( List<ActividadSemanal> actividades )
	{
		return actividades.stream().mapToDouble( actividad -> actividad.getDuracion() ).sum();
	}
	
	public static ActividadSemanal getActividadEconomica( List<ActividadSemanal> actividades, Deportes deporte )
	{
		return actividades.stream().filter( actividad -> actividad.getDeporte() == deporte )
				.min( ActividadSemanal.getComparadorPorCosto() ).get();
	}
	

    public static Map<Deportes, ActividadSemanal> getActividadesMenosCostosas(List<ActividadSemanal> actividades) {
        return actividades.stream()
                .collect(Collectors.groupingBy(
                        ActividadSemanal::getDeporte, // Agrupa por deporte
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparingDouble(ActividadSemanal::costoActividad)), // Encuentra la actividad menos costosa
                                optional -> optional.orElse(null) // Convierte Optional<ActividadSemanal> a ActividadSemanal o null si está vacío
                        )
                ));
    }
	
	/*
	// Map donde recoge actividades semanales y las agrupa en sus respectivas claves Deportes.
    public static Map<Deportes, List<ActividadSemanal>> getActividadesAgrupadas(List<ActividadSemanal> actividades)
    {
        return actividades.stream().collect(
        		Collectors.groupingBy(ActividadSemanal::getDeporte,
        		Collectors.toMap( getActividadEconomica(actividades, actividad.getDeporte()) ) 
        		);            
    }
    */
	
    /*
    public static Map<Deportes, List<ActividadSemanal>> getActividadesAgrupadas(List<ActividadSemanal> actividades)
    {
    	return actividades.stream().collect(
    			Collectors.toMap
    }
    */
    
	
	/*
	public static Map<Deportes, List<ActividadSemanal> > getActividadesEconomicas ( List<ActividadSemanal> actividades )
	{
		actividades.stream().collect(  )
		
	}
	/*
	 		Por un lado tengo los deportes
	 		Por el otro, el costo de la actividad.
	 		Debería filtrar deportes y luego devolver el costo de actividad... así sucesivamente.
	 		
	 */

}
