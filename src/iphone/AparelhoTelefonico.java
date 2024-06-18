package teste;

public class AparelhoTelefonico extends Iphone implements Telefone {

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo telefone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

}
