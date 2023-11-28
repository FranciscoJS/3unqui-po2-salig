package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnumerativoTest
{
		
	public static void main(String[] args)
	{
		Enumerativo.NivelLesion miel = Enumerativo.NivelLesion.MIEL;
		
		System.out.printf( "El nivel de lesion actual es %s%n", miel.name() );
		System.out.printf( "El nivel de lesion siguiente es %s", miel.proximoColor().name() );
		System.out.printf( "El nivel de lesion miel se corresponde a %s", miel.getDescripcion() );

	}	

	
	@BeforeEach
	void setUp() throws Exception
	{
		
	}

	@Test
	void test()
	{
		fail("Not yet implemented");
	}

}
