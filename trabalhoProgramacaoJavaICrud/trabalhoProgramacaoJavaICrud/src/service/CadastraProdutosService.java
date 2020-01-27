package service;

import model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastraProdutosService {

    private static List<Produto> listaProdutos = new ArrayList<>();
    private Scanner valorInformado = new Scanner(System.in);

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    void getCadastrarNovoProduto() {
        try {
            System.out.println("==============================Cadastrar Novo Produto==============================");
            Produto produto = new Produto();
            // responsÃ¡vel por adicionar um cÃ³digo automÃ¡tico para cada produto
            Integer codigo = 1;
            for (int i = 0; i < listaProdutos.size(); i ++) {
                codigo += 1;
                produto.setCodigo(codigo);
            }
            System.out.println("Informe o nome do produto que deseja adiconar"); String nome = valorInformado.next();
            System.out.println("Informe a marca do produto: "); String marca = valorInformado.next();
            System.out.println("Informe o valor do produto: "); Double precoProduto = valorInformado.nextDouble();
            produto.setNome(nome);
            produto.setMarca(marca);
            produto.setPreco(precoProduto);
            listaProdutos.add(produto);
        }catch (Exception e) {
            System.out.printf("Ocorreu um erro durante a excecuÃ§Ã£o e nÃ£o foi possivel cadastrar o produto informado");
        }
    }

    void getListarProdutosCadastrados(){
        System.out.println("==============================PRODUTOS JÃ� CADASTRADOS==============================");
        if (listaProdutos.isEmpty()){
            System.out.println("Nenhum Produto Foi Cadastrado atÃ© agora");
        }
        for (Produto produto: listaProdutos) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.print("Codigo: " + produto.getCodigo() + " | ");
            System.out.print("Nome: " + produto.getNome() + " | ");
            System.out.print("Marca: " + produto.getMarca() + " | ");
            System.out.println("PreÃ§o: " + produto.getPreco() + " | ");
            System.out.println("---------------------------------------------------------------------------------------");
        }
    }

    void getAlterarProduto() {
        try {
            System.out.println("==============================Alterar Produto==============================");
            System.out.println("Para Alterar Um Produto Ã© necessÃ¡rio informar o cÃ³digo do mesmo");
            Integer codigoProdutoASerAlterado = valorInformado.nextInt();
            verificaPersistenciaProduto(codigoProdutoASerAlterado);
            for (int i = 0; i < listaProdutos.size(); i ++) {
                if (listaProdutos.get(i).getCodigo().equals(codigoProdutoASerAlterado)){
                    System.out.println("Informe um novo nome para o produto: "); String nome = valorInformado.next();
                    System.out.println("Informe uma nova marca para o produto: "); String marca = valorInformado.next();
                    System.out.println("Informe um novo valor para o produto: "); Double preco = valorInformado.nextDouble();
                    listaProdutos.get(i).setNome(nome);
                    listaProdutos.get(i).setMarca(marca);
                    listaProdutos.get(i).setPreco(preco);

                    System.out.println("Produto Alterado com sucesso");
                }
            }
        }catch (Exception e) {
            System.out.println("Ocorreu um erro durante a excecuÃ§Ã£o e nÃ£o foi possivel alterar o produto informado");
        }
    }

    void getExcluirProduto(){
        try {
            System.out.println("==============================Excluir Produto==============================");
            System.out.println("Para Excluir Um Produto Ã© necessÃ¡rio informar o cÃ³digo do mesmo");
            Integer codigoProdutoASerDeletado = valorInformado.nextInt();
            verificaPersistenciaProduto(codigoProdutoASerDeletado);
            for (int i = 0; i < listaProdutos.size(); i ++) {
                if (listaProdutos.get(i).getCodigo().equals(codigoProdutoASerDeletado)){
                    listaProdutos.remove(i);
                    System.out.println("Produto Removido Com Sucesso");
                }
            }


        }catch (Exception e) {
            System.out.printf("Ocorreu um erro durante a excecuÃ§Ã£o e nÃ£o foi possivel excluir o produto informado");
        }
    }

    private void verificaPersistenciaProduto(Integer codigo){
        for (int i =0 ; i < listaProdutos.size(); i++) {
            if (!listaProdutos.get(i).getCodigo().equals(codigo)){
                System.out.println("codigo nao encontrado por favor informe um cÃ³digo vÃ¡lido");
            }
            break;
        }
        if (listaProdutos.isEmpty()){
            System.out.println("nenhum produto foi cadastrado atÃ© agora");
        }
    }

}
