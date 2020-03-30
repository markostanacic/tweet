package com.tweet.service.dto;

import java.time.LocalDate;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.tweet.domain.Post} entity.
 */
public class PostDTO implements Serializable {
    
    private Long id;

    private String title;

    @NotNull
    @Size(max = 240)
    private String content;

    private LocalDate creationDate;

    private String user;


    private Long manyToOneId;

    private String manyToOneLogin;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getManyToOneId() {
        return manyToOneId;
    }

    public void setManyToOneId(Long userId) {
        this.manyToOneId = userId;
    }

    public String getManyToOneLogin() {
        return manyToOneLogin;
    }

    public void setManyToOneLogin(String userLogin) {
        this.manyToOneLogin = userLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PostDTO postDTO = (PostDTO) o;
        if (postDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), postDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PostDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", content='" + getContent() + "'" +
            ", creationDate='" + getCreationDate() + "'" +
            ", user='" + getUser() + "'" +
            ", manyToOneId=" + getManyToOneId() +
            ", manyToOneLogin='" + getManyToOneLogin() + "'" +
            "}";
    }
}
