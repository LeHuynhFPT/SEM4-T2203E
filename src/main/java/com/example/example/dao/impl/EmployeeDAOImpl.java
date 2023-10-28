package com.example.example.dao.impl;
import com.example.example.dao.EmployeeDAO;
import com.example.example.entity.EmployeeEntity;
import com.example.example.util.PersistenceUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    EntityManager en;
    EntityTransaction tran;

    public EmployeeDAOImpl(){
        en = PersistenceUtil.createEntityManagerFactory().createEntityManager();
        tran = en.getTransaction();
    }


    @Override
    public void createCustomer(EmployeeEntity customer) {

        try{
            tran.begin();
            en.persist(customer);
            tran.commit();
        }catch (Exception ex){
            System.out.printf(ex.getMessage());
            tran.rollback();
        }

    }

    @Override
    public List<EmployeeEntity> getAllCustomer() {
        List<EmployeeEntity> customer = new ArrayList<>();
        try{
            Query query = en.createQuery("select c from EmployeeEntity c");
            return query.getResultList();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return customer;
    }
}
