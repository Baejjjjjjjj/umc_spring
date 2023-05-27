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
public class myscrab extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "myscrab_id")
    private Long id;



    @Enumerated(EnumType.STRING)
    private Scrab scrab;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private recipe recipe;
}