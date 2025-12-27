package br.edu.poo.questao4;

public interface ValidadorDeCadastro {
    // Valida o nome. Se for nulo ou vazio, deve lançar uma exceção NÃO checada criada pelo aluno.
    void validarNome(String nome, int tamanho);


    // Valida a idade. Se a idade for inválida (ex: negativa ou fora de um limite),
    // deve lançar uma exceção CHECADA criada pelo aluno.
    void validarIdade(int idade, int minima, int maxima) throws Exception;


    // Valida o email. Se não tiver o formato básico (contém "@"),
    // deve lançar uma exceção da API Java, como IllegalArgumentException.
    void validarEmail(String email);
}
