package com.example.daege.domain.board.presentation;

import com.example.daege.domain.board.presentation.dto.request.createBoardRequest;
import com.example.daege.domain.board.presentation.dto.request.updateBoardRequest;
import com.example.daege.domain.board.service.CreateBoardService;
import com.example.daege.domain.board.service.DeleteBoardService;
import com.example.daege.domain.board.service.UpdateBoardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("posts")
public class BoardController {
    private final CreateBoardService createBoardService;
    private final DeleteBoardService deleteBoardService;
    private final UpdateBoardService updateBoardService;

    @PostMapping
    public void createBoard(@RequestBody @PathVariable @Valid createBoardRequest request) {createBoardService.createBoard(request);}

    @DeleteMapping("/{postId}")
    public void deleteBoard(@RequestBody @PathVariable @Valid Long postId) {deleteBoardService.deleteBoard(postId);}

    @PutMapping("/{postId}")
    public void updateBoard(@RequestBody @PathVariable @Valid Long postId, updateBoardRequest request) {updateBoardService.updateBoard(postId, request);}

}
