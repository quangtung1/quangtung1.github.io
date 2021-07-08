package QLYSP;

public class Product {
    @Override
    public String toString() {
        return "Product [ghichu=" + ghichu + ", gia=" + gia + ", id=" + id + ", name=" + name + ", soluong=" + soluong
                + "]";
    }
    public int getGia() {
        return gia;
    }
    public void setGia(int gia) {
        this.gia = gia;
    }
    public Product(long id, String name, int soluong, String ghichu, int gia) {
        this.id = id;
        this.name = name;
        this.soluong = soluong;
        this.ghichu = ghichu;
        this.gia = gia;
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
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public String getGhichu() {
        return ghichu;
    }
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
    long id;
    String name;
    int soluong;
    String ghichu;
    int gia;
   
     
}
