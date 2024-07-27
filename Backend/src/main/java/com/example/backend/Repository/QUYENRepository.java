package com.example.backend.Repository;

import com.example.backend.Model.QUYEN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QUYENRepository extends JpaRepository<QUYEN, Integer> {
}
