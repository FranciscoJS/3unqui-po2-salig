package tp03.ejercicio01;

public class CalculadoraTest
{

	public static void main(String[] args)
	{
		// Calculadora.calculoCociente();
		final int numero1 = -12;
		final int numero2 = 10;
		System.out.printf( "%d mod %d = %d%n", numero1, numero2, (numero1 % numero2) );
		System.out.printf( "%d mod %d = %d", (numero1 % numero2), 2, ( (numero1 % numero2) % 2 ) );
		
	}

}
