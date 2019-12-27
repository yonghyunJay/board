package com.yonghyun.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yonghyun.board.model.Point;

public interface PointRepository extends JpaRepository<Point, Long> {
}
