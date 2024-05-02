package com.example.fullstack.repository;

import com.example.fullstack.entity.AdmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdmRepository extends JpaRepository<AdmEntity, Long> {
    // select * from admin where AdmId=?
    Optional<AdmEntity> findByAdmId(String AdmId);
}
