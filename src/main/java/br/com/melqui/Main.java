package br.com.melqui;

import br.com.melqui.atividade8.questão6.ArquivoDados;
import br.com.melqui.atividade8.questão6.Pasta;

public class Main {
    public static void main(String[] args) {
        ArquivoDados app = new ArquivoDados("App.java", 12);
        ArquivoDados manual = new ArquivoDados("Manual.pdf", 200);

        Pasta src = new Pasta("src");
        Pasta main = new Pasta("main");
        Pasta docs = new Pasta("docs");

        src.adicionar(main);
        src.adicionar(docs);

        main.adicionar(app);
        docs.adicionar(manual);

        System.out.println(src.getTamanho());

        System.out.println(src.imprimirEstrutura());
    }
}