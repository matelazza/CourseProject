package service;

public class IniciaSistemaService {
	IniciaMenuService iniciaMenu = new IniciaMenuService();
	
	
	public void iniciar() {
		validaOpcaoSelecionada();
	}
	
	public void validaOpcaoSelecionada() {
		Integer opcaoSelecionada = iniciaMenu.getOpcao();
		switch(opcaoSelecionada) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				System.out.println("Saiu do Sistema");
				break;
			default:
				break;
		}
	}
}
