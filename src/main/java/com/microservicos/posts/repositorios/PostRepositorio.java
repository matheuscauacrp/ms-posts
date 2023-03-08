package com.microservicos.posts.repositorios;

import com.microservicos.posts.modelos.entidades.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepositorio extends JpaRepository<Post,Long> {


}
