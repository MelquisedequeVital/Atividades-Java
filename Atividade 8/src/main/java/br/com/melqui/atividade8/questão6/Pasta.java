package br.com.melqui.atividade8.questão6;

import java.util.ArrayList;

public class Pasta implements ArquivoInterface{
    private String nome;
    private ArrayList<ArquivoInterface> arquivos;
    private Pasta pai;

    public Pasta(String nome){
        this.nome = nome;
        this.arquivos = new ArrayList<ArquivoInterface>();
    }
    

    public String getNome(){
        return nome;
    }

    public  int getTamanho(){
        int tamanho = 0;

        for(ArquivoInterface arq : this.arquivos){
            tamanho += arq.getTamanho();
        }

        return tamanho;

    }

    public Pasta getPai(){
        return this.pai;
    }

    public void setPai(Pasta pai){
        this.pai = pai;
    }

    public void adicionar(ArquivoInterface arq){
        arquivos.add(arq);
        arq.setPai(this);
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

    @Override
    public String imprimirEstrutura(){
        StringBuilder pastaString = new StringBuilder();
        StringBuilder indentacao = new StringBuilder();
        int profundidade = this.calculaProfundidade();

        for (int i = 0; i < profundidade; i++) {
            indentacao.append("| ");
        }

        pastaString.append(indentacao.toString()).append(this.toString());

        for (ArquivoInterface arq : this.arquivos) {
            pastaString.append(arq.imprimirEstrutura());
        }

        return pastaString.toString();
    }

    @Override
    public String toString(){
        return this.nome + "/" + "\n";
    }
}
