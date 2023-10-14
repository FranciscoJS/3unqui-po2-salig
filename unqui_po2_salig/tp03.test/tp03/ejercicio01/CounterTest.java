package tp03.ejercicio01;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CounterTest
{
	private Counter counter;
	
	@BeforeEach
	public void setUp()  throws Exception
	{
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(1);
		counter.addNumber(7);
		counter.addNumber(8);
		counter.addNumber(9);
		counter.addNumber(9);
		counter.addNumber(5);
		counter.addNumber(2);
		/*
		 		En este caso tenemos 8 números impares, 2 números pares.
		 */
		
	}
	
	
	@Test
	public void testContador()
	{
		int cantidadDePares = counter.cantidadDePares();
		int cantidadDeImpares = counter.cantidadDeImpares();
		int multiplosDeCinco = counter.cantidadDeMultiplosDe_(5);
		
		assertEquals(cantidadDePares, 2);
		assertEquals(cantidadDeImpares, 8);
		assertEquals(multiplosDeCinco, 2);
	}
}