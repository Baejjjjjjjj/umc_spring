package com.example.app_umc_spring.web.controller;

import com.example.app_umc_spring.converter.RecipeConverter;
import com.example.app_umc_spring.domain.recipe;
import com.example.app_umc_spring.service.RecipeService;
import com.example.app_umc_spring.web.dto.RecipeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecipeRestController {


    private final RecipeService recipeService;

    @GetMapping("/recipe/recipes")
    public ResponseEntity<RecipeResponseDto.RecipeListDto> getRecipeList(){
        List<recipe> recipeList = recipeService.findAllByRecipeId();
        System.out.println("djfdlfjdl");
        return ResponseEntity.ok(RecipeConverter.RecipeListDto(recipeList));
    }

    @PatchMapping("/recipe/like/{recipe_Id}/{user_Id}")
    public recipe updateLike(@PathVariable(name = "recipe_Id") Long recipe_Id, @PathVariable(name="user_Id") Long user_Id){
        return recipeService.update(recipe_Id,user_Id);
        //return ResponseEntity.ok(RecipeConverter.toUpdateRecipeDto(recipe));

    }

}
