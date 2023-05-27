package com.example.app_umc_spring.repository;

import com.example.app_umc_spring.domain.comment;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<comment,Long> {

    List<comment> findAllById(Long recipeId);

}
