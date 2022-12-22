package com.example.pretensions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pretensions.domain.ClaimsCustomers;

public interface ClaimsCustomersRepository extends JpaRepository<ClaimsCustomers, Long>{
    ClaimsCustomers findByIdClaimsCustomer(Long id);
    List<ClaimsCustomers> findAllByIdClaimsCustomers();
}
