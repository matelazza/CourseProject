package controle;

import java.util.Scanner;
import banco.DataBase;
import controle.Controle_Cliente;

public class Menu {
	private Integer opcao;
	private Integer operacao;
	private Scanner ler;
	private static Controle_Cliente controle_cliente;
	
	public Menu() {
		this.ler = new Scanner(System.in);
	}
	
	public Integer getOpcao() {
		System.out.println("-=-=-=Menu-=-=-=-=");
		System.out.println("1: Cadastrar");
		System.out.println("2:Excluir");
		System.out.println("3:Alterar");
		System.out.println("4:Sair");
		System.out.println("");
		System.out.println("Sua opcao:");
		
		String texto = ler.nextLine();
		try {
			opcao = Integer.parseInt(texto);
			if(opcao < 1 || opcao > 4) {
				System.out.println("Opcao Invalida!");
				return getOpcao();
			}
			if(opcao == 1) {
				operacao = cadastro();
				if(operacao == 2) {
					controle_cliente.cadastrar();
				}
			}
		}catch(Exception e) {
			System.out.println("Não deve conter caracteres.");
			return getOpcao();
		}
		
		return opcao;
	}

	public void setOpcao(Integer opcao) {
		this.opcao = opcao;
	}
	
	public Integer cadastro() {
		System.out.println("1:Pessoa");
		System.out.println("2:Cliente");
		System.out.println("3:Fornecedor");
		System.out.println("4:Produto");
		System.out.println("5:Vendedor");
		System.out.println("6:Exit");
		try {
		operacao = perguntaInteger("Sua opcao:");
		if(operacao < 1 || operacao > 6) {
			System.out.println("Opcao Invalida.");
		}
		}catch(Exception e) {
			System.out.println("Opcao Invalida.");
		}
		return operacao;
	}
	
	public Integer perguntaInteger(String texto) {
		System.out.println(texto);
		texto = ler.nextLine();
		Integer num = Integer.parseInt(texto);
		return num;
	}
	
}

