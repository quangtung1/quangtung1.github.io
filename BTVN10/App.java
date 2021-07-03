package BTVN10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String args[]) throws Exception {
        Teacher t1 = new Teacher(1,"TUng",LocalDate.of(2000, 12,01),"Ha Noi",0321364211,"tung01@gmail.com",100000000L);
        Teacher t2 = new Teacher(2,"Yen",LocalDate.of(2000, 11,11),"Bac Kan",0326321124,"tung01@gmail.com",150000000L);
        Teacher t3 = new Teacher(3,"Duy",LocalDate.of(2000, 10,20),"Nam Dinh",0351224666,"tung01@gmail.com",200000000L);
        Student s1 = new Student(1,"TUng",LocalDate.of(2000, 12,01),"Ha Noi",0321364211,"tung01@gmail.com",9.6);
        Student s2 = new Student(2,"Yen",LocalDate.of(2000, 11,11),"Bac Kan",0326321124,"tung01@gmail.com",9.2);
        Student s3 = new Student(3,"Duy",LocalDate.of(2000, 10,20),"Nam Dinh",0351224666,"tung01@gmail.com",10.0);
        List<Student>s= new ArrayList<Student>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        Collections.sort(s, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getTen().compareTo(o2.getTen());
            }

        });
        for (Student b:s){
            b.show();
        }
        Collections.sort(s, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getDtb()>o2.getDtb() ? 1 :-1;
            }

        });
        for (Student n:s) {
            n.show();
        }
        List<Teacher> t= new ArrayList<>();
        t.add(t1);
        t.add(t2);
        t.add(t3);
        Collections.sort(t,new Comparator<Teacher>(){

            @Override
            public int compare(Teacher o1, Teacher o2) {
                // TODO Auto-generated method stub
                return o1.getTen().compareTo(o2.getTen());
            }

        });
        for(Teacher z: t){
           
            z.print();
        }
        Collections.sort(t,new Comparator<Teacher>(){

            @Override
            public int compare(Teacher o1, Teacher o2) {
                // TODO Auto-generated method stub
                return o1.getLuong()>o2.getLuong()?1:-1;
            }

        });
        for(Teacher z: t){
           
            z.print();
        }
        

    }
}
