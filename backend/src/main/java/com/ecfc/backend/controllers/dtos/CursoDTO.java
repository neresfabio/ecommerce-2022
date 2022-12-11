package com.ecfc.backend.controllers.dtos;

import com.ecfc.backend.entities.Curso;

public class CursoDTO {
    private String titulo;
    private String preco;
    private String descricao;

    public CursoDTO() {
    }

    public CursoDTO(Curso curso) {
        this.titulo = curso.getTitulo();
        this.preco = curso.getPreco();
        this.descricao = curso.getDescricao();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
