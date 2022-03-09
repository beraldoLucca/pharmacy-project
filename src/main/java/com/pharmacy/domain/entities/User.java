package com.pharmacy.domain.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
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

}
