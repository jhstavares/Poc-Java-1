package org.example.dominio;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {


        String nome;
        String materia;
        int anoEscolar;
        int idade;
        int matricula;
        Double nota;
        int Counter = 1;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Infome o nome do aluno: ");
        nome = scanner.nextLine();

        System.out.println("Informe a materia: ");
        materia = scanner.nextLine();

        System.out.println("Informe o ano escolar: ");
        anoEscolar = scanner.nextInt();

        System.out.println("Informe a idade do : ");
        idade = scanner.nextInt();

        System.out.println("Informe a matricula do : ");
        matricula = scanner.nextInt();

        System.out.println("Informe a nota do: ");
        nota = scanner.nextDouble();


        if (nota > 7) {
            System.out.println("Aprovado");
        }
        if (nota >= 6 || nota == 4) {
            System.out.println("Recuperação");
        }

        if (nota < 4) {
            System.out.println("Reprovado");
        }


    }
}
