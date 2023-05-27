package com.example.app_umc_spring.converter;

import com.example.app_umc_spring.domain.comment;
import com.example.app_umc_spring.domain.recipe;
import com.example.app_umc_spring.web.dto.CommentRequestDto;
import com.example.app_umc_spring.web.dto.CommentResponseDto;
import com.example.app_umc_spring.web.dto.RecipeResponseDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CommentConverter {



    public static CommentResponseDto.CommentDto toCommentDto(comment comment){

        return CommentResponseDto.CommentDto.builder()
                .context(comment.getContext())
                .nickname(comment.getNickname())
                .createdAt(comment.getCreatedAt())
                .build();
    }



    public static CommentResponseDto.CommentListDto CommentListDto(List<comment> commentList){

        List<CommentResponseDto.CommentDto> commentDtoList = commentList.stream()
                .map(comment -> toCommentDto(comment))
                .collect(Collectors.toList());
        return CommentResponseDto.CommentListDto.builder()
                .commentDtoList(commentDtoList)
                .build();
    }



    public static comment toComment (CommentRequestDto.CreateCommentDto request) {
        return comment.builder()
                .context(request.getContext())
                .nickname(request.getNickname())
                .build();
    }

    public static CommentResponseDto.CreateCommentDto toCreateCommentDto(comment comment){
        return CommentResponseDto.CreateCommentDto.builder()
                .context(comment.getContext())
                .nickname(comment.getNickname())
                .build();

    }
}
