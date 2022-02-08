package com.sadatmalik.brewerymicroservice.web.mappers;

import com.sadatmalik.brewerymicroservice.domain.Customer;
import com.sadatmalik.brewerymicroservice.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}