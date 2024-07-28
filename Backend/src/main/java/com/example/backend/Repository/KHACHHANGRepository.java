package com.example.backend.Repository;

import com.example.backend.Model.KHACHHANG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KHACHHANGRepository extends JpaRepository<KHACHHANG, Integer> {
}
