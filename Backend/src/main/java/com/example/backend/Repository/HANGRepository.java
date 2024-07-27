package com.example.backend.Repository;

import com.example.backend.Model.HANG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HANGRepository extends JpaRepository<HANG, Integer> {
}
