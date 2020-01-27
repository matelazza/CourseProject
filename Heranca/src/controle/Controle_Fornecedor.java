package controle;
import java.io.File;
import java.util.List;
import java.io.FileWriter;


import banco.DataBase;
import model.Fornecedor;

public class Controle_Fornecedor extends Controle {
	
	//Cadastrar
	public void cadastrar() {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setBairro(perguntaTexto("Digite o bairro:"));
		fornecedor.setCep(perguntaLong("Digite o Cep:"));
		fornecedor.setCnpj(perguntaTexto("Digite o cnpj:"));
		fornecedor.setRua(perguntaTexto("Digite a rua:"));
		fornecedor.setRazaoSocial(perguntaTexto("Digite a razão social:"));
		DataBase.add(fornecedor);
	}

	@Override
	public void alterar() {
		Long id = perguntaLong("Digite o id do Fornecedor");
		List<Fornecedor> fornecedor = DataBase.getFornecedores();
		Boolean achou = false;
		Fornecedor forn = null;
		
		for(int i = 0; i < fornecedor.size();i++ ) {
			forn = fornecedor.get(i);
			if(forn.getId().equals(id)) {
				achou = true;
				break;
			}
		}
		if(achou = false) {
			System.out.println("Fornecedor não encontrado");
		}
		forn.setBairro(perguntaTexto("Digite o Bairro"));
		forn.setCep(perguntaLong("Digite o CEP:"));
		forn.setCnpj(perguntaTexto("Digite o Cnpj:"));
		forn.setRua(perguntaTexto("Digite o rua"));
		forn.setRazaoSocial(perguntaTexto("Digite a razão social: "));
	}

	@Override
	public void excluir() {
		Long id = perguntaLong("Digite o codigo do Fornecedor");
		List<Fornecedor> fornecedor = DataBase.getFornecedores();
		Fornecedor forn = null;
		Boolean achou = false;
		for(int w =0; w< fornecedor.size();w++) {
			forn = fornecedor.get(w);
			if(forn.getId().equals(id)){
				achou = true;
				fornecedor.remove(w);
				break;
			}
		}
		if(achou==false) {
			System.out.println("Fornecedor não econtrado:");
			return;
		}
		
	}

	@Override
	public void listar() {
		List<Fornecedor> fornecedor = DataBase.getFornecedores();
		Fornecedor forn = null;
		for(int w =0; w< fornecedor.size();w++) {
			forn = fornecedor.get(w);
			System.out.println("Bairro: "+forn.getBairro());
			System.out.println("CNPJ: "+ forn.getCnpj());
			System.out.println("Razão Social: "+  forn.getRazaoSocial());
			System.out.println("Rua: "+ forn.getRua());
			System.out.println("CEP: "+ forn.getCep());
			System.out.println("");
		}
	}

	@Override
	public void relatorio() {
		String diretorio = System.getProperty("user.home", "c:/");
		diretorio += File.pathSeparator+"clientes.txt";
		try {
			File arquivo = new File(diretorio);
			if(!arquivo.exists()) {
				arquivo.createNewFile();
			}
			FileWriter writer = new FileWriter(arquivo);
			List<Fornecedor> fornecedores =  DataBase.getFornecedores();
			
			for(Fornecedor forn : fornecedores) {
				String linha = "%d	%s |%s |%s |%s |%s\n\r";
				linha = String.format(linha, 
						forn.getId(),
						forn.getCnpj(),
						forn.getRazaoSocial(),
						forn.getRua(),
						forn.getBairro(),
						forn.getCep());
					writer.write(linha);
			}
			writer.close();
		}	
		
			catch(Exception e){
				System.out.println("Falha ao gerar arquivo.");
				e.printStackTrace();
			}
			
		}
		
	}
	
