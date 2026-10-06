package com.example.daege.domain.board.service;

import com.example.daege.domain.board.domain.Board;
import com.example.daege.domain.board.domain.repository.BoardRepository;
import com.example.daege.domain.board.presentation.dto.request.updateBoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateBoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public void updateBoard(Long postId, updateBoardRequest request) {
        Board board = boardRepository.findById(postId)
                .orElseThrow(RuntimeException::new);

        board.updateBoard(request.title(), request.content(), request.major());
    }
}
