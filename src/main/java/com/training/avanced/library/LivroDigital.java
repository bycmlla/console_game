package com.training.avanced.library;

import java.time.LocalDate;
import java.util.Date;

public class LivroDigital extends Livro {
    private boolean comprado;

    public LivroDigital(String titulo, int anoPublicacao, String autor, int idLivro) {
        super(titulo, anoPublicacao, autor, idLivro);
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public boolean comprar(){
        if (!comprado){
            comprado = true;
            System.out.println("Livro comprado! Obrigada.");
            return true;
        }
        return false;
    }
}
