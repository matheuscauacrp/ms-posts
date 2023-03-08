package com.microservicos.posts.servicos;

import com.microservicos.posts.repositorios.PostRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServico {

    @Autowired
    private PostRepositorio postRepositorio;

}
