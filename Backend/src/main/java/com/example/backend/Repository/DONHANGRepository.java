package com.example.backend.Repository;

import com.example.backend.Model.DONHANG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DONHANGRepository extends JpaRepository<DONHANG, Integer> {
}
