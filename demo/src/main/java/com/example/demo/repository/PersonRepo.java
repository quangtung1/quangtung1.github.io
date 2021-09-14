package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonRepo {

    List<Person> people ;

    public PersonRepo() {
        people = new ArrayList<>(List.of((new Person("Tùng", "Nam Định", 21)),
                (new Person("Yến", "Bắc Cạn", 21)),
                (new Person("Duy", "Nam Định", 4)),
                (new Person("Mạnh", "Thái Nguyên", 19)),
                (new Person("Hải", "Hà Nội", 28)),
                (new Person("Hùng", "Nam Định", 24)),
                (new Person("Bình", "Hà Nội", 25)),
                (new Person("Hoài", "Na Rì", 17))));
    }
    public void getPeoplebyAge(){
       people.stream().filter(p->p.getAge()>20&&p.getAge()<30).forEach(p-> System.out.println(p));
    }
    public void avgAge(){
        System.out.println( people.stream().collect(Collectors.averagingInt(Person::getAge)));
    }
    public void avgAgebyCon(){
        System.out.println(people.stream().collect(Collectors.groupingBy(Person::getNationality,Collectors.averagingInt(Person::getAge))));
    }
}
