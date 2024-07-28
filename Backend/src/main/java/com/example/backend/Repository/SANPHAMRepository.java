package com.example.backend.Repository;

import com.example.backend.Model.SANPHAM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SANPHAMRepository extends JpaRepository<SANPHAM, Integer> {
}
