package com.training.avanced.bank;

import java.util.Scanner;
import java.util.ArrayList;

public class Banco {
    ArrayList<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        Banco banco = new Banco();
        Menu menu = new Menu();

        while (true) {
            menu.montarMenu();
            menu.selecionarMenu(ler.nextInt());
            switch (menu.getOpcao()) {
                case 1:
                    banco.abrirContaPoupanca();
                    break;
                case 2:
                    banco.abrirContaCorrente();
                    break;
                case 3:
                    banco.depositar();
                    break;
                case 4:
                    banco.sacar();
                    break;
                case 5:
                    banco.consultarSaldo();
                    break;
                case 6:
                    banco.acessarInfo();
                case 7:
                    banco.apagarConta();

            }
        }
    }

    public void abrirContaPoupanca() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        String nome = ler.nextLine();

        System.out.println("Informe seu CPF: ");
        String cpf = ler.nextLine();

        System.out.println("Informe seu e-mail: ");
        String email = ler.nextLine();

        Conta conta = buscarContas(cpf);

        if (conta != null) {
            System.out.println("Já existe uma conta vinculada a este CPF. ");
        } else {
            Cliente cliente = new Cliente(nome, cpf, email);
            ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
            contas.add(contaPoupanca);

            System.out.println("Conta criada com sucesso para " + cliente.getNomeCompleto());
        }

    }

    public void abrirContaCorrente() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        String nome = ler.nextLine();

        System.out.println("Informe seu CPF: ");
        String cpf = ler.nextLine();

        System.out.println("Informe seu e-mail: ");
        String email = ler.nextLine();

        System.out.println("Informe o valor do cheque especial: ");
        double ce = ler.nextDouble();

        Conta ac = buscarContas(cpf);

        if (ac != null) {
            System.out.println("Já existe uma conta vinculada a este CPF.");
        } else {
            Cliente cliente = new Cliente(nome, cpf, email);
            ContaCorrente conta = new ContaCorrente(cliente, ce);
            contas.add(conta);

            System.out.println("Conta criada com sucesso para " + cliente.getNomeCompleto());
        }


    }

    public void depositar() {
        Scanner ler = new Scanner(System.in);

        String cpf = leitura();

        Conta conta = buscarContas(cpf);
        if (conta != null) {
            System.out.println("Digite o valor a ser depositado: ");
            double valor = ler.nextDouble();

            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }


    }

    public void sacar() {
        Scanner ler = new Scanner(System.in);

        String cpf = leitura();

        Conta conta = buscarContas(cpf);

        if (conta != null) {
            System.out.println("Digite o valor para saque: ");
            double valor = ler.nextDouble();

            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void consultarSaldo() {
        String cpf = leitura();

        Conta conta = buscarContas(cpf);

        if (conta != null) {
            conta.consultarSaldo();
        }
    }

    public void acessarInfo() {
        String cpf = leitura();

        Conta conta = buscarContas(cpf);

        if (conta != null) {
            System.out.println("Nome: " + conta.getCliente().getNomeCompleto() + "\nCPF: " + conta.getCliente().getCpf() + "\nEmail: " + conta.getCliente().getEmail());
        }
        else {
            System.out.println("Conta não existe");
        }
    }

    public void apagarConta(){

        Scanner ler = new Scanner(System.in);

        String cpf = leitura();

        Conta conta = buscarContas(cpf);

        if (conta != null) {
            System.out.println("Certeza que deseja apagar a sua conta?\n[1] SIM [2] NÂO");

            int option = ler.nextInt();

            if (option == 1){
                contas.remove(conta);
                System.out.println("Conta removida.");
            }
            System.out.println("Conta nao encontrada. ");
        }
    }

    public String leitura() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número do seu CPF: ");
        return ler.nextLine();
    }

    public Conta buscarContas(String cpf) {
        for (Conta conta : contas) {
            if (conta.getCliente().getCpf().equals(cpf)) {
                return conta;
            }
        }
        return null;
    }
}
