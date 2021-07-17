package BTGenerics;

import java.util.ArrayList;

public class PersonController<T> {
    ArrayList<T> people = new ArrayList<T>();
    public void add(T person) {
        people.add(person);
    }
    public void display(){
        for(T person : people){
            System.out.println(person);
        }
    }
}
