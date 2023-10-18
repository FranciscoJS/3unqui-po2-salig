package cliente;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CreditoPersonalTest
{
	
	public static void main(String[] args)
	{
		final Cliente jorge = new Cliente( "Jorge", "Sosa", "Tucumán 3137", 38, 8333.5f );
		final CreditoPersonal credito1 = jorge.solicitarCreditoPersonal(30000f, 5);
		final CreditoPersonal credito2 = jorge.solicitarCreditoPersonal(29000f, 5);
		
		System.out.printf( "%f%n", jorge.getSueldoNetoMensual() * 0.7 );
		System.out.printf( "%f", jorge.getSueldoNetoAnual() );

	}	

	
	private Cliente jorge;
	private Cliente walter;
	private CreditoPersonal credito1;
	private CreditoPersonal credito2;
	private CreditoPersonal credito3;

	
	@BeforeEach
	void setUp() throws Exception 
	{
		jorge = new Cliente( "Jorge", "Sosa", "Tucumán 3137", 38, 8333f );
		walter = new Cliente("Walter", "Perez", "Suipacha 502", 40, 1100f);
		credito1 = jorge.solicitarCreditoPersonal(30000f, 5);
		credito2 = jorge.solicitarCreditoPersonal(29000f, 5);
		credito3 = walter.solicitarCreditoPersonal(10000f, 2);

		
	}

	@Test
	void credito1NoEsAceptable()
	{
		assertFalse( credito1.esAceptable() );
	}
	
	@Test
	void credito2EsAceptable()
	{
		assertTrue( credito2.esAceptable() );
	}
	
	@Test
	void credito3NoEsAceptable()
	{
		assertFalse( credito3.esAceptable() );
	}
}
