package br.com.rcurvo.memes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.util.UUID;

@Entity
public class Meme {

    @Id
    private String id;

    @NotBlank
    private String nome;

    @NotBlank
    private String descricao;


    @DateTimeFormat(pattern="dd-MMM-yyyy")
    private Date dataCadastro;

    @URL
    private String url;

    @NotBlank
    private String categoriaMemeId;

    @NotBlank
    private String usuarioId;

    public Meme() {
    }

    public Meme(String id, String nome, String descricao, Date dataCadastro, String url, String categoriaMemeId, String usuarioId) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.categoriaMemeId = categoriaMemeId;
        this.usuarioId = usuarioId;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCategoriaMemeId() {
        return categoriaMemeId;
    }

    public void setCategoriaMemeId(String categoriaMemeId) {
        this.categoriaMemeId = categoriaMemeId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @PrePersist
    public void createId(){
        this.id = UUID.randomUUID().toString();
    }
}
