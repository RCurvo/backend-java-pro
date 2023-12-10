package br.com.ebac.memelandia.dto;

import java.io.Serializable;
import java.sql.Date;

public class NovoUsuarioDTO implements Serializable{
    private final String id;
    private final String nome;

    private final String email;

    private final Date dataCadastro;

    private Integer idade;

    public NovoUsuarioDTO(String id, String nome, String email, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
