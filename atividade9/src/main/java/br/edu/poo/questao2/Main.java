package br.edu.poo.questao2;

public class Main {

    public static void main(String[] args) {
        Buscador b = new Buscador();
        int[] numeros = {10, 20, 30};

        int resultado = b.buscarElemento(numeros, 5); // índice inválido
        System.out.println("Elemento encontrado: " + resultado);

    }
}
