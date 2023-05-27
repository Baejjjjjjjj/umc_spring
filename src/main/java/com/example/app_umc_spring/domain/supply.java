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
public class supply extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supply_id")
    private Long id;

    private String context;

    private String email;


    @Enumerated(EnumType.STRING)
    private com.example.app_umc_spring.domain.common.UserStatus UserStatus;


    @Enumerated(EnumType.STRING)
    private processing_info processing_info;

    @ManyToOne
    @JoinColumn(name = "supply_user_id")
    private user supply_user;

    @ManyToOne
    @JoinColumn(name = "admin_user_id")
    private user admin_user;

}