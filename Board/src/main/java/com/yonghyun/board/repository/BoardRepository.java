package com.yonghyun.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yonghyun.board.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}