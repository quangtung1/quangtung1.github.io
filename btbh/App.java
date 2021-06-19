package btbh;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class App{
    public static void main(String[] args){
        Database db = new Database();
        db.customerRepo.add(new Customer("Tom", "tom@gmail.com", "0123456789", "Room 1101, Empire State, New York, USA"));
        db.customerRepo.add(new Customer("Bob", "bob@gmail.com", "0223456788", "1 Láng Hạ"));
        db.customerRepo.add(new Customer("Alice", "alice@gmail.com", "0323456788", "10 Trần Duy Hưng"));
    
        db.productRepo.add(new Product("Aris Pro", "VinSmart", Country.Vietnam, "Android 5G"));
        db.productRepo.add(new Product("MaiWei", "Xiaomi", Country.China, "Thùng đựng đồ thông minh 35-55 lít"));
        db.productRepo.add(new Product("SUP Hyper 12.6", "AquaMarina", Country.China, "SUP touring 12.6, 2 khoang"));
       /*Customer tom = new Customer("Tom", "tom@gmail.com", "0123456789", "Room 1101, Empire State, New York, USA");
        Customer bob = new Customer("Bob", "bob@gmail.com", "0223456788", "1 Láng Hạ");*/
        Product Iphone=new Product("Iphone", "VietNam",Country.Japan,"Iphon11");
        Product aris=new Product("Aris Pro", "VinSmart", Country.Vietnam, "Android 5G");
        db.productRepo.add(Iphone);
       /* List<Linelitem> list=new ArrayList<>();
        list.add(new Linelitem(Iphone,10,1000) );
        list.add(new Linelitem(aris,20,2000));
      Order order = new Order(bob,LocalDateTime.now(),"Xuat xuong",list);
      Order order2 = new Order(tom,LocalDateTime.now(),"xuat xuong",list);
      System.out.println(order);
      System.out.println(order2);*/
      Iphone.setDescription("Iphone12");
      db.productRepo.update(Iphone);
      db.productRepo.deleteByID(2l);
      List<Product> products = db.productRepo.getAll();
      for(Product product : products){
          System.out.println(product);
      }

      
      
      
        List<Customer> customers = db.customerRepo.getAll();
        for(Customer customer : customers){
            System.out.println(customer);
        }
        /*System.out.println();
        List<Product> products = db.productRepo.getAll();
        for(Product product : products){
            System.out.println(product);
        }
        System.out.println();
        Optional<Customer> customer =db.customerRepo.findById(2L);*/
    
    }
}
    