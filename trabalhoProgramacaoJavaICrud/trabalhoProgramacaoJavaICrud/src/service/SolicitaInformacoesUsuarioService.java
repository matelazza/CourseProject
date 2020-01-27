package service;

import java.util.Scanner;

public class SolicitaInformacoesUsuarioService {
    private Scanner entradaDeValor = new Scanner(System.in);

    public Integer getPainelDeOpcoes(){
        System.out.println("==============================Bem vindo Ao Sistema Cadastro De Produtos==============================");
        System.out.println("" +
                "[1] - Cadastrar Novo Produto \n" +
                "[2] - Listar Todos Os Produtos Cadastrados\n" +
                "[3] - Alterar Produto\n" +
                "[4] - Excluir Produto \n");
        Integer opcaoSelecionada = entradaDeValor.nextInt();
        validaOpcaoSelecionada(opcaoSelecionada);
        return opcaoSelecionada;
    }

    private void validaOpcaoSelecionada(Integer codigo) {
        try {
            if (codigo <=0 || codigo >= 5) {
                System.out.println("Opção Inválida. Somente as opções listadas no menu são válidas");
                getPainelDeOpcoes();
            }
        }catch (Exception e) {
            System.out.println("Ocorreu um erro inexperado, por favor volte ao menu principal");
        }

    }
}
