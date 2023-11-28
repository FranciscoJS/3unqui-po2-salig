package parcialVuelos.ejercicio01;
import java.time.LocalDate;

public abstract class AirportStatus
{
	
	public abstract void AirportStatusOK();
	
	public abstract void airportClosedWeather( WeatherEvent reason );
	
	public abstract void airportClosed( String reason );
	
	public abstract void departFlight( String flightNumber, LocalDate time );
	
	public abstract void arriveFlight( String flightNumber, LocalDate time );
	

}
