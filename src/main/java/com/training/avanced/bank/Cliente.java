package com.training.avanced.bank;

public class Cliente {
    private String nomeCompleto;
    private String cpf;
    private String email;

    public Cliente(String nomeCompleto, String cpf, String email){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
