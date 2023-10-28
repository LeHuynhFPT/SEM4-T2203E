package com.example.example.dao.impl;
import com.example.example.dao.CustomerDAO;
import com.example.example.entity.CustomerEntity;
import com.example.example.util.PersistenceUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    EntityManager en;
    EntityTransaction tran;

    public CustomerDAOImpl(){
        en = PersistenceUtil.createEntityManagerFactory().createEntityManager();
        tran = en.getTransaction();
    }


    @Override
    public void createCustomer(CustomerEntity customer) {

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
    public List<CustomerEntity> getAllCustomer() {
        List<CustomerEntity> customer = new ArrayList<>();
        try{
            Query query = en.createQuery("select c from CustomerEntity c");
            return query.getResultList();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return customer;
    }
}
