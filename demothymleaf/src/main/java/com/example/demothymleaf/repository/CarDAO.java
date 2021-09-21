package com.example.demothymleaf.repository;

import com.example.demothymleaf.model.Car;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO implements DAO<Car> {
    List<Car> list = new ArrayList<Car>();
    public CarDAO(){
        list.add(new Car(1,"Toyota","xe hơi","img1",500000000,200000000));
        list.add(new Car(2,"Huyndai","xe tải","img2",1500000000,100000000));
        list.add(new Car(3,"Mecedec","xe hơi","img3",2000000000,1000000000));
        list.add(new Car(4,"Audi","xe hơi","img4",250000000,200000000));
        list.add(new Car(5,"Lexux","xe hơi","img5",270000000,200000000));
    }
    @Override
    public List<Car> getAll() {
        return list;
    }

    @Override
    public List<Car> create(Car car) {
        Car c = new Car();
        c.setId(car.getId());
        c.setManufactory(car.getManufactory());
        c.setImg(car.getImg());
        c.setModel(car.getModel());
        c.setPrice(car.getPrice());
        c.setSale(car.getSale());
        list.add(c);
        return list;
    }

    @Override
    public List<Car> update(Car car, int id) {
        for (Car c:list) {
            if (c.getId()==id){
                c.setManufactory(car.getManufactory());
                c.setImg(car.getImg());
                c.setModel(car.getModel());
                c.setPrice(car.getPrice());
                c.setSale(car.getSale());
            }
        }
        return list;
    }

    @Override
    public List<Car> delete(int id) {
        boolean check =false;
        for (Car c: list) {
            if(c.getId()==id){
                list.remove(c);
                check =true;
            }else{
                System.out.println("Not found Id");
            }
        }
        if (check ==true){
            System.out.println("Delete successful");
        }
        return list;
    }

    @Override
    public List<Car> search(String model, String manufacturer) {
        return list.stream().filter(c->(c.getManufactory().equals(manufacturer)||c.getModel().equals(model) )).collect(Collectors.toList());
    }

    @Override
    public List<Car> sort() {
        return list.stream().sorted(Comparator.comparing(Car::getPrice)).collect(Collectors.toList());
    }


}
