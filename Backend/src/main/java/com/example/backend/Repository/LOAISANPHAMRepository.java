package com.example.backend.Repository;

import com.example.backend.Model.LOAISANPHAM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LOAISANPHAMRepository extends JpaRepository<LOAISANPHAM, Integer> {
}
