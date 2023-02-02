package org.example;

import org.example.programa.Conta;
import org.example.programa.Pessoa;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBncarias;

    public static void main(String[] args) {
        contasBncarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------Bem vindos a nossa Agência______________________");
        System.out.println("-----------------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar ***********");
        System.out.println("|      Opção 1 - Criar conta      |");
        System.out.println("|      Opção 2 - Depositar        |");
        System.out.println("|      Opção 3 - Sacar            |");
        System.out.println("|      Opção 4 - Transferir       |");
        System.out.println("|      Opção 5 - Listar           |");
        System.out.println("|      Opção 6 - Sair             |");

        int operacoes = input.nextInt();
        switch (operacoes) {
            case 1:
                criarConta();
                break;
            case 2:
                depositar();
                break;

            case 3:
                sacar();
                break;

            case 4:
                tranferir();
                break;

            case 5:
                listarConta();
                break;

            case 6:
                System.out.println("Obrigador por usar nossso serviço");
                System.exit(0);

            default:
                System.out.println("Opção inválida");
                operacoes();
                break;

        }
    }

    public static void criarConta() {
        System.out.println("\nNome: ");
        String nome = input.nextLine();

        System.out.println("\nCF: ");
        String CPF = input.nextLine();

        System.out.println("\nEmail: ");
        String email = input.nextLine();

        Pessoa pessoa = new Pessoa(nome, CPF, email);
        Conta conta = new Conta(pessoa);

        contasBncarias.add(conta);

        System.out.println("Conta criada com sucesso");
        operacoes();

    }

    private static Conta encontraConta(int numeroConta) {
        Conta conta = null;
        if (contasBncarias.size() > 0) {
            for (Conta c : contasBncarias) {
                if (c.getNumeroConta() == numeroConta) ;
                conta = c;

            }
        }
        return conta;
    }

    public static void depositar() {
        System.out.println("Favor informar o número da conta");
        int numeroConta = input.nextInt();
        Conta conta = encontraConta(numeroConta);

        if (conta != null) {
            System.out.println("Qual o valor do deposito?");
            Double valorDeposito = input.nextDouble();
            conta.depositar(valorDeposito);

            System.out.println("Deposito realizado com sucesso");
        } else {
            System.out.println("Conta não encontrada");
        }

        operacoes();
    }

    public static void sacar() {
        System.out.println("Número da conta");
        int numeroConta = input.nextInt();

        Conta conta = encontraConta(numeroConta);

        if (conta != null) {
            System.out.println("Qual o valor que deseja sacar");
            Double valorSaque = input.nextDouble();
            conta.sacar(valorSaque);
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Conta não encontrada");
        }
        operacoes();
    }

    public static void tranferir() {
        System.out.println("Número da conta do remetente: ");
        int numeroContaRemetente = input.nextInt();
        Conta contaRemetente = encontraConta(numeroContaRemetente);

        if (contaRemetente != null) {
            System.out.println("Número da conta do destinatário");
            Conta ContaDestinatario = encontraConta(numeroContaRemetente);

            if (ContaDestinatario != null) {
                System.out.println("Valor da tranferência: ");
                Double valor = input.nextDouble();

                contaRemetente.transferir(ContaDestinatario, valor);

            }

        }
        operacoes();
    }

    public static void listarConta() {
        if (contasBncarias.size() > 0) {
            for (Conta conta : contasBncarias) {
                System.out.println(conta);
            }
        } else {
            System.out.println("Não há conta cadastrada");
        }

        operacoes();
    }

}
