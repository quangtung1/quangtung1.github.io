package com.example.demospring.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class  Dao<T> {
    protected List<T> collections = new ArrayList<>();

    public abstract List<T> getAll();

    public abstract List<T> get(int id);

    public abstract void add(T t);

    public abstract void update(T t,int id);

    public abstract void deleteByID(int id);

    public abstract void delete(T t);
}
