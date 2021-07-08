package QLYSP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args){
       List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Iphone",3,"Dien Thoai",10000000));
        products.add(new Product(2,"SamSung",4,"Dien Thoai",9000000));
        products.add(new Product(3,"HuaWei",2,"Dien Thoai",500000));
        products.sort(new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }

        });
        for (Product p : products){
            System.out.println(p);
        }
        products.sort((p1,p2)->p1.getName().compareTo(p2.getName()));
        for (Product p : products){
            System.out.println(p);
        }
        products.sort(new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
                // TODO Auto-generated method stub
                return o1.getSoluong()>o2.getSoluong()?1:-1;
            }

        });
        for (Product p : products){
            System.out.println(p);
        }
        products.sort((p1,p2)->p1.getSoluong()>p2.getSoluong()?1:-1);
        for (Product p : products){
            System.out.println(p);
        }
        for(Product p : products){
            if (p.getGia()>1000000) {
                System.out.println(p);
            }
        }
        products.stream().filter(p -> p.getGia()>1000000).forEach(p -> System.out.println(p));
        Map<Product,Integer> p=new HashMap<Product,Integer>();
        Product p2=new Product(1,"Iphone",3,"Dien Thoai",10000000);
        Product p3=new Product(2,"SamSung",4,"Dien Thoai",9000000);
        Product p4=new Product(3,"HuaWei",2,"Dien Thoai",500000);



        p.put(p2,(p2.getSoluong()*p2.getGia())); 
        p.put(p3, (p3.getSoluong()*p3.getGia()));
        p.put(p4, (p4.getSoluong()*p4.getGia()));
        for (Map.Entry<Product, Integer> entry : p.entrySet()) {
            System.out.println(entry.getKey() + "Tổng tiền bán được: " + entry.getValue());
        }
    }
}
