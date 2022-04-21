package com.example.demo.repositories;

import java.util.List;

public interface CRUDInterface <T>{

    //create
    public boolean create(T entity);
    //read
    public T getSingleEntityById();
    public List<T> getAllEntities();
    //update
    public boolean update(T entity);
    //delete
    public boolean deleteId(int id);
}
