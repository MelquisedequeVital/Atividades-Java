package br.edu.poo.questao2;

public class IndiceInvalidoException extends RuntimeException {
    public IndiceInvalidoException(String mensagem) {
        super(mensagem);
    }
}

class Buscador {
    public int buscarElemento(int[] vetor, int indice) {
        if (indice < 0 || indice >= vetor.length) {
            // Lançando a exceção em vez de retornar -1
            throw new IndiceInvalidoException("O índice " + indice + " é inválido para o vetor.");
        }
        return vetor[indice];
    }
}
