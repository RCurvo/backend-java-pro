package br.com.ebac.memelandia.dto;

import java.io.Serializable;
import java.sql.Date;

public class MemeDTO implements Serializable {


    private final String id;

    private final String nome;

    private final String descricao;


    private final Date dataCadastro;

    private final String url;


    private final String usuarioId;

    public MemeDTO(String id, String nome, String descricao, Date dataCadastro, String url, String usuarioId) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.usuarioId = usuarioId;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public String getUrl() {
        return url;
    }
}
