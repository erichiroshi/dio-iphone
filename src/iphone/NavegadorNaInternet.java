package teste;

public class NavegadorNaInternet extends Iphone implements NavegarNaInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibe página");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adiciona nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualiza página");
	}

}
