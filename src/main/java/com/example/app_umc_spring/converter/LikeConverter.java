package com.example.app_umc_spring.converter;

import com.example.app_umc_spring.domain.recipe;
import com.example.app_umc_spring.domain.user;
import com.example.app_umc_spring.web.dto.LikeRequestDto;
import com.example.app_umc_spring.web.dto.RecipeResponseDto;

public class LikeConverter {

    private com.example.app_umc_spring.domain.user user;


    public static LikeRequestDto.LikeDto toLikeDto(Long recipe_Id, Long user_Id){


        return LikeRequestDto.LikeDto.builder()
                .user(user_Id).recipe(recipe_Id).
                build();
    }
}
