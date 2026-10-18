package Polimorfismo;

public class ObjetoNotificacao {

	public static void main(String[] args) {
		
		NotificacaoEmail email = new NotificacaoEmail();
		NotificacaoSMS sms = new NotificacaoSMS();
		NotificacaoApp app = new NotificacaoApp();
		
		email.enviarNotificacao();
		sms.enviarNotificacao();
		app.enviarNotificacao();
	}
}