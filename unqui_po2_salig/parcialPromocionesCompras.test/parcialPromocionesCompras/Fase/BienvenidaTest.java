package parcialPromocionesCompras.Fase;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parcialPromocionesCompras.Cliente.*;
import parcialPromocionesCompras.Supermercado.*;

class BienvenidaTest 
{
	
	Cliente jorge;
	Supermercado walmart;
	
	Bienvenida bienvenida;

	@BeforeEach
	void setUp() throws Exception 
	{
		
		jorge = spy( Cliente.class );
		walmart = mock( Supermercado.class );
		bienvenida = spy ( new Bienvenida() );
		// when(jorge.faseActual).thenReturn(bienvenida);
		// doReturn(0.85).when(jorge).percibirDescuento(eq(walmart), eq(100.0));
	}

	@Test
	void percibirDescuentoBienvenida() throws Exception 
	{
		assertEquals( 0.85, bienvenida.getDescuento(jorge, walmart, 100) );
	}
	
	@Test
	void cantidadDeComprasSeReduceEnUnoAlRealizarCompra() throws Exception
	{
		bienvenida.getDescuento(jorge, walmart, 100);
		assertEquals( 9, bienvenida.cantidadCompras );
	}	

	@Test
	void actualizaFaseDeClienteAlLlamarDiezVecesGetDescuento() throws Exception
	{
		for( int i = 0; i < 10; i++ )
		{
			bienvenida.getDescuento(jorge, walmart, 100);
		}
		assertEquals( 0, bienvenida.cantidadCompras );
		verify(bienvenida, times(10)).actualizarEstado( any() );
		verify(jorge, atLeastOnce() ).setEstado( any( Consolidacion.class) );
	}	
	
}
