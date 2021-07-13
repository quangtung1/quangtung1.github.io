package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sach {
    @Override
    public String toString() {
        return "Sach [id=" + id + ", namsanxuat=" + namsanxuat + ", nhaxuatban=" + nhaxuatban + ", tensach=" + tensach
                + "]";
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTensach() {
        return tensach;
    }
    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    public String getNhaxuatban() {
        return nhaxuatban;
    }
    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }
    public int getNamsanxuat() {
        return namsanxuat;
    }
    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }
    public Sach(long id, String tensach, String nhaxuatban, int namsanxuat) {
        this.id = id;
        this.tensach = tensach;
        this.nhaxuatban = nhaxuatban;
        this.namsanxuat = namsanxuat;
    }
    long id;
    String tensach;
    String nhaxuatban;
    int namsanxuat;
    public void them( List<Sach> list){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập ID của sách:");
        long i=sc.nextLong();sc.nextLine();
        System.out.println("Mời bạn nhập tên sách:");
        String z=sc.nextLine();
        System.out.println("Mời bạn nhập nhà sản xuất:");
        String m=sc.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất:");
        int k=sc.nextInt();
        Sach sach=new Sach(i,z,m,k);
        list.add(sach);
    }
    public void sua( List<Sach> list){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn ID của sách cần sửa:");
        long k=sc.nextLong();sc.nextLine();
        for(int i=0;i<list.size();i++) {
            if (k==list.get(i).getId()) {
                System.out.println("Mời bạn nhập ID của sách:");
                long n=sc.nextLong();sc.nextLine();
                System.out.println("Mời bạn nhập tên sách:");
                String z=sc.nextLine();
                System.out.println("Mời bạn nhập nhà sản xuất:");
                String m=sc.nextLine();
                System.out.println("Mời bạn nhập năm sản xuất:");
                int o=sc.nextInt();
                list.get(i).setId(n);
                list.get(i).setTensach(z);
                list.get(i).setNhaxuatban(m);
                list.get(i).setNamsanxuat(o);
            }
        }
    }
    public void xoa( List<Sach> list){
Scanner sc=new Scanner(System.in);
System.out.println("Mời bạn nhập ID của sách cần xóa:");
long id =sc.nextLong();sc.nextLine();
for(int i=0;i<list.size();i++) {
    if (id==list.get(i).getId()) {
        list.remove(i);
    }
}
    }
}
