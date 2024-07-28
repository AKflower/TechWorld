package com.example.backend.Repository;

import com.example.backend.Model.BINHLUAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BINHLUANRepository extends JpaRepository<BINHLUAN, Integer> {
    @Query("SELECT bl FROM BINHLUAN bl WHERE bl.MASP = :maSP ORDER BY bl.NGAYBL DESC")
    List<BINHLUAN> findAllCommentByProduct(int maSP);
}