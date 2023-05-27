package com.example.app_umc_spring.domain;

import com.example.app_umc_spring.domain.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class faq extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "faq_id")
    private Long id;

    private String question_context;

    private String answer_context;


    @Enumerated(EnumType.STRING)
    private com.example.app_umc_spring.domain.common.UserStatus UserStatus;


    @ManyToOne
    @JoinColumn(name = "question_user_id")
    private user question_user;

    @ManyToOne
    @JoinColumn(name = "answer_recipe_id")
    private recipe answer_recipe;


}