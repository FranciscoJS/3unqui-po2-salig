package parcialPromocionesCompras.Fase;

public interface MailSender 
{
	
	public void enviarMail( String mailDestinatario, String titulo, String cuerpo );

}
