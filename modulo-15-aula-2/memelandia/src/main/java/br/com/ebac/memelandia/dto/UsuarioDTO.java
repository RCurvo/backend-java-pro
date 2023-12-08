package br.com.ebac.memelandia.dto;

import java.io.Serializable;
import java.sql.Date;

public class UsuarioDTO implements Serializable {
    private final Long id;
    private final String nome;

    private final String email;

    private final Date dataCadastro;

    public UsuarioDTO(Long id, String nome, String email, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
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
}
