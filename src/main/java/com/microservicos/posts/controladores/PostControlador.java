package com.microservicos.posts.controladores;

import com.microservicos.posts.modelos.entidades.Post;
import com.microservicos.posts.servicos.PostServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostControlador {

    @Autowired
    private PostServico postServico;


    @PostMapping("/criar")
    public ResponseEntity<Post> criarPost(@RequestBody Post post){
        postServico.criarPost(post);
        return ResponseEntity.status(201).build();
    }


}
