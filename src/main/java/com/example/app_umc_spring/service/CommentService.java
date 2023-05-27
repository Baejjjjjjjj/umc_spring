package com.example.app_umc_spring.service;

import com.example.app_umc_spring.domain.comment;
import com.example.app_umc_spring.web.dto.CommentRequestDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CommentService {
    @Transactional
    List<comment> findAllByRecipeId(Long recipeId);


    comment create(CommentRequestDto.CreateCommentDto request);
}
