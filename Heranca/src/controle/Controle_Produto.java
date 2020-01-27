package controle;

import java.util.List;

import banco.DataBase;
import model.Produto;
import java.io.File;
import java.io.FileWriter;

public class Controle_Produto extends Controle {

	@Override
	public void cadastrar() {
		Produto produto =  new Produto();
		produto.setMarca(perguntaTexto("Digite a marca:"));
		produto.setNome(perguntaTexto("Digite o nome:"));
		produto.setPreco(perguntaDouble("Digite o preco"));
		DataBase.add(produto);
	}

	@Override
	public void alterar() {
		Long id = perguntaLong("Digite a Id do Produto:");
		List<Produto> produto = DataBase.getProdutos();
		Boolean achou = false;
		Produto prod =  null;
		for(int w= 0; w < produto.size();w++){
			prod = produto.get(w);
			if(prod.getId().equals(id)) {
				achou =true;
				break;
			}
		}
		if(achou ==false) {
			System.out.println("Produto não encontrado:");
		}
		prod.setMarca(perguntaTexto("Digite a marca:"));
		prod.setNome(perguntaTexto("Digite o nome:"));
		prod.setPreco(perguntaDouble("Digite o preco:"));
	}

	@Override
	public void excluir() {
		Long id = perguntaLong("Digite a Id do produto:");
		List<Produto> produto = DataBase.getProdutos();
		Boolean achou = false;
		Produto prod = null;
		for(int w = 0; w < produto.size();w++) {
			prod = produto.get(w);
			if(prod.getId().equals(id)) {		
				achou = true;
				produto.remove(w);
				break;
			}
		}
		if(achou ==false) {
			System.out.println("Produto não encontrado!");
		}
	}

	@Override
	public void listar() {
		List<Produto> produto = DataBase.getProdutos();
		Produto prod = null;
		for(int i =0 ; i < produto.size();i++) {
			prod = produto.get(i);
			
			System.out.println("Nome: " + prod.getNome());
			System.out.println("Marca: " + prod.getMarca());
			System.out.println("Preco: " + prod.getPreco());
		}
	}

	@Override
	public void relatorio() {
		String diretorio = System.getProperty("user.home", "c:/");
		diretorio += File.pathSeparator+"Produtos.txt";
		try {
			File arquivo = new File(diretorio);
			if(!arquivo.exists()) {
				arquivo.createNewFile();
			}
			FileWriter writer = new FileWriter(arquivo);
			List<Produto>produtos = DataBase.getProdutos();
			for(Produto prod : produtos) {
				String linha = "%d %s %s %d \n\r";
				linha = String.format(linha, 
						prod.getId(),
						prod.getMarca(),
						prod.getPreco());
						writer.write(linha);
			}
		}
		catch(Exception e) {
			System.out.println("Falha ao gerar o arquivo");
			e.printStackTrace();
		}
		
	}
	
}