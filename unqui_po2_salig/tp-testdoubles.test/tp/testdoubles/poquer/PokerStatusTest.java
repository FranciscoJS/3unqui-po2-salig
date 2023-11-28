package tp.testdoubles.poquer;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import ejercicio1.Enumerativo;

class PokerStatusTest
{
	public static void main(String[] args)
	{
		Carta carta1 = new Carta( "KD" );
		Carta carta2 = new Carta( "KC" );
		Carta carta3 = new Carta( "KT"); 
		Carta carta4 = new Carta( "KP" );
		Carta carta5 = new Carta( "KC" );
		List<Carta> listaDeCartas = Arrays.asList
				(
						carta1, carta2, carta3, carta4, carta5
				);
		PokerStatus estadoMano = new PokerStatus();
		
		
		
		
		// System.out.printf( "%s", listaDeCartas.get(0).getRepresentacion() );
		// System.out.printf( "%s", listaDeCartas.get( (5 + 1) % listaDeCartas.size() ).getRepresentacion() );
		// System.out.printf( "El número de coincidencias es: %d", estadoMano.evaluarCarta(0, listaDeCartas) );
		System.out.println( estadoMano.verificar(listaDeCartas) );
		// System.out.printf( "El nivel de lesion miel se corresponde a %s", miel.getDescripcion() );

	}	
	
	
	
	
	
	
	
	
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	
	PokerStatus estadoMano;
	
	List<Carta> listaDeCartas;
	

	@BeforeEach
	void setUp() throws Exception 
	{
		carta1 = new Carta( "KD" );
		carta2 = new Carta( "KC" );
		carta3 = new Carta( "KT" );
		carta4 = new Carta( "KP" );
		carta5 = new Carta( "KC" );
		
		listaDeCartas = Arrays.asList
				(
						carta1, carta2, carta3, carta4, carta5
				);
		
		estadoMano = new PokerStatus();
	}

	@Test
	void tengoDosCartasMismoNumero()
	{
		assertTrue( estadoMano.mismoValor(carta1, carta2) );
	}
	
	@Test
	void tengoUnaManoDePoker() 
	{
		assertTrue( estadoMano.verificar(listaDeCartas) );
	}

	@Test
	void tengoUnaManoDeCuatroCartasConNumero10MeDaPoker()
	{
		List<Carta> manoPoker2 = Arrays.asList( new Carta( "10D" ), new Carta( "10D" ), new Carta( "KD" ), new Carta( "10D" ), new Carta( "10D" ) );
		
		// Carta carta1 = mock( Carta.class ); // Objeto tonto ó dommie que podemos pasar como parámetro
		
		PokerStatus estadoMano = mock( PokerStatus.class );
		
		
		estadoMano.verificar(manoPoker2);
		when( estadoMano.verificar(manoPoker2) ).thenReturn(true);
		
		
		
	}
	
}
