package service;

import Date.BaseDeDados;

import java.util.Scanner;

public class IniciaCadastroProdutosService {
    private SolicitaInformacoesUsuarioService usuarioService = new SolicitaInformacoesUsuarioService();
    private CadastraProdutosService produtosService = new CadastraProdutosService();
    private BaseDeDados baseDeDados = new BaseDeDados();
    public void inicar() {
        validaOpcoesSelecionada();
    }

    private void validaOpcoesSelecionada(){
        Integer opcaoSelecionada = usuarioService.getPainelDeOpcoes();
        if (opcaoSelecionada == 1) {
            produtosService.getCadastrarNovoProduto();
            baseDeDados.persistirDadosEmArquivoTXT();
            solicitaUsuarioVoltarAoInicio();

        }else if (opcaoSelecionada == 2){
            baseDeDados.listarProdutoCadastradosEmArquivoTXT();
           //produtosService.getListarProdutosCadastrados();
            solicitaUsuarioVoltarAoInicio();

        }else if (opcaoSelecionada == 3) {
            produtosService.getAlterarProduto();
            solicitaUsuarioVoltarAoInicio();

        }else {
            produtosService.getExcluirProduto();
            solicitaUsuarioVoltarAoInicio();
        }
    }

    private void solicitaUsuarioVoltarAoInicio(){
        Scanner entradaValor = new Scanner(System.in);
        System.out.println("Deseja voltar ao menu principal [S | N ]:");
        String opcaoSelecionada = entradaValor.next();
        if (opcaoSelecionada.equalsIgnoreCase("s")){
            validaOpcoesSelecionada();
        }
    }
}
