package com.example.backend.Repository;

import com.example.backend.Model.NHACUNGCAP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NHACUNGCAPRepository extends JpaRepository<NHACUNGCAP, Integer> {
}
