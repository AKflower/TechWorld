package com.example.backend.Repository;

import com.example.backend.Model.TAIKHOAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TAIKHOANRepository extends JpaRepository<TAIKHOAN, Integer> {
    @Query("SELECT tk FROM TAIKHOAN tk WHERE tk.TENDANGNHAP = :userName")
    TAIKHOAN findByUserName(String userName);

    @Query("SELECT tk FROM TAIKHOAN tk WHERE tk.MAQUYEN = :roleId")
    List<TAIKHOAN> findAllByRoleId(int roleId);
}