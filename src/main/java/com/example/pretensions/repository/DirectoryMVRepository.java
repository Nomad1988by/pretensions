package com.example.pretensions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pretensions.domain.DirectoryMV;

public interface DirectoryMVRepository extends JpaRepository<DirectoryMV, Long>{
    DirectoryMV findByIdDirectoryMV(Long id);
    List<DirectoryMV> findAllByIdClaimsCustomers();
}
