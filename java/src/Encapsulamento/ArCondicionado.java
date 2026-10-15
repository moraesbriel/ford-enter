package Encapsulamento;

public class ArCondicionado implements IManutencao {
	
	private String marca, modelo;
	private boolean estadoManutencao;
	private boolean ligado;
	private int vidaUtil;
	
	@Override
	public void iniciarManutencao() {
		
		if (this.ligado == false && this.vidaUtil < 100) {
			System.out.println("A manutenção pode ser iniciada.");
			this.vidaUtil ++;
		}
		
		else {
			this.ligado = false;
		}
	}
	
	@Override
	public void finalizarManutencao() {
		
		if (this.ligado == false && this.vidaUtil == 100) {
			this.ligado = true;
			System.out.println("O ar condicionado já pode ser ligado.");
		}
	}
	
	@Override
	public void consultarEstado() {
		
		
	}
}