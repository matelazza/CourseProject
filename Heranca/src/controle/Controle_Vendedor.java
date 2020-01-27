package controle;

import java.util.List;


import banco.DataBase;
import model.Vendedor;
import java.io.File;
import java.io.FileWriter;
import java.text.Format;


public class Controle_Vendedor extends Controle {

	@Override
	public void cadastrar() {
		Vendedor vendedor =  new Vendedor();
		vendedor.setBairro(perguntaTexto("Digite o Bairro:"));
		vendedor.setCep(perguntaLong("Digite o CEP:"));
		vendedor.setCpf(perguntaTexto("Digite o Cpf:"));
		vendedor.setDataNascimento(perguntaData("Digite a data de Nascimento:"));
		vendedor.setNome(perguntaTexto("Digite o nome:"));
		vendedor.setRg(perguntaTexto("Digite o RG:"));;
		vendedor.setRua(perguntaTexto("Digite a Rua:"));
		vendedor.setSalario(perguntaDouble("Digite o salario:"));
		DataBase.add(vendedor);
		
	}

	@Override
	public void alterar() {
		Long id = perguntaLong("Digite a id do Vendedor");
		List<Vendedor> vendedor = DataBase.getVendedores();
		Boolean achou = false;
		Vendedor vend = null;
		for(int i = 0; i < vendedor.size();i++) {
			vend = vendedor.get(i);
			if(vend.getId().equals(id)) {
				achou = true;
				break;
			}
		}
		if(achou ==false) {
			System.out.println("Vendedor não encontrado:");
			}
	}

	@Override
	public void excluir() {
		Long id = perguntaLong("Digite a id do Vendedor:");
		List<Vendedor> vendedor = DataBase.getVendedores();
		Boolean achou = false;
		Vendedor vend = null;
		for(int i = 0; i < vendedor.size();i++) {
			vend = vendedor.get(i);
			if(vend.getId().equals(id)) {
				achou = true;
				vendedor.remove(i);
				break;
			}
		}
		if(achou == false) {
			System.out.println("Vendedor não encontrado");
			return;
		}
	}

	@Override
	public void listar() {
		List<Vendedor> vendedor = DataBase.getVendedores();
		Vendedor vend = null;
		for(int w = 0; w < vendedor.size();w++) {
			vend = vendedor.get(w);
			System.out.println("Nome:"+ vend.getNome());
			System.out.println("RG:"+ vend.getRg());
			System.out.println("CPF:"+ vend.getCpf());
			System.out.println("Bairro:"+ vend.getBairro());
			System.out.println("Rua:"+ vend.getRua());
			System.out.println("Data Nacimento:"+ vend.getDataNascimento());
			System.out.println("CEP:"+ vend.getCep());
			System.out.println("Salario:"+ vend.getSalario());
		}
	}
	public void relatorio() {
		String diretorio = System.getProperty("user.home","c:/");
		diretorio = File.pathSeparator+"produtos.txt";
		try {
			File arquivo = new File(diretorio);
			if(!arquivo.exists()) {
				arquivo.createNewFile();
			}
		 FileWriter writer = new FileWriter(arquivo);
		 List<Vendedor> vendedores = DataBase.getVendedores();
		 for(Vendedor vend : vendedores) {
			 String linha = "%d	%s	%s %s %s %s %s %s %d\n\r";
			 linha = String.format(linha, 
					 vend.getId(),
					 vend.getNome(),
					 vend.getRg(),
					 vend.getCpf(),
					 vend.getBairro(),
					 vend.getRua(),
					 vend.getDataNascimento(),
					 vend.getCep(),
					 vend.getSalario());
			 	writer.write(linha);
		 }
			writer.close();
		}
		catch(Exception e) {
			System.out.println("Arquivo não pode ser gerado");
			e.printStackTrace();
		}
	}
	
}
