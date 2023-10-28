package com.example.example.dao;

import com.example.example.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeDAO {
    void createCustomer(EmployeeEntity customer);
List<EmployeeEntity> getAllCustomer();
}
