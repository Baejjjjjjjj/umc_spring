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
public class user extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;

    private String nickname;

    private String email;

    private int birthday;

    private String sex;

    @Enumerated(EnumType.STRING)
    private Permission_content service_ok;

    @Enumerated(EnumType.STRING)
    private Permission_content b_ok; //권한 동의

    private String profile;

    @Enumerated(EnumType.STRING)
    private com.example.app_umc_spring.domain.common.UserStatus UserStatus;


    private int admin;



}