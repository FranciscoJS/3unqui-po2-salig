package pruebas.localTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.time.temporal.ChronoUnit;

public class ClasePrueba
{
	
	
	public static void main(String[] args)
	{
		final ObjetoPruebaTest objeto = new ObjetoPruebaTest();
		final LocalDate nuevaFecha = objeto.getFecha().plus(5, ChronoUnit.DAYS);
		
		System.out.println( nuevaFecha );
		
	}

}
