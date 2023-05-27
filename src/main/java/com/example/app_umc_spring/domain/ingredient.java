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
public class ingredient extends BaseEntity {


    @Id
    @GeneratedValue
    @Column(name = "ingredient_id")
    private Long id;

    private String string;

    private int count;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private recipe recipe;
}