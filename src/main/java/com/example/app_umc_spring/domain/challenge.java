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
public class challenge extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "challenge_id")
    private Long id;


    @Enumerated(EnumType.STRING)
    private com.example.app_umc_spring.domain.common.UserStatus UserStatus;

    private Challengeinfo challenge_info;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private recipe recipe;
}