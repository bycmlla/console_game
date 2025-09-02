package com.training.basic.funcionarios;

public class Funcionario {
    private String nomeCompleto;
    private int idade;
    private double salarioBase;
    private double descontos = salarioBase * 0.10;

    public double calcularSalario(){
        return salarioBase;
    }

    public double getDescontos(){
        return descontos;
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public int getIdade(){
        return idade;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
}
