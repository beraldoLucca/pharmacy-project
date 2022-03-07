package com.pharmacy.domain.entities;

import org.springframework.data.annotation.Id;


public class User {

    @Id
    private String CPF;

    private String nome;
    private String cns;
    private String dataNascimento;
    private String endereco;
    private String email;
    private String telefone;
    private String cep;
    private String cidade;

    public User() {
    }

    public User(String CPF, String nome, String cns, String dataNascimento, String endereco, String email, String telefone, String cep, String cidade) {
        this.CPF = CPF;
        this.nome = nome;
        this.cns = cns;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
