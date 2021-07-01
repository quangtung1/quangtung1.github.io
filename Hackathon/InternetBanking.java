package Hackathon;

import java.util.Scanner;

public class InternetBanking {

   
    public long getSoTk() {
        return soTk;
    }
    public void setSoTk(long soTk) {
        this.soTk = soTk;
    }
    public String getMk() {
        return mk;
    }
    public void setMk(String mk) {
        this.mk = mk;
    }
    public long getSodu() {
        return sodu;
    }
    public void setSodu(long sodu) {
        this.sodu = sodu;
    }
    @Override
    public String toString() {
        return "InternetBanking [Mat khau=" + mk+ ", soTk=" + soTk + ", sodu=" + sodu + "]";
    }
    long soTk;
    String mk;
    long sodu;

    public InternetBanking() {}
    public InternetBanking(long soTk, String mk, long sodu) {
        this.soTk = soTk;
        this.mk = mk;
        this.sodu = sodu;
}

public void nhap(InternetBanking tk){
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập số tài khoản:");
    tk.setSoTk(sc.nextLong());sc.nextLine();
    System.out.println("Nhập mật khẩu:");
    tk.setMk(sc.nextLine());
    tk.setSodu(150000L);
}
}
