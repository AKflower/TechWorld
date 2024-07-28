package com.example.backend.Repository;

import com.example.backend.Model.DONDATHANG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DONDATHANGRepository extends JpaRepository<DONDATHANG, Integer> {
}
