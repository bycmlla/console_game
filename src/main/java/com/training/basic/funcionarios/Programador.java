package com.training.basic.funcionarios;

public class Programador extends Funcionario{

    public double PL = 300;

    public Programador(String nomeCompleto, int idade, double salarioBase){
        super.setNomeCompleto(nomeCompleto);
        super.setIdade(idade);
        super.setSalarioBase(salarioBase);
    }

    @Override
    public double calcularSalario(){
        return (getSalarioBase() - getDescontos()) + PL;
    }




}
