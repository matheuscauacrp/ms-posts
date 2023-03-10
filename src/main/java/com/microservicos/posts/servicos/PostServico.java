package com.microservicos.posts.servicos;

import com.microservicos.posts.modelos.dtos.EmpresaDTO;
import com.microservicos.posts.modelos.entidades.Post;
import com.microservicos.posts.repositorios.PostRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostServico {

    @Autowired
    private PostRepositorio postRepositorio;


    public void criarPost(Post post){
        post.setDataCadastro(new Date());
        post.setEmpresa(new EmpresaDTO().getId());
        postRepositorio.save(post);
    }

}
