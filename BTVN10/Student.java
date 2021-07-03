package BTVN10;

import java.time.LocalDate;


public class Student extends Person {
    

   

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public void show() {
        super.show();
        System.out.println(" Điểm Trung Bình: " + dtb +"\n");
    }

    double dtb;

    public Student(int id, String ten, LocalDate date, String diachi, long sdt, String email, double dtb) {
        super(id, ten, date, diachi, sdt, email);
        this.dtb = dtb;
    }
    
}
