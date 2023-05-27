package com.example.app_umc_spring.repository;

import com.example.app_umc_spring.domain.recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<recipe,Long> {


   // @Query("select r.createdAt, r. from recipe r where recipe_id =:recipe_id")
   // like findByRecipeId(@Param("recipe_Id")Long recipe_Id);

    //recipe findById(Long recipe_Id);

}
