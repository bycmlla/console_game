package com.training.basic.funcionarios;

public class Gerente extends Funcionario{
    public double PL = 2.706;
    public double bonus = 1.215;

    public Gerente(String nomeCompleto, int idade, double salarioBase){
            super.setNomeCompleto(nomeCompleto);
            super.setIdade(idade);
            super.setSalarioBase(salarioBase);
    }

    @Override
    public double calcularSalario(){
        return (getSalarioBase() - getDescontos()) + PL + bonus;
    }
}
