package br.edu.poo.questao4.Exceptions;

public class NomeException extends RuntimeException{
    public NomeException(){
        super("nome inválido");
    }

    public NomeException(String mensagem){
        super(mensagem);
    }
}
