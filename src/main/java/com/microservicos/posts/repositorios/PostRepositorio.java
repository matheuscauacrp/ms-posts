package com.microservicos.posts.repositorios;

import com.microservicos.posts.modelos.entidades.Post;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PostRepositorio extends JpaRepository<Post,Long> {
}
