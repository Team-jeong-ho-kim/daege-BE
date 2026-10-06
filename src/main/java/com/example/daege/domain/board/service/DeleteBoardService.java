package com.example.daege.domain.board.service;

import com.example.daege.domain.board.domain.Board;
import com.example.daege.domain.board.domain.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteBoardService {
    private final BoardRepository boardRepository;

    public void deleteBoard(Long postId) {
        Board board = boardRepository.findById(postId)
                .orElseThrow(RuntimeException::new);

        boardRepository.delete(board);
    }
}
