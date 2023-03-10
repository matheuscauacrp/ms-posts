package com.microservicos.posts.modelos.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Post {

    @Id
    private Long id;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private Date dataCadastro;

    private Date dataExpiracao;

    @ManyToOne
    private EmpresaPost empresaPost;
}
