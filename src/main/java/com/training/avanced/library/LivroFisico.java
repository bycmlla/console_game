package com.training.avanced.library;

import java.time.LocalDate;

public class LivroFisico extends Livro {
    private double taxaMulta = 0.10;
    private LocalDate dataEmprestimo;
    private boolean emprestado;
    private double valorEmprestimo;

    public LivroFisico(String titulo, int anoPublicacao, String autor, double valorEmprestimo, int idLivro) {
        super(titulo, anoPublicacao, autor, idLivro);
        this.valorEmprestimo = valorEmprestimo;
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public double getTaxaMulta() {
        return taxaMulta;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }


    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            dataEmprestimo = LocalDate.now();
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (emprestado) {
            emprestado = false;
            return true;
        }
        return false;
    }

    public boolean atraso() {
        if (emprestado && dataEmprestimo != null) {
            LocalDate limite = dataEmprestimo.plusDays(7);
            return LocalDate.now().isAfter(limite);
        }
        return false;
    }

    public double calcularMulta() {
        if (atraso()) {
            return getValorEmprestimo() * getTaxaMulta();
        }
        return 0;
    }
}
