package parcialEmpresaViajes.ejercicio01;

import java.time.LocalDate;

public class OperadorExternoNuevo implements iOpInternational
{

	@Override
	public float currentTax(LocalDate date, String airportName)
	{
		return 10;
	}
	

}
