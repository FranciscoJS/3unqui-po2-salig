package ejercicio1;

import java.util.EnumSet;

public class Enumerativo 
{
	
	
	public enum NivelLesion
	{
		ROJO(7, "Lesión reciente, nivel alto de riesgo"),
		GRIS(5, "Lesión de algunas horas, nivel medio de riesgo"),
		AMARILLO(3, "Lesión de algunos días, nivel bajo de riesgo"),
		MIEL(1, "Lesión de más de una semana, nivel de riesgo nulo");
		
		private String descripcion;
		private int nivelLesion;
		
		
		private NivelLesion(int nivelLesion, String descripcion)
		{
			this.nivelLesion = nivelLesion;
			this.descripcion = descripcion;
		}

		public int getNivelLesion()
		{
			return this.nivelLesion;
		}
		
		public String getDescripcion()
		{
			return this.descripcion;
		}
		
		 public NivelLesion proximoColor()
		 {
			 NivelLesion[] niveles = NivelLesion.values();
			 final int nivelActual = this.ordinal();
			 return niveles[ (nivelActual + 1) % niveles.length ];
		 }
	
		 
/*
		Página 380 del libro de Deitel: ejemplo de EnumSet.range para obtener un rango específico del enum.
			
			
			
			
			
			
			
			
		  
 */





		
		
		
		
	}
	
}	
	
	
	
	
/*	
	public enum nivelLesion
	{

		
		ROJO(7, "Lesión reciente, nivel alto de riesgo"),
		GRIS(5, ("Lesión de algunas horas, nivel medio de riesgo"),
		AMARILLO(3, "Lesión de algunos días, nivel bajo de riesgo"),
		MIEL(1, "Lesión de más de una semana, nivel de riesgo nulo");

	
	nivelLesion( int  nivelLesion, String descripcion)
	{
		this.nivelLesion = nivelLesion;
		this.descripcion = descripcion;
	}
	
	}
*/

