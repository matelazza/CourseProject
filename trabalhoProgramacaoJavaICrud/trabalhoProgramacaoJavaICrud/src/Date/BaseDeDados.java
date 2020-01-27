package Date;

import model.Produto;
import service.CadastraProdutosService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDados {

    private File file = new File("ProdutosCadastrados.txt");
    private CadastraProdutosService service = new CadastraProdutosService();
    Integer codigo = null;
    String nome = "";
    String marca = "";
    Double preco = null;

    public void persistirDadosEmArquivoTXT(){
        try {
            FileWriter f = new FileWriter (file, false);
            for(int i = 0; i < service.getListaProdutos().size(); i++){
                codigo = service.getListaProdutos().get(i).getCodigo();
                nome = service.getListaProdutos().get(i).getNome();
                marca = service.getListaProdutos().get(i).getMarca();
                preco = service.getListaProdutos().get(i).getPreco();
                String linha = "%d|%s|%s|%f\n\r";
                linha = String.format(linha, codigo, nome, marca, preco);
                f.write(linha);
            }
            f.close();

        }catch (Exception e) {
            System.out.println("Ocorreu um erro inexperado, por favor tente novamente mais tarde");
            e.printStackTrace();
        }
    }

    public void listarProdutoCadastradosEmArquivoTXT(){
        try {
            FileReader fileReader = new FileReader("ProdutosCadastrados.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String linha;
            while ((linha = reader.readLine()) != null){
                System.out.println(linha);
            }

        }catch (Exception e){
            System.out.println("Ocorreu um erro durante a execução");
        }
    }
}
