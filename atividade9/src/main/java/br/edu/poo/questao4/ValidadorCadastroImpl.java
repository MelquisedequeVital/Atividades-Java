package br.edu.poo.questao4;

import br.edu.poo.questao4.Exceptions.IdadeException;
import br.edu.poo.questao4.Exceptions.NomeException;


public class ValidadorCadastroImpl implements ValidadorDeCadastro {

    public ValidadorCadastroImpl(){
        
    }
    
    public void validarNome(String nome, int tamanho) {
        if (nome == null || nome.trim().isEmpty() || nome.length() > tamanho) {
            throw new NomeException("Nome nulo, vazio ou excede " + tamanho + " caracteres.");
        }
        System.out.println("Nome validado com sucesso!");
    }

    
    public void validarIdade(int idade, int minima, int maxima) throws IdadeException {
        if (idade < minima || idade > maxima) {
            throw new IdadeException("Idade fora do intervalo permitido: " + minima + " a " + maxima);
        }
        System.out.println("Idade validada com sucesso!");
    }

  
    public void validarEmail(String email) {
        // Validação simples: deve conter '@' e não ser nulo
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Formato de e-mail inválido.");
        }
        System.out.println("E-mail validado com sucesso!");
    }
}