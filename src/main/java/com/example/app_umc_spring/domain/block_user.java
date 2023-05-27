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
public class block_user extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "block_user_id")
    private Long id;



    @ManyToOne
    @JoinColumn(name = "blocking_user_id")
    private user blocking_user;

    @ManyToOne
    @JoinColumn(name = "blocked)user_id")
    private user blocked_user;


}