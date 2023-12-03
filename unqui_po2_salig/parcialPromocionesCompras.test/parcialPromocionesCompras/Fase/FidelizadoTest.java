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
	
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import parcialPromocionesCompras.Cliente.*;
	import parcialPromocionesCompras.Supermercado.*;
	
	public class FidelizadoTest 
	{
		
		
		Cliente jorge;
		Cliente alberto;
		Supermercado walmart;
		
		Fidelizado fidelizado;
		Compra compra1;
		Compra compra2;
		Compra compra3;
		MailSender operador;
		
		
	
		@BeforeEach
		void setUp() throws Exception 
		{
			
			jorge = spy( Cliente.class );
			alberto = spy( Cliente.class );
			walmart = spy( new Supermercado() );
			operador = spy( MailSender.class );
			fidelizado = spy ( new Fidelizado(operador) );

			// when(jorge.faseActual).thenReturn(bienvenida);

			doReturn(1.0).when(jorge).percibirDescuento(eq(walmart), eq(100.0));
			doReturn(1.0).when(alberto).percibirDescuento(eq(walmart), eq(100.0));
			compra1 = mock( Compra.class );
			compra2 = mock( Compra.class );
			compra3 = mock( Compra.class );
			when( compra1.getFechaDeCompra() ).thenReturn( LocalDate.of(2023, 11, 21) );
			when( compra2.getFechaDeCompra() ).thenReturn( LocalDate.of(2023, 12, 01) );
			when( compra3.getFechaDeCompra() ).thenReturn( LocalDate.now() );
			// when( fidelizado.operador ).thenReturn(operador);
			
			doReturn(Arrays.asList( compra1, compra2) ).when( walmart ).obtenerCompras( eq(jorge) );
			
		    // Crear la lista de compras asociadas a jorge
		    List<Compra> comprasJorge = Arrays.asList(compra1, compra2);


		    // Establecer la clave jorge en el HashMap de walmart
		    doReturn(comprasJorge).when(walmart).obtenerCompras(eq(jorge));
			// when(walmart.obtenerCompras(eq(jorge))).thenReturn(Arrays.asList(compra1, compra2));
		    
			// when( walmart.obtenerCompras(jorge) ).thenReturn( Arrays.asList(compra1, compra2) );
	/*
				doReturn es preferente cuando se trabaja con métodos de tipo void.
				En cambio, when se suele usar con métodos que tienen un retorno.
	*/
		    
		    List<Compra> comprasAlberto = Arrays.asList(compra1, compra2, compra3);
			doReturn(comprasAlberto).when(walmart).obtenerCompras(eq(alberto));
		    
			
			
		}
		
		@Test
		void verificarQueGetDescuentoDevuelvaPorcentajeUno() throws Exception
		{
			assertEquals( 1, fidelizado.getDescuento(jorge, walmart, 51000) );
		}
		
		@Test
		void verificarQueNoSeHayaEnviadoElMail() throws Exception
		{
			fidelizado.getDescuento(jorge, walmart, 100);
			verify( operador, times(0) ).enviarMail( jorge.getDireccionEmail(), "Gracias por elegirnos", 
					"Gracias por permanecer con nosotros, es un orgullo tenerte como cliente" );
		}
		
		@Test 
		void verificarQueSíSeEnviéElMail() throws Exception
		{

			fidelizado.getDescuento(alberto, walmart, 100);
			verify(operador, atLeastOnce() ).enviarMail( alberto.getDireccionEmail(), "Gracias por elegirnos", 
					"Gracias por permanecer con nosotros, es un orgullo tenerte como cliente" );
		}
		
		@Test
		void diferenciaEntreDíasEsMenorAUno()
		{
			long diasDeDiferencia = ChronoUnit.DAYS.between( compra3.getFechaDeCompra(), LocalDate.now() );
			assertTrue(diasDeDiferencia < 1, "La diferencia entre días no es menor a 1");
		}
		
		@Test
		void laListaDeComprasDeAlbertoTieneComoUltimaCompraLaFechaActual() throws Exception
		{
			assertEquals( LocalDate.now(), walmart.fechaUltimaCompra(alberto) );
		}

	}
