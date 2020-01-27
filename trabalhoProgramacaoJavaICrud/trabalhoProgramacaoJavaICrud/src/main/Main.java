package main;

import service.IniciaCadastroProdutosService;

/*
* @Autor: By Cezar Marçal - Fadep 2019 - Análise e Desenvolvimento de Sistemas
* */

public class Main {

    public static void main(String[] args) {
        IniciaCadastroProdutosService service = new IniciaCadastroProdutosService();
        service.inicar();
    }
}
