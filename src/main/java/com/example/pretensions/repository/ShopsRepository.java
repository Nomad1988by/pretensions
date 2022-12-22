package com.example.pretensions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pretensions.domain.Shops;

public interface ShopsRepository extends JpaRepository<Shops, Long>{
    Shops findByIdShops(Long id);
    List<Shops> findAllByIdShops();
}
