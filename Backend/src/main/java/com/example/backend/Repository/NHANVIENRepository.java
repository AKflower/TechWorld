package com.example.backend.Repository;

import com.example.backend.Model.NHANVIEN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NHANVIENRepository extends JpaRepository<NHANVIEN, Integer> {
}
