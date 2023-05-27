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
public class report extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Long id;

    private String context;



    @Enumerated(EnumType.STRING)
    private com.example.app_umc_spring.domain.common.UserStatus UserStatus;


    @Enumerated(EnumType.STRING)
    private report_info report_info;

    @Enumerated(EnumType.STRING)
    private processing_info processing_info;

    @ManyToOne
    @JoinColumn(name = "report_user_id")
    private user report_user;

    @ManyToOne
    @JoinColumn(name = "admin_user_id")
    private user admin_user;

    @ManyToOne
    @JoinColumn(name = "reported_user_id")
    private user reported_user;


    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private recipe recipe;
}