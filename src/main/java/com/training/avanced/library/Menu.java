package com.training.avanced.library;

import java.util.Scanner;

public class Menu {
    private int option;

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public void menuMount() {
        System.out.println("BEM VINDOS A BIBLIOTECA DOS INVOCADOS...!");
        System.out.println("-------------------------------------");
        System.out.println("[1] Criar usuário.");
        System.out.println("[2] Cadastrar livro digital.");
        System.out.println("[3] Cadastrar livro fisico.");
        System.out.println("[4] Comprar E-book.");
        System.out.println("[5] Alugar livro físico.");
        System.out.println("[6] Devolver livro físico.");
        System.out.println("[7] Consultar saldo em conta.");
        System.out.println("[8] Visualizar meus livros.");
        System.out.println("[0] Sair da Biblioteca.");
        System.out.println("-------------------------------------");
    }

    public void menuSelect(int option) {
        this.setOption(option);
    }
}
