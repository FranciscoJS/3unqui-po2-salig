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

class ConsolidacionTest 
{
	
	Cliente jorge;
	Supermercado walmart;
	
	Consolidacion consolidacion;

	@BeforeEach
	void setUp() throws Exception 
	{
		
		jorge = spy( Cliente.class );
		walmart = mock( Supermercado.class );
		consolidacion = spy ( new Consolidacion() );
		// when(jorge.faseActual).thenReturn(bienvenida);
		// doReturn(0.60).when(jorge).percibirDescuento(eq(walmart), eq(100.0));
	}
	
	@Test
	void verificarQueGetDescuentoDevuelvaElPorcentajeCorrectoEnMontoMayorA50000()
	{
		assertEquals( 0.60, consolidacion.getDescuento(jorge, walmart, 51000) );
	}
	
	@Test
	void verificarQueGetDescuentoDevuelvaPorcentajeCorrectoEnMontoMenorA50000()
	{
		assertEquals( 1, consolidacion.getDescuento(jorge, walmart, 49999) );
	}
	
	@Test
	void verificarQueGetDescuentoDevuelvaPorcentajeCorrectoEnMontoIgualA50000()
	{
		assertEquals( 1, consolidacion.getDescuento(jorge, walmart, 50000) );
	}
	
	@Test
	void verificarQueCantidadCuponesDescuentoSeReduzcaAlLlamarGetDescuento()
	{
		assertEquals( 3, consolidacion.cantidadCuponesDescuento );
		consolidacion.getDescuento(jorge, walmart, 51000);
		assertEquals( 2, consolidacion.cantidadCuponesDescuento );
	}
	
	@Test
	void verificarQueActualizarEstadoSeaLlamadoTresVecesYQueSetEstadoSeaLlamadoUnaVez()
	{
		for( int i = 0; i < 3; i++ )
		{
			consolidacion.getDescuento(jorge, walmart, 50001);
		}
		verify(consolidacion, times(3)).actualizarEstado( any() );
		verify(jorge, atLeastOnce() ).setEstado( any( Fidelizado.class) );
	}
}
