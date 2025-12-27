package br.edu.poo.questao4;

import br.edu.poo.questao4.Exceptions.IdadeException;
import br.edu.poo.questao4.Exceptions.NomeException;

public class Main {

    public static void main(String[] args) {
        ValidadorCadastroImpl validador = new ValidadorCadastroImpl();

        
        try {
            validador.validarNome("Este nome é propositalmente muito longo", 10);
        } catch (NomeException e) {
            System.err.println("Erro de Nome: " + e.getMessage());
        }

        // 2. Provocando IdadeInvalidaException (Checada)
        try {
            validador.validarIdade(150, 0, 120);
        } catch (IdadeException e) {
            System.err.println("Erro de Idade: " + e.getMessage());
        }

        // 3. Provocando IllegalArgumentException (API Java)
        try {
            validador.validarEmail("usuario_at_dominio.com");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro de E-mail: " + e.getMessage());
        }
    }
}
