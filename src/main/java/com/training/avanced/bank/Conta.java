package com.training.avanced.bank;

public abstract class Conta implements Transacoes{
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
    }


    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Valor após saque: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
