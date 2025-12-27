package br.edu.poo.questao3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UsandoMultiCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            List<String> nomes = Arrays.asList("Richard Feynman", "Carl Sagan", "Brian Cox");
// Pode lançar IndexOutOfBoundsException
            System.out.print("Digite um índice (0 a 2, ou número inválido para gerar exceção): ");
            int indice = sc.nextInt();
            sc.nextLine();
            System.out.println("Elemento escolhido: " + nomes.get(indice));
// Pode lançar NullPointerException
            System.out.print("Deseja anular a variável 'nome'? (s/n): ");
            char opcao = sc.nextLine().charAt(0);
            String nome = "Nabucodonosor";
            if (opcao == 's' || opcao == 'S') {
                nome = null;
            }
            System.out.println("Comprimento do nome: " + nome.length());
//Pode lançar UnsupportedOperationException
            System.out.print("Deseja tentar adicionar um elemento à lista imutável? (s/n): ");
            char opcao2 = sc.nextLine().charAt(0);
            if (opcao2 == 's' || opcao2 == 'S') {
                nomes.add("Richard Dawkins");
            }
        } catch (IndexOutOfBoundsException | NullPointerException | UnsupportedOperationException e) {
            System.out.println("Erro durante uso de lista:" + e.getMessage());
        } finally {
            sc.close(); //fecha o Scanner, tendo ou não exceção. É bom para este tipo de coisa!
            System.out.println("Passou pelo finally");
        }
    }
}
