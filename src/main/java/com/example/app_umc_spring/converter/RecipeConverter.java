package com.example.app_umc_spring.converter;

import com.example.app_umc_spring.domain.recipe;
import com.example.app_umc_spring.web.dto.RecipeResponseDto;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RecipeConverter {


    private Integer like;

    public static RecipeResponseDto.RecipeDto toRecipeDto(recipe recipe){

        return RecipeResponseDto.RecipeDto.builder()
                .createdBy(recipe.getCreatedBy())
                .createdDate(recipe.getCreatedAt())
                .like(recipe.getLikes())
                .build();
    }

    public static RecipeResponseDto.RecipeListDto RecipeListDto(List<recipe> recipeList){

        List<RecipeResponseDto.RecipeDto> recipeDtoList = recipeList.stream()
                .map(recipe -> toRecipeDto(recipe))
                .collect(Collectors.toList());
        return RecipeResponseDto.RecipeListDto.builder()
                .RecipeDtoList(recipeDtoList)
                .build();

    }


    public static RecipeResponseDto.RecipeDto toUpdateRecipeDto(recipe recipe){
        return RecipeResponseDto.RecipeDto.builder()
                .createdBy(recipe.getCreatedBy())
                .createdDate(recipe.getCreatedAt())
                .like(recipe.getLikes())
                .build();

    }

}
