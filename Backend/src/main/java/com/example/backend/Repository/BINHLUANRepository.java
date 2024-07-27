package com.example.backend.Repository;

import com.example.backend.Model.BINHLUAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BINHLUANRepository extends JpaRepository<BINHLUAN, Integer> {

}
