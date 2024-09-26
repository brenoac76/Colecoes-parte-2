package br.com.bcosta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrupoPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.println("\n*****CADASTRO DE PESSOAS*****");

        System.out.println("\nQuantas pessoas você deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();

            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido! Por favor, digite 'M' ou 'F'.");
                i--;
            }
        }

        System.out.println("\nGrupo Masculino: " + grupoMasculino);
        System.out.println("Grupo Feminino: " + grupoFeminino);

        scanner.close();
    }
}
