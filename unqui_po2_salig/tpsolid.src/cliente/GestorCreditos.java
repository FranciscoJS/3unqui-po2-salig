package cliente;
import propiedad.Propiedad;

public interface GestorCreditos
{
	CreditoPersonal solicitarCreditoPersonal(float monto, int plazo);
	
	CreditoHipotecario solicitarCreditoHipotecario(float monto, int plazo, Propiedad propiedad);
}

