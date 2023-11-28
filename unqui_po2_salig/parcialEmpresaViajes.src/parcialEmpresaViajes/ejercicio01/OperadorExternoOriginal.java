package parcialEmpresaViajes.ejercicio01;

import java.time.LocalDate;

public class OperadorExternoOriginal implements iOperator // Objeto creado para poder correr los test, no contemplado en el parcial.
{

	@Override
	public float taxes(String aertoportName, LocalDate date)
	{
		return 10;
	}

}
