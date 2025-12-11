package br.com.melqui.atividade8.questão6;

public class ArquivoDados implements ArquivoInterface{
    private String nome;
    private int tamanho;
    private Pasta pai;

    public ArquivoDados(String nome, int tamanho){
        this.nome = nome;
        this.tamanho = tamanho;

    }

    @Override
    public void setPai(Pasta pai){
        this.pai = pai;
    }

    public Pasta getPai(){
        return this.pai;
    }

    public String getNome(){
        return this.nome;
    }

    public int getTamanho(){
        return this.tamanho;
    }


    private int calculaProfundidade(){
        int profundidade = 0;
        Pasta atual = this.pai;
        while(atual!=null){
            profundidade++;
            atual = atual.getPai();
        }

        return profundidade;
    }


    public String imprimirEstrutura(){
        StringBuilder indentacao = new StringBuilder();
        int profundidade = this.calculaProfundidade();
    
        for (int i = 0; i < profundidade; i++) {
            indentacao.append("| ");
        }

        return indentacao.toString() + this.toString() + "\n";
    }

    @Override
    public String toString(){
        return this.nome + "(" + this.tamanho + ")";
    }
}
