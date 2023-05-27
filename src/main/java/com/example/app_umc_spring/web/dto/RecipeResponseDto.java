package com.example.app_umc_spring.web.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

public class RecipeResponseDto {

    @Builder
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    public static class RecipeDto{
        private LocalDateTime createdDate;

        private String createdBy;

        private Integer like;


    }

    @Builder
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    public static class RecipeListDto{
        private List<RecipeDto> RecipeDtoList;



    }
}
