package Polimorfismo;

public class NotificacaoSMS implements INotificacao {

	@Override
	public void enviarNotificacao() {
		System.out.println("Enviando notificação por SMS...");
		System.out.println("SMS enviado com sucesso!\n");		
	}
}