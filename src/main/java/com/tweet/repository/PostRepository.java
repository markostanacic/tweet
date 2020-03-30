package com.tweet.repository;

import com.tweet.domain.Post;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the Post entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("select post from Post post where post.manyToOne.login = ?#{principal.username}")
    List<Post> findByManyToOneIsCurrentUser();
}
