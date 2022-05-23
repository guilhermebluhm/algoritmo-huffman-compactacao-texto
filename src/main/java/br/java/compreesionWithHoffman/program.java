package br.java.compreesionWithHoffman;

import br.java.compreesionWithHoffman.frequencyTable.table;

public class program {

    public static void main(String[] args) {

        char[] mensagem = "ola mundo".toCharArray();

        table t = new table();
        t.zerarPosicoesTabela();
        t.gerarFrequencias(mensagem);
        t.gerarVetorFrequencia();

    }
}
