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
public class recipe extends BaseEntity {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getBeverage_name() {
        return beverage_name;
    }

    public void setBeverage_name(String beverage_name) {
        this.beverage_name = beverage_name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Jip getJip() {
        return jip;
    }

    public void setJip(Jip jip) {
        this.jip = jip;
    }

    public String getMade_time() {
        return made_time;
    }

    public void setMade_time(String made_time) {
        this.made_time = made_time;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private Long id;

    @Column(nullable = false)
    private String post_name;

    private String beverage_name;

    private String intro;

    @Column(columnDefinition = "INT DEFAULT 0")
    private Integer likes;

    @Enumerated(EnumType.STRING)
    private Jip jip;


    private String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private String made_time;

    private Long views;



    @Enumerated(EnumType.STRING)
    private com.example.app_umc_spring.domain.common.UserStatus UserStatus;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private user user;


    private void addLikes(){
        this.likes+=1;

    }
}