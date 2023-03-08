package com.microservicos.posts.controladores;

import com.microservicos.posts.servicos.PostServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostControlador {

    @Autowired
    private PostServico postServico;


}
