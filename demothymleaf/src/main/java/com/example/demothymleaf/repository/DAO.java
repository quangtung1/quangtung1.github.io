package com.example.demothymleaf.repository;

import com.example.demothymleaf.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DAO<T> {
    public List<T> getAll();
    public List<T> create(Car car);
    public List<T> update(Car car,int id);
    public List<T> delete(int id);
    public List<T> search(String model,String manufacturer);
    public List<T> sort();
}
