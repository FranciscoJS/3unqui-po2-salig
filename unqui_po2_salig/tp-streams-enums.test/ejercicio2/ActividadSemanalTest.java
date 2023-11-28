package ejercicio2;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio1.Enumerativo;

class ActividadSemanalTest
{


	ActividadSemanal[] act =
		{
				new ActividadSemanal( DiaDeLaSemana.LUNES, LocalTime.of(15, 30), 90, Deportes.FUTBOL ),
				new ActividadSemanal( DiaDeLaSemana.LUNES, LocalTime.of(18, 00), 90, Deportes.FUTBOL),
				new ActividadSemanal( DiaDeLaSemana.VIERNES, LocalTime.of(17, 00), 90, Deportes.FUTBOL),
				new ActividadSemanal( DiaDeLaSemana.SABADO, LocalTime.of(20, 00), 90, Deportes.FUTBOL)
		};

		
		
	// List<ActividadSemanal> actividades = Arrays.
			

	
			
			
			
			public static void main(String[] args)
			{
				final ActividadSemanal actividad1 = new ActividadSemanal( DiaDeLaSemana.LUNES, LocalTime.of(18, 00), 90, Deportes.FUTBOL);
				List<ActividadSemanal> actividades = Arrays.asList
						(
								new ActividadSemanal( DiaDeLaSemana.LUNES, LocalTime.of(15, 30), 90, Deportes.FUTBOL ),
								new ActividadSemanal( DiaDeLaSemana.LUNES, LocalTime.of(18, 00), 90, Deportes.FUTBOL),
								new ActividadSemanal( DiaDeLaSemana.VIERNES, LocalTime.of(17, 00), 90, Deportes.FUTBOL),
								new ActividadSemanal( DiaDeLaSemana.SABADO, LocalTime.of(20, 00), 90, Deportes.FUTBOL),
								new ActividadSemanal( DiaDeLaSemana.JUEVES, LocalTime.of(10, 30), 120, Deportes.TENNIS),
								new ActividadSemanal( DiaDeLaSemana.MARTES, LocalTime.of(20, 00), 40, Deportes.BASKET),
								new ActividadSemanal( DiaDeLaSemana.SABADO, LocalTime.of(17, 00), 60, Deportes.JABALINA),
								new ActividadSemanal( DiaDeLaSemana.VIERNES, LocalTime.of(19, 00), 90, Deportes.RUNNING),
								new ActividadSemanal( DiaDeLaSemana.SABADO, LocalTime.of(10, 30), 120, Deportes.TENNIS),
								new ActividadSemanal( DiaDeLaSemana.LUNES, LocalTime.of(19, 00), 90, Deportes.RUNNING),
								new ActividadSemanal( DiaDeLaSemana.MIERCOLES, LocalTime.of(16, 00), 90, Deportes.RUNNING)
						);
				
				
				// GestorActividades.getFutbol(actividades).forEach( System.out::println );
				// GestorActividades.getComplejidad(actividades, 3).forEach( System.out::println );
				// System.out.println( GestorActividades.getHorasTotales(actividades) );
				// System.out.println( GestorActividades.getActividadEconomica( actividades, Deportes.FUTBOL ) );
				GestorActividades.getActividadesMenosCostosas(actividades).entrySet().forEach(System.out::println);
				// actividades.stream().forEach( System.out::println );
				
				/*
				 
				 
				System.out.printf( "El nivel de lesion siguiente es %s", miel.proximoColor().name() );
				System.out.printf( "El nivel de lesion miel se corresponde a %s", miel.getDescripcion() );
				*/

			}
	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
