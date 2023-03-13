package com.microservicos.posts.controladores;

import com.microservicos.posts.modelos.entidades.EmpresaPost;
import com.microservicos.posts.modelos.entidades.Post;
import com.microservicos.posts.servicos.PostServico;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/criarEmpresa")
    public ResponseEntity criarEmpresa(@RequestBody EmpresaPost empresaPost){
        postServico.criarEmpresaPost(empresaPost);
        return ResponseEntity.status(201).build();
    }

    @GetMapping()
    public ResponseEntity exibirPosts(){
        return ResponseEntity.status(200).body(postServico.todosPosts());
    }


}
