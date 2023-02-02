package org.example.dominio;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {


        String nome;
        int idade;
        int matricula;
        Double nota;
        int Counter = 1;
        SituacaoAluno situacaoAluno;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Infome o nome do aluno: ");
        nome = scanner.nextLine();


        System.out.println("Informe a idade do : ");
        idade = scanner.nextInt();


        System.out.println("Informe a nota do: ");
        nota = scanner.nextDouble();


        if (nota >= 7) {
            System.out.println(SituacaoAluno.APROVADO);
        }
        if (nota == 6 || nota == 4 || nota == 5) {
            System.out.println(SituacaoAluno.RECUPERACAO);
        }

        if (nota < 4) {
            System.out.println(SituacaoAluno.REPROVADO);
        }


    }
}
