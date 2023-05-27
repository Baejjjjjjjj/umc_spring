package com.example.app_umc_spring.web.dto;

import lombok.*;

import java.time.LocalDateTime;

public class CommentRequestDto {

    @Builder
    @Getter
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CreateCommentDto{

            private Long user_id;

            private String context;

            private String nickname;

            private Long recipe_id;




    }


}
