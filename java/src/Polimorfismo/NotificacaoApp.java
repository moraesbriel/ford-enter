package Polimorfismo;

public class NotificacaoApp implements INotificacao{

	@Override
	public void enviarNotificacao() {
		System.out.println("Enviando notificação pelo aplicativo...");
		System.out.println("Notificação enviada com sucesso!");		
	}
}