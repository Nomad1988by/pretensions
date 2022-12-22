package com.example.pretensions.service;

import java.util.List;

import com.example.pretensions.domain.ClaimsCustomers;

public interface ClaimsCustomersService {
    ClaimsCustomers findByIdClaimsCustomer(Long id);
    List<ClaimsCustomers> findAllByIdClaimsCustomers(); 
}
