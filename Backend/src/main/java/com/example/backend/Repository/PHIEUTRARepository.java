package com.example.backend.Repository;

import com.example.backend.Model.PHIEUTRA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PHIEUTRARepository extends JpaRepository<PHIEUTRA, Integer> {
}
