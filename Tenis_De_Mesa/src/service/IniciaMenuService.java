package service;

import java.util.Scanner;

public class IniciaMenuService {
	private Integer opcao;
	private Scanner sc;
	
	public IniciaMenuService() {
		this.sc = new Scanner(System.in);
	}
	
	public Integer getOpcao() {
		System.out.println("-=-=-=-=-Menu-=-=-=-=-");
		System.out.println("--1:Logar--");
		System.out.println("--2:Registrar-se--");
		System.out.println("--3-Sair--");
		String texto = sc.nextLine();
		try {
			opcao = Integer.parseInt(texto);
			if(opcao < 1 || opcao > 3) {
				System.out.println("Opcao Invalida Tente novamente");
			}
		}
		catch(Exception error) {
			System.out.println("Opcao invalida, tente novamente para proceder.");
			getOpcao();
		}
		
		return opcao;
	}

	public void setOpcao(Integer opcao) {
		this.opcao = opcao;
	}
	
	
}
