package QLNV;

import java.util.ArrayList;
import java.util.List;

public class App extends Thread {
    public static void main (String[] args){
Laptrinhvien ltv1=new Laptrinhvien(1,"Nguyễn Quang Tùng",21,0334551213,"Quangtung@gmail.com",4000000,3);
Laptrinhvien ltv2=new Laptrinhvien(2,"Lê Hải Yến",21,0344651313,"haiyen@gmail.com",5000000,4);
Laptrinhvien ltv3=new Laptrinhvien(3,"Nguyễn Quang Duy",18,0351551213,"Quangduy@gmail.com",10000000,7);
Kiemchungvien kcv1=new Kiemchungvien(1,"Nguyễn Quang Tùng",21,0334551213,"Quangtung@gmail.com",4500000,16);
Kiemchungvien kcv2=new Kiemchungvien(2,"Lê Hải Yến",21,0344651313,"haiyen@gmail.com",5300000,20);
Kiemchungvien kcv3=new Kiemchungvien(3,"Nguyễn Quang Duy",18,0351551213,"Quangduy@gmail.com",9000000,21);
List<Laptrinhvien> list = new ArrayList<Laptrinhvien>();
list.add(ltv1);
list.add(ltv2);
list.add(ltv3);

for (Laptrinhvien laptrinhvien : list) {
    try {
        Thread.sleep(1500);
    } catch (InterruptedException e) {
        //TODO: handle exception
        System.out.println(e);
    }
    System.out.println(laptrinhvien);
}
for (Laptrinhvien laptrinhvien : list) {
    laptrinhvien.tinhluong();
}
List<Kiemchungvien> list1=new ArrayList<Kiemchungvien>();
list1.add(kcv1);
list1.add(kcv2);
list1.add(kcv3);
for (Kiemchungvien kiemchungvien : list1) {
    try {
        Thread.sleep(1500);
    } catch (InterruptedException e) {
        //TODO: handle exception
        System.out.println(e);
    }
    System.out.println(kiemchungvien);
}
for (Kiemchungvien kiemchungvien : list1) {
    kiemchungvien.tongluong();
}
    }
}
