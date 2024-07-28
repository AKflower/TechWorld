package com.example.backend.Repository;

import com.example.backend.Model.DOTGIAMGIA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DOTGIAMGIARepository extends JpaRepository<DOTGIAMGIA, Integer> {
}
