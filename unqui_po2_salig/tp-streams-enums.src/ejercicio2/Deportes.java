package ejercicio2;

public enum Deportes
{
	RUNNING(1),
	FUTBOL(2),
	BASKET(2),
	TENNIS(3),
	JABALINA(4);
	
	private int nivelComplejidad;
	Deportes( int nivelComplejidad )
	{
		this.nivelComplejidad = nivelComplejidad;
	}
	
	public int getNivelComplejidad()
	{
		return this.nivelComplejidad;
	}
}
