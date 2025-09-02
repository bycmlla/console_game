package com.training.avanced.bank;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(Cliente cliente, double chequeEspecial) {
        super(cliente);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial(){
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }

}
