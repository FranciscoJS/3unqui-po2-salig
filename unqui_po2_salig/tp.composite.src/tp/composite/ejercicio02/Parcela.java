package tp.composite.ejercicio02;
import java.util.ArrayList;
import java.util.List;


public abstract class Parcela 
{
	private List<Cultivo> cultivos = new ArrayList<Cultivo>();
	
	
	public double gananciaAnual()
	{
		return cultivos.stream().mapToDouble( c -> c.gananciaAnual() / cultivos.size() ).sum();
	}

	public void añadirCultivo(Cultivo cultivo)
	{
		cultivos.add(cultivo);
	}
	
	
	
}


/*
	1° clases primitivas: cultivos
	2° clases contenedoras de las primitivas: parcelas
	
	Clase abstracta que represente tanto a contenedores como primitivos, podría ser la clase parcela.
*/