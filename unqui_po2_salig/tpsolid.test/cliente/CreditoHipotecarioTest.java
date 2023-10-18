package cliente;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import propiedad.Propiedad;

class CreditoHipotecarioTest
{
	private Cliente jorge;
	private CreditoHipotecario credito1;
	private CreditoHipotecario credito2;
	private CreditoHipotecario credito3;
	private CreditoHipotecario credito4;
	private CreditoHipotecario credito5;
	private Propiedad propiedad1;
	private Propiedad propiedad2;
	
	@BeforeEach
	void setUp() throws Exception
	{
		propiedad1 = new Propiedad("Chalet", "Tucumán 3137", 100000f);
		propiedad2 = new Propiedad("Casita", "Lavalle 114", 40000f);
		jorge = new Cliente( "Jorge", "Sosa", "Tucumán 3137", 38, 8333f );
		credito1 = jorge.solicitarCreditoHipotecario(30000f, 5, propiedad1);
		credito2 = jorge.solicitarCreditoHipotecario(15000f, 5, propiedad1);
		credito3 = jorge.solicitarCreditoHipotecario(30000f, 5, propiedad2);
		credito4 = jorge.solicitarCreditoHipotecario(15000f, 28, propiedad2);
		credito5 = jorge.solicitarCreditoHipotecario(15000f, 27, propiedad2);
	}

	@Test
	void solicitudCreditoHipotecario1NoEsAceptablePorSuperarCincuentaPorCientoDeIngresoMensual()
	{
		assertFalse( credito1.esAceptable() );
	}
	
	@Test
	void solicitudCreditoHipotecario2EsAceptable()
	{
		assertTrue( credito2.esAceptable() );
	}
	
	@Test
	void solicitudCreditoHipotecario3NoEsAceptablePorSuperarSetentaPorCientoDelValorFiscalPropiedad()
	{
		assertFalse( credito3.esAceptable() );
	}
	
	@Test
	void solicitudCreditoHipotecario4NoEsAceptablePorSuperarEdadAntesDeFinalizarPago()
	{
		assertFalse( credito4.esAceptable() );
	}
	
	@Test
	void solicitudCreditoHipotecario5EsAceptableCumpliendo65AñosEnLaÚltimaCuota()
	{
		assertTrue( credito5.esAceptable() );
	}
}
