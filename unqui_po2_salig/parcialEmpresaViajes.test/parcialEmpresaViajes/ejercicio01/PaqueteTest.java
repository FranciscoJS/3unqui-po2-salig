package parcialEmpresaViajes.ejercicio01;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PaqueteTest 
{
	
	Paquete paqueteCompleto;
	
	Excursion cataratasIguazu;
	Excursion ruinasSanIgnacio;
	Excursion saltosMocona;
	Excursion paseoLancha;
	Pasaje vueloBsAsMisiones;
	Pasaje vueloMisionesBsAs;
	Paquete vuelosYCataratas;
	Paquete saltosYPaseoLancha;
	
	
	@BeforeEach
	void setUp() throws Exception 
	{
		

		// Productos
		
		cataratasIguazu = mock( Excursion.class );
		 ruinasSanIgnacio = mock( Excursion.class );
		saltosMocona = mock( Excursion.class );
		paseoLancha = mock( Excursion.class );
		vueloBsAsMisiones = mock( Pasaje.class );
		vueloMisionesBsAs = mock( Pasaje.class );
		
		/*
		Paquete vuelosYCataratas = spy( Paquete.class );
		Paquete saltosYPaseoLancha = spy( Paquete.class );
		*/
		
		// Costos
		when( cataratasIguazu.getCostoTotal() ).thenReturn( (double) 100);
		when( ruinasSanIgnacio.getCostoTotal() ).thenReturn( (double) 200);
		when( saltosMocona.getCostoTotal() ).thenReturn( (double) 300);
		when( paseoLancha.getCostoTotal() ).thenReturn( (double) 500);
		when( vueloBsAsMisiones.getCostoTotal() ).thenReturn( (double) 450);
		when( vueloMisionesBsAs.getCostoTotal() ).thenReturn( (double) 450);
		
		
		// Fechas
		when( vueloBsAsMisiones.getFechaInicio() ).thenReturn(LocalDate.of(2024, 01, 15));
		when( vueloBsAsMisiones.getFechaFin() ).thenReturn(LocalDate.of(2024, 01, 15));
		
		when( vueloMisionesBsAs.getFechaFin() ).thenReturn(LocalDate.of(2024, 01, 25));
		when( vueloMisionesBsAs.getFechaFin() ).thenReturn(LocalDate.of(2024, 01, 25));
		
		when( cataratasIguazu.getFechaInicio() ).thenReturn(LocalDate.of(2024, 01, 16));
		when( cataratasIguazu.getFechaFin() ).thenReturn(LocalDate.of(2024, 01, 16));
		
		when( ruinasSanIgnacio.getFechaInicio() ).thenReturn(LocalDate.of(2024, 01, 17));
		when( ruinasSanIgnacio.getFechaFin() ).thenReturn(LocalDate.of(2024, 01, 17));
		
		when( saltosMocona.getFechaInicio() ).thenReturn(LocalDate.of(2024, 01, 22));
		when( saltosMocona.getFechaFin() ).thenReturn(LocalDate.of(2024, 01, 22));
		
		when( paseoLancha.getFechaInicio() ).thenReturn(LocalDate.of(2024, 01, 24));
		when( paseoLancha.getFechaFin() ).thenReturn(LocalDate.of(2024, 01, 24));
		
		
		
		
		List<Producto> listaProductosI = new ArrayList<Producto> // Al instanciar un ArrayList permito utilizar las operaciones de manejo de arrays.
		(
				Arrays.asList // Arrays.asList crea una vista de la lista, pero no permite modificaciones.
				(
						vueloBsAsMisiones, vueloMisionesBsAs, cataratasIguazu
				)
		);
		
		List<Producto> listaProductosII = new ArrayList<Producto> // Al instanciar un ArrayList permito utilizar las operaciones de manejo de arrays.
		(
				Arrays.asList // Arrays.asList crea una vista de la lista, pero no permite modificaciones.
				(
						saltosMocona, paseoLancha
				)
		);
		
		/*
		vuelosYCataratas = spy( new Paquete( 150, 50, listaProductosI ) );
		when( vuelosYCataratas.getFechaFin() ).thenReturn(LocalDate.of(2024, 01, 24));
		
		saltosYPaseoLancha = spy( new Paquete( 150, 50, listaProductosII ) );
		*/
		
		/*
		when( vuelosYCataratas.listaProductos ).thenReturn( listaProductosI );
		when( saltosYPaseoLancha.listaProductos ).thenReturn( listaProductosII );
		*/
		
		paqueteCompleto = new Paquete( 150, 50, listaProductosI );
		
		
	}

	/*
	@Test
	void costoTotalPaqueteCompletoConListaIEsDe1000() 
	{
		assertEquals( 1000, paqueteCompleto.getCostoTotal() );
	}
	*/

	@Test
	void comprobarQueEsteBienSeteadaLaFecha()
	{
		assertEquals( LocalDate.of(2024, 01, 15), vueloBsAsMisiones.getFechaInicio() );
	}
	
	@Test
	void comprobarCostoTotalPaqueteCompleto()
	{
		assertEquals( 1100, paqueteCompleto.getCostoTotal() );
	}
	
	@Test
	void comprobarFechaInicioPaqueteCompleto()
	{
		assertEquals( LocalDate.of(2024, 01, 15), paqueteCompleto.getFechaInicio() );
	}
	

}
