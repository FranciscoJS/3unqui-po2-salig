package tp03.ejercicio01;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Counter
{
	private List<Integer> listaDeNumeros = new ArrayList<Integer>();
	
	public void addNumber(int nro)
	{
		this.listaDeNumeros.add(nro);
	}
	
	public int cantidadDePares()
	{
		int contador = 0;
		for( int numero: this.listaDeNumeros )
		{
			if( (numero % 2) == 0 )
			{
				++contador;
			}
		}
		return contador;
	}
	
	
	public int cantidadDeImpares()
	{
		int contador = 0;
		for( int numero: this.listaDeNumeros )
		{
			if( (numero % 2) != 0 )
			{
				++contador;
			}
		}
		return contador;
	}

	
	public int cantidadDeMultiplosDe_(int nro)
	{
		int contador = 0;
		for( int numero: this.listaDeNumeros )
		{
			if( (numero % nro) == 0 )
			{
				++contador;
			}
		}
		return contador;
	}


}
