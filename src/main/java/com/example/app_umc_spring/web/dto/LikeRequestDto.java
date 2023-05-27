package com.example.app_umc_spring.web.dto;

import com.example.app_umc_spring.domain.recipe;
import com.example.app_umc_spring.domain.user;
import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;

import java.time.LocalDateTime;

public class LikeRequestDto {

    @Builder
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    public static class LikeDto{


        private Long user;

        private Long recipe;


    }
}
