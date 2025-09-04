package com.training.avanced.library;

import com.training.avanced.bank.Conta;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<Usuario> users = new ArrayList<>();
    ArrayList<Livro> livros = new ArrayList<>();

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        Biblioteca lib = new Biblioteca();
        Menu menu = new Menu();

        while (true){
            menu.menuMount();
            menu.menuSelect(ler.nextInt());

            switch (menu.getOption()){
                case 1:
                    lib.criarUsuario();
                    break;
                case 2:
                    lib.cadastrarLivroDigital();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    break;
            }

        }

    }

    public void criarUsuario(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do usuario: ");
        String nome = ler.nextLine();

        System.out.println("Agora o ID: ");
        int id = ler.nextInt();

        Usuario user = new Usuario(nome, id);

        users.add(user);
        System.out.println("Seja bem vindo(a) " + nome + "!!");
    }

    public void cadastrarLivroDigital(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Título: ");
        String titulo = ler.nextLine();

        System.out.println("Ano de Publicação: ");
        int ano = ler.nextInt();

        System.out.println("Autor: ");
        String autor = ler.nextLine();

        System.out.println("Id livro: ");
        int id = ler.nextInt();

        LivroDigital ld = new LivroDigital(titulo, ano, autor, id);

        livros.add(ld);

        System.out.println("Livro " + titulo + " criado!");
    }

    public Usuario buscarUsuario(int id){
        for(Usuario user : users){
            if(user.getIdUsuario() == id){
                return user;
            }
        }
        return null;
    }
}
