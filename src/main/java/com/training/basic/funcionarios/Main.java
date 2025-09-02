package com.training.basic.funcionarios;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> equipe = new ArrayList<>();

        equipe.add(new Gerente("Hilton Junior", 54, 6885));
        equipe.add(new Programador("Camilis Aguilis", 23, 2345));
        equipe.add(new Gerente("Evaristo Inteiro", 45, 5387));

        // Gerente g1 = new Gerente("Hilton Junior", 52, 7533);
        // Funcionario g2 = new Gerente("Evaristo Inteiro", 46, 6885);

        for (Funcionario f : equipe) {
            System.out.println("\nFuncionário: " + f.getNomeCompleto() + "\nIdade: " + f.getIdade() + "\nSalário: R$" + Math.round(f.calcularSalario()));
        }
    }
}
