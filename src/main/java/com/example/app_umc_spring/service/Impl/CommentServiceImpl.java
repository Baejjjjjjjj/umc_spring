package com.example.app_umc_spring.service.Impl;

import com.example.app_umc_spring.converter.CommentConverter;
import com.example.app_umc_spring.domain.comment;
import com.example.app_umc_spring.repository.CommentRepository;
import com.example.app_umc_spring.service.CommentService;
import com.example.app_umc_spring.web.dto.CommentRequestDto;
import com.example.app_umc_spring.web.dto.CommentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    final CommentRepository commentRepository;


    @Override
    @Transactional
    public List<comment> findAllByRecipeId(Long recipeId){

        return commentRepository.findAllById(recipeId);
    }

    @Transactional
    public comment create(CommentRequestDto.CreateCommentDto request) {
        comment comment = CommentConverter.toComment(request);
        return commentRepository.save(comment);
    }

}
