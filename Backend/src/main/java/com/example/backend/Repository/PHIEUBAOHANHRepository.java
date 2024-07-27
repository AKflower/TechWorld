package com.example.backend.Repository;

import com.example.backend.Model.PHIEUBAOHANH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PHIEUBAOHANHRepository extends JpaRepository<PHIEUBAOHANH, Integer> {
}
