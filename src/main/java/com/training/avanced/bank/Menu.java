package com.training.avanced.bank;

public class Menu {
    private int opcao;

    public int getOpcao(){
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public void montarMenu(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("[1] - Abrir conta poupança.");
        System.out.println("[2] - Abrir conta corrente.");
        System.out.println("[3] - Realizar depósito.");
        System.out.println("[4] - Realizar saque.");
        System.out.println("[5] - Consultar saldo.");
        System.out.println("[6] - Acessar minhas informações.");
        System.out.println("[7] - Apagar minha conta.");
        System.out.println("[0] - Fechar menu.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void selecionarMenu(int opcao){
        this.setOpcao(opcao);
    }
}
