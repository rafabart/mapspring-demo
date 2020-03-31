package com.mapstructdemo.service;

import com.mapstructdemo.mapper.CustomerMapper;
import com.mapstructdemo.reponse.CustomerResponse;
import com.mapstructdemo.request.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversorService {

    @Autowired
    private CustomerMapper customerMapper;

    public CustomerResponse converteToCustomerRequest(final CustomerRequest customerRequest) {
        return customerMapper.to(customerRequest);
    }
}
