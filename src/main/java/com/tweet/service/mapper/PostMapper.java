package com.tweet.service.mapper;


import com.tweet.domain.*;
import com.tweet.service.dto.PostDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Post} and its DTO {@link PostDTO}.
 */
@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface PostMapper extends EntityMapper<PostDTO, Post> {

    @Mapping(source = "manyToOne.id", target = "manyToOneId")
    @Mapping(source = "manyToOne.login", target = "manyToOneLogin")
    PostDTO toDto(Post post);

    @Mapping(source = "manyToOneId", target = "manyToOne")
    Post toEntity(PostDTO postDTO);

    default Post fromId(Long id) {
        if (id == null) {
            return null;
        }
        Post post = new Post();
        post.setId(id);
        return post;
    }
}
