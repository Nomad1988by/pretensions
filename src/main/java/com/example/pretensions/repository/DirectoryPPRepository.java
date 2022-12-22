package com.example.pretensions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pretensions.domain.DirectoryPP;

public interface DirectoryPPRepository extends JpaRepository<DirectoryPP, Long>{
    DirectoryPP findByIdDirectoryPP(Long id);
    List<DirectoryPP> findAllByIdDirectoryPP();
}
