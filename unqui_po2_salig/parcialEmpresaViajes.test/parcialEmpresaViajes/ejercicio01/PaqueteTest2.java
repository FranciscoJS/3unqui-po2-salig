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

public class PaqueteTest2 
{
	
	// Excursiones
	Excursion cataratasIguazu;
	Excursion ruinasSanIgnacio;
	Excursion saltosMocona;
	Excursion paseoLancha;
	
	// Pasajes
	Pasaje vueloBsAsMisiones;
	Pasaje vueloMisionesBsAs;
	Pasaje vueloBsAsMendoza;
	
	// Paquetes
	Paquete paqueteCompleto;
	Paquete vuelosYCataratas;
	Paquete saltosYPaseoLancha;
	
	// Operadores externos
	OperadorExternoOriginal operador;
	AdaptadorOperator operadorNuevo;
	

	



	
	
	@BeforeEach
	void setUp() throws Exception 
	{
		
		
		cataratasIguazu = new Excursion( LocalDate.of(2023, 01, 14), LocalDate.of(2023, 01, 14), 300, 50 );
		
		ruinasSanIgnacio = new Excursion( LocalDate.of(2023, 01, 18), LocalDate.of(2023, 01, 18), 450, 80 ); // Costo total: 370
		saltosMocona = new Excursion( LocalDate.of(2023, 01, 21), LocalDate.of(2023, 01, 21), 700, 150 );
		paseoLancha = new Excursion( LocalDate.of(2023, 01, 13), LocalDate.of(2023, 01, 13), 1500, 300 );
		
		// Vuelos
		operador = new OperadorExternoOriginal();
		operadorNuevo = new AdaptadorOperator();
		vueloBsAsMisiones = new Pasaje( LocalDate.of(2023, 01, 12), LocalDate.of(2023, 01, 12), 500, "Misiones",  operador); // Costo total: 490
		vueloMisionesBsAs = new Pasaje( LocalDate.of(2023, 01, 25), LocalDate.of(2023, 01, 25), 500, "Buenos Aires",  operador);
		vueloBsAsMendoza = new Pasaje( LocalDate.of(2023, 02, 05), LocalDate.of(2023, 02, 05), 500, "Mendoza",  operador);
	
		List<Producto> listaProductosI = new ArrayList<Producto> // Al instanciar un ArrayList permito utilizar las operaciones de manejo de arrays.
		(
				Arrays.asList // Arrays.asList crea una vista de la lista, pero no permite modificaciones.
				(
						vueloBsAsMisiones, cataratasIguazu, vueloMisionesBsAs
				)
		);
		
		List<Producto> listaProductosII = new ArrayList<Producto> // Al instanciar un ArrayList permito utilizar las operaciones de manejo de arrays.
		(
				Arrays.asList // Arrays.asList crea una vista de la lista, pero no permite modificaciones.
				(
						saltosMocona, paseoLancha
				)
		);
		
		
		paqueteCompleto = new Paquete( 150, 50, listaProductosI ); // Costo total: 1330
		saltosYPaseoLancha = new Paquete( 150, 50, listaProductosII ); // Costo total: 1850
		
		
	}

	
	@Test
	void fechaInicioPaqueteCompleto()
	{
		assertEquals( LocalDate.of(2023, 01, 12), paqueteCompleto.getFechaInicio() );
	}
	
	@Test
	void precioTotalPaqueteCompleto()
	{
		assertEquals( 1330, paqueteCompleto.getCostoTotal() );
	}
	
	@Test
	void fechaFinPaqueteCompleto()
	{
		assertEquals( LocalDate.of(2023, 01, 25), paqueteCompleto.getFechaFin() );
	}
	
	@Test
	void agregoProductoSaltosYPaseoEnLanchaYComprueboCostoTotal()
	{
		paqueteCompleto.agregarProducto(saltosYPaseoLancha);
		assertEquals( 3180, paqueteCompleto.getCostoTotal() );
	}
	
	@Test
	void agregoProductoSaltosYPaseoEnLanchaJuntoConRuinasSanIgnacioYComprueboCostoTotalYFechaFin()
	{
		paqueteCompleto.agregarProducto(saltosYPaseoLancha);
		paqueteCompleto.agregarProducto(ruinasSanIgnacio);
		assertEquals( 3550, paqueteCompleto.getCostoTotal() );
		assertEquals( LocalDate.of(2023, 01, 25), paqueteCompleto.getFechaFin() );
	}
	
	@Test
	void agregoProductoSaltosYPaseoEnLanchaJuntoConRuinasSanIgnacioYVueloAMendozaComprueboCostoTotalYFechaFin()
	{
		paqueteCompleto.agregarProducto(saltosYPaseoLancha);
		paqueteCompleto.agregarProducto(ruinasSanIgnacio);
		paqueteCompleto.agregarProducto(vueloBsAsMendoza);
		assertEquals( 4040, paqueteCompleto.getCostoTotal() );
		assertEquals( LocalDate.of(2023, 02, 05), paqueteCompleto.getFechaFin() );
	}
	
	@Test
	void cambioOperadorExternoDeVueloYSigueRespondiendoACostoTotal()
	{
		assertEquals( 490, vueloBsAsMendoza.getCostoTotal() );
		vueloBsAsMendoza.setOperador(operadorNuevo);
		assertEquals( 490, vueloBsAsMendoza.getCostoTotal() );
	}
}
