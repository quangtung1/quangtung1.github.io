package BTVN10;

import java.time.LocalDate;


public class Person {
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public long getSdt() {
        return sdt;
    }
    public void setSdt(long sdt) {
        this.sdt = sdt;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Person(int id, String ten, LocalDate date, String diachi, long sdt, String email) {
        this.id = id;
        this.ten = ten;
        this.date = date;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }
    int id;
    String ten;
    LocalDate date;
    String diachi;
    long sdt;
    String email;
    public void show(){
        System.out.println(" Date=" + date +"\n" + " Diachi=" + diachi +"\n"+ " Email=" + email +"\n"+ " Id=" + id +"\n"+ " Sdt=" + sdt
        +"\n"+ " Ten=" + ten );
    }
    
}
