package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cliente.Cliente;
import cliente.CreditoHipotecario;
import propiedad.Propiedad;

class BancoTest
{
	private Cliente jorge;
	private CreditoHipotecario credito1;
	private CreditoHipotecario credito2;
	private CreditoHipotecario credito3;
	private CreditoHipotecario credito4;
	private CreditoHipotecario credito5;
	private Propiedad propiedad1;
	private Propiedad propiedad2;
	private Banco banco1;

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
		banco1 = new Banco();
		
		banco1.agregarSolicitud(credito1);
		banco1.agregarSolicitud(credito2);
		banco1.agregarSolicitud(credito3);
		banco1.agregarSolicitud(credito4);
		banco1.agregarSolicitud(credito5);
	}

	@Test
	void calculoMontoDesembolsoDaUnTotalDe30000()
	{
		assertEquals( 30000, banco1.calcularMontoDesenbolso() );
	}

}
