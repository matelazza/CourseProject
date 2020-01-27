package controle;

import model.Cliente;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import banco.DataBase;

public class Controle_Cliente extends Controle {
	
	public void cadastrar() {
		Cliente cliente = new Cliente();
		cliente.setNome(perguntaTexto("Digite o nome:"));
		cliente.setCpf(perguntaTexto("Digite o CPF:"));
		cliente.setRg(perguntaTexto("Digite o RG:"));
		cliente.setBairro(perguntaTexto("Digite o Bairro:"));
		cliente.setCep(perguntaLong("Digite o CEP:"));
		cliente.setRua(perguntaTexto("Digite a Rua:"));
		Date data = perguntaData("Digite a data de Nascimento:");
		cliente.setDataNascimento(data);
		DataBase.add(cliente);
	}

	@Override
	public void alterar() {
		Long id = perguntaLong("Digite o codigo do Cliente:");
		List<Cliente> clientes = DataBase.getClientes();
		boolean achou = false;
		Cliente cli = null;
		
		for(int w = 0; w < clientes.size();w++) {
				cli = clientes.get(w);
			if(cli.getId().equals(id)) {
				achou = true;
				break;
			}
		}
		
		if(achou == false) {
			System.out.println("Cliente não encontrado!");
			return;
		}
		cli.setNome(perguntaTexto("Digite o nome:"));
		cli.setCpf(perguntaTexto("Digite o CPF:"));
		cli.setRg(perguntaTexto("Digite o Rg:"));
		cli.setBairro(perguntaTexto("Digite o Bairro:"));
		cli.setRua(perguntaTexto("Digite a rua:"));
		cli.setDataNascimento(perguntaData("Digite a Data:"));
		cli.setCep(perguntaLong("Digite o CEP: "));
		
	}

	@Override
	public void excluir() {
		Long id = perguntaLong("Digite o codigo do Cliente");
		List<Cliente> clientes = DataBase.getClientes();
		Cliente cli = null;
		Boolean achou = false;
		for(int w =0; w< clientes.size();w++) {
			cli = clientes.get(w);
			if(cli.getId().equals(id)){
				achou = true;
				clientes.remove(w);
				break;
			}
		}
		if(achou==false) {
			System.out.println("Cliente não econtrado:");
			return;
		}
	}
	public void listar() {
		List<Cliente> clientes = DataBase.getClientes();
		Cliente cli = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for(int w =0; w< clientes.size();w++) {
			cli = clientes.get(w);
			System.out.println("Nome: "+cli.getNome());
			System.out.println("CPF: "+ cli.getCpf());
			System.out.println("RG: "+ cli.getRg());
			System.out.println("Bairro: "+cli.getBairro());
			System.out.println("Rua: "+ cli.getRua());
			System.out.println("CEP: "+ cli.getCep());
			
			System.out.println("Data Nascimento:" + sdf.format(cli.getDataNascimento()));
			System.out.println("");
		}
	}

	@Override
	public void relatorio() {
		
		String diretorio = System.getProperty("user.home", "c:/");
		diretorio += File.pathSeparator+"clientes.txt";
		try {
		File arquivo = new File(diretorio);
		/*
		 * Verificar se o arquivo existe*/
		if(!arquivo.exists()) {
			/*
			 * Caso o arquivo não existia, ele será criado*/
			arquivo.createNewFile();
		}
		FileWriter writer = new FileWriter(arquivo);
		List<Cliente> clientes = DataBase.getClientes();
		for(Cliente cli : clientes) {
			String linha = "%d	%s	%s	%s	%s	%s	%s %d\n\r";
			linha = String.format(linha, 
					cli.getId(),
					cli.getNome(),
					cli.getCpf(),
					cli.getRg(),
					cli.getDataNascimento().toString(),
					cli.getRua(),
					cli.getBairro(),
					cli.getCep());
					writer.write(linha);
		}
		writer.close();
	}
		catch(Exception e) {
			System.out.println("Falha ao gerar o arquivo");
			e.printStackTrace();
		}
	}
}