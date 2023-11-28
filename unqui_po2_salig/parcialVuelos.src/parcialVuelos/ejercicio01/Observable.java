package parcialVuelos.ejercicio01;

public interface Observable implements AirportStatus
{
/*
	Observable es la clase que administra los observers.
*/
	
	void addObserver( AirportStatus t, Observer o );
	
	void deleteObserver( AirportStatus t, Observer o );
	
	void notifyObservers( AirportStatus t, String data );

}
