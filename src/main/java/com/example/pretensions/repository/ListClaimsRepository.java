package com.example.pretensions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pretensions.domain.Lawyers;

public interface ListClaimsRepository extends JpaRepository<Lawyers, Long>{
    Lawyers findByIdLawyers(Long id);
    List<Lawyers> findAllByIdLawyers();
}
