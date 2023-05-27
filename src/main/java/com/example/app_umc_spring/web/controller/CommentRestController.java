package com.example.app_umc_spring.web.controller;

import com.example.app_umc_spring.converter.CommentConverter;
import com.example.app_umc_spring.domain.comment;
import com.example.app_umc_spring.service.CommentService;
import com.example.app_umc_spring.web.dto.CommentRequestDto;
import com.example.app_umc_spring.web.dto.CommentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CommentRestController {



    private final CommentService commentService;

    @PostMapping("/comment/{recipeId}")
    public ResponseEntity<CommentResponseDto.CreateCommentDto> createComment(@RequestBody CommentRequestDto.CreateCommentDto request, @PathVariable(name = "recipeId") Long recipeId){
        comment comment = commentService.create(request);
        return ResponseEntity.ok(CommentConverter.toCreateCommentDto(comment));
    }

    @GetMapping("/comment/{recipeId}/comments")
    public ResponseEntity<CommentResponseDto.CommentListDto> getCommentList(@PathVariable(name = "recipeId") Long recipeId){
        System.out.println("==============================");
        System.out.println(recipeId);
        List<comment> commentList = commentService.findAllByRecipeId(recipeId);
        return ResponseEntity.ok(CommentConverter.CommentListDto(commentList));
    }


}
