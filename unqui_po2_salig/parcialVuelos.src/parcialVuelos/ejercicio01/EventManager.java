package parcialVuelos.ejercicio01;
import java.util.HashSet;
import java.util.Set;

public class EventManager implements Observable
{
	Set <Observer> observerSet = new HashSet<>();
/*
		Set par de: 
 */
	
	@Override
	public void addObserver( AirportStatus t, Observer o ) 
	{
		observerSet.add(o);
	}

	@Override
	public void deleteObserver(Observer o)
	{
		observerSet.remove(o);
	}

	@Override
	public void notifyObservers()
	{
		for( Observer observer: observerSet )
		{
			observer.update();
		}
	}
	
}
