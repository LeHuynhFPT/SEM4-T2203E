package com.example.example.dao;

import com.example.example.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeDAO {
    void createEmployee(EmployeeEntity customer);
List<EmployeeEntity> getAllEmployee();


