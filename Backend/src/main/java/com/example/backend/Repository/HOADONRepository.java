package com.example.backend.Repository;

import com.example.backend.Model.HOADON;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HOADONRepository extends JpaRepository<HOADON, Integer> {
}
