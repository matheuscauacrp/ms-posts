package com.microservicos.posts.servicos;

import com.microservicos.posts.modelos.entidades.EmpresaPost;
import com.microservicos.posts.modelos.entidades.Post;
import com.microservicos.posts.repositorios.EmpresaPostRepositorio;
import com.microservicos.posts.repositorios.PostRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostServico {

    @Autowired
    private PostRepositorio postRepositorio;

    @Autowired
    private EmpresaPostRepositorio empresaPostRepositorio;

    public void criarPost(Post post){
        post.setDataCadastro(new Date());
        post.setDataExpiracao(new Date());
        postRepositorio.save(post);
    }

    public void criarEmpresaPost(EmpresaPost empresaPost){
        empresaPostRepositorio.save(empresaPost);
    }
}
