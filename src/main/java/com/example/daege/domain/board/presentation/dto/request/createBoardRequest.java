package com.example.daege.domain.board.presentation.dto.request;

import com.example.daege.domain.board.domain.enums.Major;
import com.example.daege.domain.template.domain.Template;
import jakarta.validation.constraints.NotBlank;

public record createBoardRequest(
        @NotBlank(message = "제목을 입력해주세요.")
        String title,

        @NotBlank(message = "본문을 입력해주세요.")
        String content,

        @NotBlank
        Major major,

        @NotBlank
        Template template
) {
}