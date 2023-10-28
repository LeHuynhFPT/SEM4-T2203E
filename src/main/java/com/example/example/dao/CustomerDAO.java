package com.example.example.dao;

import com.example.example.entity.CustomerEntity;

import java.util.List;

public interface CustomerDAO {
    void createCustomer(CustomerEntity customer);
List<CustomerEntity> getAllCustomer();
}
