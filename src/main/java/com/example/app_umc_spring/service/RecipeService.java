package com.example.app_umc_spring.service;

import com.example.app_umc_spring.domain.recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeService {

    List<recipe> findAllByRecipeId();

    recipe update(Long recipe_Id, Long user_Id );


}
