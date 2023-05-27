package com.example.app_umc_spring.repository;

import com.example.app_umc_spring.domain.Likess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Likess, Long> {


    @Query("select lk.id from Likess lk where lk.recipe_id=1 and lk.user_id =1")
    Integer findById2(Long recipe_Id, Long user_Id);

    @Modifying
    @Query("delete from Likess where recipe_id= 1 and user_id =1")
    Integer deleteById2(Long recipe_Id, Long user_Id);

}
