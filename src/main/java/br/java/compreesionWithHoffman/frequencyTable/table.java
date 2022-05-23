package br.java.compreesionWithHoffman.frequencyTable;

public class table {

    private static final int TAM = 255;
    public static byte vetor_posicoes[] = new byte[TAM];

    public static byte retornoVetorPosicaoFrequencia(){
        return vetor_posicoes[TAM];
    }

    public void zerarPosicoesTabela(){
        for(int i = 0 ; i < TAM ; i+=1){
            vetor_posicoes[i] = 0;
        }
    }

    public void gerarFrequencias(char[] mensagem){
        int flag_controle = 0;
        for (char m : mensagem){
            vetor_posicoes[mensagem[flag_controle]]+=1;
            flag_controle+=1;
        }
    }

    public void gerarVetorFrequencia(){
        for(int i = 0 ; i < TAM ; i+=1){
            if(vetor_posicoes[i] > 0){
                System.out.println(String.format("%d %c %d",i,i,vetor_posicoes[i]));
            }
        }
    }

}
