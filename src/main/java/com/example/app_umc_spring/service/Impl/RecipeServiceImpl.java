package com.example.app_umc_spring.service.Impl;

import com.example.app_umc_spring.domain.Likess;
import com.example.app_umc_spring.domain.recipe;
import com.example.app_umc_spring.repository.LikeRepository;
import com.example.app_umc_spring.repository.RecipeRepository;
import com.example.app_umc_spring.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

    final RecipeRepository recipeRepository;
    final LikeRepository likeRepository;

    @Override
    @Transactional
    public List<recipe> findAllByRecipeId(){
        return recipeRepository.findAll();
    }


    @Transactional
    @Override
    public recipe update(Long recipe_Id, Long user_Id ){


        try{
            System.out.println("===******=");
            Integer like = likeRepository.findById2(recipe_Id,user_Id);
            System.out.println(like);
            if(like!=0){
                System.out.println("qq===******=");
                likeRepository.deleteById2(recipe_Id,user_Id);
                System.out.println("******=");

            }else{
                System.out.println("111");
                Likess likess = Likess.builder().user_id(user_Id).recipe_id(recipe_Id).build();
                likeRepository.save(likess);
                System.out.println("2222");

            }

            //recipe recipe= recipeRepository.findById(recipe_Id);
            return null;

        }catch(NullPointerException e){
            System.out.println("====");
            System.out.println("111");
            Likess likess = Likess.builder().user_id(user_Id).recipe_id(recipe_Id).build();
            likeRepository.save(likess);
            System.out.println("2222");

            //recipe recipe = recipeRepository.findById(recipe_Id);
            return null;

        }



    }
}
