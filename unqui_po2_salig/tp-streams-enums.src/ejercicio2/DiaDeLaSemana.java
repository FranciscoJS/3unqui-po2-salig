package ejercicio2;

public enum DiaDeLaSemana
{
	LUNES(500), MARTES(500), MIERCOLES(500), JUEVES(1000), VIERNES(1000), SABADO(1000), DOMINGO(1000);
	
	private double costeDia;
	
	DiaDeLaSemana(double costeDia)
	{
		this.costeDia = costeDia;
	}
	
	public double getCosteDia()
	{
		return this.costeDia;
	}
}
