package com.sadatmalik.brewerymicroservice.services;

import com.sadatmalik.brewerymicroservice.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}