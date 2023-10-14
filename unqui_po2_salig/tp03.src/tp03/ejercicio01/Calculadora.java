package tp03.ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora
{
		
		
		private int calculoCociente(int numerador, int denominador)
		{
			return numerador / denominador;
		}
		
		public static void calculoCociente()
		{
			Scanner entrada = new Scanner(System.in);
			int numerador;
			int denominador;
			boolean continuarCiclo = true;
			
			do
			{
				try
				{
					System.out.print("Escribe un numerador de tipo entero: ");
					numerador = entrada.nextInt();
					System.out.print("Escribe el denominador de tipo entero: ");
					denominador = entrada.nextInt();
					int resultado = numerador / denominador;
					System.out.printf("%nResultado de %d / %d = %d%n", numerador, denominador, resultado);
					continuarCiclo = false;
				}
				catch( InputMismatchException errorDeTipo )
				{
					System.err.printf( "%nError: %s%n", errorDeTipo );
					entrada.nextLine();
					System.out.printf("Debe introducir numeros enteros. Intentelo de nuevo...%n%n");
				}
				catch( ArithmeticException errorDeCalculo )
				{
					System.err.printf( "%nError: %s%n", errorDeCalculo );
					entrada.nextLine();
					System.out.printf("El denominador debe ser un numero entero distinto a cero. Intentelo de nuevo...%n%n");
				}
			}
			while( continuarCiclo );
		}
		
}

