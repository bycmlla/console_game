package com.training.avanced.bank;

public class ContaPoupanca extends Conta {

    private double taxaRendimento = 0.03;

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    public double getTaxaRendimento(){
        return taxaRendimento;
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
        double rendimento = getSaldo() * getTaxaRendimento();
        super.depositar(rendimento);
        System.out.println("Valor depositdado: " + valor);
        System.out.println("Valor rendimento: " + rendimento);
    }
}
