package BTVN10;

import java.time.LocalDate;


public class Teacher extends Person {
  public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

public void print(){
      super.show();
      System.out.println(" Lương: "+ luong +"\n");
  }

    long luong;

    public Teacher(int id, String ten, LocalDate date, String diachi, long sdt, String email, long luong) {
        super(id, ten, date, diachi, sdt, email);
        this.luong = luong;
    }

}
