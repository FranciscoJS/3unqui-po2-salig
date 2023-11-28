package pruebas.localTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ObjetoPruebaTest 
{
	public LocalDate fecha;
	
	public ObjetoPruebaTest()
	{
		this.fecha = LocalDate.of( 1995, 8, 31 );
	}
	
	public LocalDate getFecha()
	{
		return fecha;
	}
	
}
