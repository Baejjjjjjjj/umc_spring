package com.example.app_umc_spring.domain;
import com.example.app_umc_spring.domain.base.BaseEntity;
import com.example.app_umc_spring.domain.common.UserStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class comment extends BaseEntity {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public com.example.app_umc_spring.domain.common.UserStatus getUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(com.example.app_umc_spring.domain.common.UserStatus userStatus) {
        UserStatus = userStatus;
    }

    public com.example.app_umc_spring.domain.user getUser() {
        return user;
    }

    public void setUser(com.example.app_umc_spring.domain.user user) {
        this.user = user;
    }

    public com.example.app_umc_spring.domain.recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(com.example.app_umc_spring.domain.recipe recipe) {
        this.recipe = recipe;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    private String context;

    private String nickname;

    @Enumerated(EnumType.STRING)
    private com.example.app_umc_spring.domain.common.UserStatus UserStatus;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private recipe recipe;

}