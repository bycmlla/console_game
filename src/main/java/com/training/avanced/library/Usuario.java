package com.training.avanced.library;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int idUsuario;
    private List<Livro> livros;

    public Usuario(String nome, int idUsuario){
        this.nome = nome;
        this.idUsuario = idUsuario;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public List<Livro> getLivros(){
        return livros;
    }

    public void adicionarLivros(Livro livro){
        livros.add(livro);
    }

    public void listarLivros(Livro livro){
        for(Livro l : livros){
            System.out.println(l.getTitulo() + l.getAutor() + l.getAnoPublicacao());
        }
    }

}
