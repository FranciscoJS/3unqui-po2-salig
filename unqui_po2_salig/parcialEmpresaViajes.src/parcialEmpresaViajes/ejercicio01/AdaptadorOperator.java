package parcialEmpresaViajes.ejercicio01;

import java.time.LocalDate;

public class AdaptadorOperator implements iOperator
{
	private iOpInternational operador = new OperadorExternoNuevo();

	@Override
	public float taxes(String aertoportName, LocalDate date)
	{
		return operador.currentTax(date, aertoportName);
	}
}
