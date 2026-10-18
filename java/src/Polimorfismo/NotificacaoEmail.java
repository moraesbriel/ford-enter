package Polimorfismo;

public class NotificacaoEmail implements INotificacao {
	
	@Override
	public void enviarNotificacao() {
		System.out.println("Enviando notificação por e-mail...");
		System.out.println("E-mail enviado com sucesso!\n");
	}	
}