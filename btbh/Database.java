package btbh;
public class Database{
   

    public Reponsitory<Customer> customerRepo;
    public Reponsitory<Product> productRepo;
    public Reponsitory<Order> orderRepo;
  
    public Database() {
      customerRepo = new Reponsitory<>();
      productRepo = new Reponsitory<>();
      orderRepo = new Reponsitory<>(); 
}
}