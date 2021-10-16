package com.example.crud.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class DAO<T> {
    protected List<T> list = new ArrayList<>();
    public abstract void readCSV(String csvFile);
  
    public abstract List<T> getAll();
  
    public abstract Optional<T> get(long id);
   
    public abstract void add(T t);
  
    public abstract void update(T t);
  
    public abstract void deleteByID(long id);
  
    public abstract void delete(T t);  
}
