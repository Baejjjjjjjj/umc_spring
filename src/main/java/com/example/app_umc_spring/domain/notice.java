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
public class notice extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "notice_id")
    private Long id;

    private String name;

    private String context;



    @Enumerated(EnumType.STRING)
    private com.example.app_umc_spring.domain.common.UserStatus UserStatus;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;


}