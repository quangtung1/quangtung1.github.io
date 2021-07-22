package SANPHAM;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Product {
    @Override
    public String toString() {
        return "Product [amount=" + amount + ", id=" + id + ", name=" + name + ", price=" + price + ", sellNumber="
                + sellNumber + ", type=" + type + "]";
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public int getSellNumber() {
        return sellNumber;
    }
    public void setSellNumber(int sellNumber) {
        this.sellNumber = sellNumber;
    }
    public Product(long id, String name, String type, int amount, long price, int sellNumber) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.sellNumber = sellNumber;
    }
    public Product(){}
    long id;
    String name;
    String type;
    int amount;
    long price;
    int sellNumber;
    List<Product> products = new ArrayList<Product>();
    
    Scanner sc=new Scanner(System.in);
    public void show(){
         products.stream().forEach(p->System.out.println(p)); 
    }
    public void add(){
       System.out.println("Mời bạn nhập số lượng sản phẩm bạn muốn thêm:");
       int i=sc.nextInt();
       int j=0;
       while(j<i){
           System.out.println("Mời bạn nhập mã sản phẩm:");
           long id = sc.nextLong();sc.nextLine();
           System.out.println("Mời bạn nhập tên sản phẩm:");
           String name =sc.nextLine();
           System.out.println("Mời bạn nhập loại sản phẩm: ");
           String type = sc.nextLine();
           System.out.println("Mời bạn nhập số lượng sản phẩm:");
           int amount = sc.nextInt();sc.nextLine();
           System.out.println("Mời bạn nhập giá sản phẩm:");
           long price = sc.nextLong();sc.nextLine();
           System.out.println("Mời bạn nhập số sản phẩm bán được:");
           int sellNumber = sc.nextInt();
          Product p=new Product(id,name,type,amount,price,sellNumber);
          products.add(p);
          j++;
       }
    }
    public void edit(){
        System.out.println("Mời bạn nhập mã sản phẩm mà bạn muốn sửa:");
        long ID= sc.nextLong();
        for (int i = 0; i < products.size(); i++) {
            if (ID==products.get(i).getId()) {
                System.out.println("Mời bạn nhập mã sản phẩm:");
                long id = sc.nextLong();sc.nextLine();
                System.out.println("Mời bạn nhập tên sản phẩm:");
                String name =sc.nextLine();
                System.out.println("Mời bạn nhập loại sản phẩm: ");
                String type = sc.nextLine();
                System.out.println("Mời bạn nhập số lượng sản phẩm:");
                int amount = sc.nextInt();sc.nextLine();
                System.out.println("Mời bạn nhập giá sản phẩm:");
                long price = sc.nextLong();sc.nextLine();
                System.out.println("Mời bạn nhập số sản phẩm bán được:");
                int sellNumber = sc.nextInt();
                products.get(i).setId(id);
                products.get(i).setName(name);
                products.get(i).setType(type);
                products.get(i).setAmount(amount);
                products.get(i).setPrice(price);
                products.get(i).setSellNumber(sellNumber);
            }
        }
    }
    public void delete(){
        System.out.println("Mời bạn nhập mã sản phẩm muốn xóa:");
        long ID = sc.nextLong();
        boolean check = false;
        for(int i = 0; i < products.size();i++) {
            if (ID== products.get(i).getId()) {
                check=true;
                products.remove(i);break;
            }else{check=false;System.out.println("Không tìm thấy mã sản phẩm tương ứng.");}
        }
    }
    public void showSellNumber(){
        Map<String,Integer> product = new HashMap<String,Integer>();
        for (Product p : products) {
            product.put(p.getName(),p.getSellNumber());
        }
        for(Map.Entry<String,Integer>entry : product.entrySet()) {
            System.out.println(entry.getKey()+" Số lượng bán được: " + entry.getValue());
        }
    }
  /*  public void ProductByType(){
        Map<String,Integer> product = new HashMap<String,Integer>();
        for (Product p : products) {
            product.put(p.getType(),p.getAmount());
        }
        for (Map.Entry<String, Integer> entry : product.entrySet()) {
            System.out.println(entry.getKey() + " Số lượng sản phẩm: " + entry.getValue());
    
}
    }*/
    
    public void ProductByType(){
        Map<String,Integer> product = new HashMap<String,Integer>();
        
        for (Product p : products) {
            product.put(p.getType(),0);}
        
            for (Product p : products) {
                
                int n=product.get(p.getType());
               
                
                if (product.containsKey(p.getType())) {
                    product.put(p.getType(),n+p.getAmount());
                }
    
            } 
        for (Map.Entry<String, Integer> entry : product.entrySet()) {
            System.out.println(entry.getKey() + " Số lượng sản phẩm: " + entry.getValue());
    }}
    public void menu(){
     products.add(new Product(1,"Bim Bim","Thức ăn",10,5000,5));
    products.add(new Product(2,"Xong nồi","Đồ gia dụng",20,15000,12));
    products.add(new Product(7,"Bát đũa","Đồ gia dụng",60,15000,12));
    products.add(new Product(3,"Áo Phông","Thời trang",14,200000,6));
    products.add(new Product(4,"Son môi","Mĩ phẩm",21,175000,11));
    products.add(new Product(5,"Quần Jean","Thời trang",6,175000,3));
    products.add(new Product(6,"Sơ mi","Thời trang",7,175000,11));
    products.add(new Product(8,"Short","Thời trang",7,175000,11));
    products.add(new Product(9,"Dép","Thời trang",7,175000,11));
        System.out.println("1. Xem thông tin các sản phẩm hiện có.");
        System.out.println("2. Thêm sản phẩm mới.");
        System.out.println("3. Sửa thông tin sản phẩm theo mã sản phẩm.");
        System.out.println("4. Xóa sản phẩm theo mã sản phẩm.");
        System.out.println("5. Hiển thị số lượng sản phẩm bán được.");
        System.out.println("6. Liệt kê loại sản phẩm và số lượng của loại sản sản phẩm đó.");
        System.out.println("7. Sắp xếp sản phẩm theo tên");
        System.out.println("0. Thoát.");
        System.out.println("Mời bạn chọn lệnh:");
        
        while (true) {
            int n=sc.nextInt();
            switch (n) {
                case 1: show();break;
                case 2: add();break;
                case 3: edit();break;
                case 4:delete();break;
                case 5: showSellNumber( );break;
                case 6:ProductByType();break;
                case 7: products.sort(new Comparator<Product>() {

                    @Override
                    public int compare(Product o1, Product o2) {
                        // TODO Auto-generated method stub
                        return o1.getName().compareTo(o2.getName());
                    }});
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 0: System.exit(0);
                    
                    
            
                default:
                    break;
            }
        }
    }
     
}
