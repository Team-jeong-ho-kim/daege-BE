package com.example.daege.domain.board.service;

import com.example.daege.domain.board.domain.Board;
import com.example.daege.domain.board.domain.repository.BoardRepository;
import com.example.daege.domain.board.presentation.dto.request.createBoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CreateBoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public void createBoard(createBoardRequest request) {
        boardRepository.save(Board.builder()
                .title(request.title())
                .content(request.content())
                .major(request.major())
                .template(request.template())
                .build());
    }
}
