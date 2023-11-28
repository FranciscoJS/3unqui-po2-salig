package tp.testdoubles.poquer;

import java.util.List;

public class PokerStatus 
{
	

	
	/*
	public int verificar( List<Carta> mano )
	{
		int coincidencias = 0;
		int i = 0;
		Carta carta1 = mano.get(i); // Selecciona la carta actual
		Carta carta2 = mano.get( (i + 1) % mano.size() );
		while( i < mano.size() )
		{
			if( this.mismoValor(carta1, carta2) )
			{
				coincidencias++;
			}
			i++;	
		}
		return coincidencias;
	}
	*/
		
		/*
		for( int i = 0; i < mano.size(); i++ )
		{
			Carta carta1 = mano.get(i); // Selecciona la carta actual
			Carta carta2 = mano.get( (i + 1) % mano.size() );

			if( this.mismoValor(carta1, carta2) )
			{
				coincidencias++;
			}
		}
		
		return coincidencias;
	}
	*/
	
	
	public boolean verificar( List<Carta> mano )
	// Hay una forma práctica de hacerlo utilizando hashMap, agrupando en pares de palo, valor y acumulando 
	{
		int coincidencias = 0;
		for( int i = 0; i < mano.size(); i++ )
		{
			if( this.evaluarCarta(i, mano) )
			{
				coincidencias++;
			}
		}
		return coincidencias > 3;
	}

	
	
	/*
	public int evaluarCarta( int indiceCarta, List<Carta> mano )
	{
		int coincidencias = 0;
		for( int i = 0; i < mano.size(); i++)
		{
			if( this.mismoValor( mano.get(indiceCarta), mano.get(i)) )
			{
				coincidencias++;
			}
		}
		return coincidencias - 1;
	} 
	*/
	
	
	public boolean evaluarCarta( int indiceCarta, List<Carta> mano )
	{
		int coincidencias = 0;
		int j = indiceCarta;
		for( int i = 0; i < mano.size() - 1; i++)
		{
			if( this.mismoValor( mano.get(indiceCarta), mano.get( (j+1) % mano.size() )) )
			{
				coincidencias++;
			}
			j++;
		}
		return coincidencias > 2;
	} 
	
	
	public boolean mismoValor( Carta carta1, Carta carta2 )
	{
		if ( carta1.getRepresentacion().length() == carta2.getRepresentacion().length() )
		{
			return carta1.getRepresentacion().charAt(0) == carta2.getRepresentacion().charAt(0);
		}
		else
		{
			return false;
		}
	}
	
}
