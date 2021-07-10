package FPTShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Fpt> items = new ArrayList<Fpt>();
        items.add(new Fpt(01, "Oppo Reno5", "Oppo Reno5 8GB-128GB", 10, 7, "Oppo", 8390000, Danhmuc.Dienthoai));
        items.add(new Fpt(02, " Oppo Reno4 Pro", " Oppo Reno4 Pro", 25, 10, "Oppo", 11490000, Danhmuc.Dienthoai));
        items.add(new Fpt(03, "Samsung Galaxy Z Flip", "Samsung Galaxy Z Flip", 10, 3, "Samsung", 20990000,
                Danhmuc.Dienthoai));
        items.add(new Fpt(04, " Asus Zenbook UX325EA-EG079T", " Asus Zenbook UX325EA-EG079T", 10, 6, "Asus", 20790000,
                Danhmuc.Laptop));
        items.add(new Fpt(05, "Dell G3 15 i5 10300H", "Dell G3 15 i5 10300H", 10, 1, "Dell", 28970000, Danhmuc.Laptop));
        items.add(new Fpt(06, "iPhone 12 Pro Max ", "iPhone 12 Pro Max-128GB", 5, 2, "Apple", 30990000, Danhmuc.Apple));
        items.add(new Fpt(07, "MacBook Air 13", "MacBook Air 13 2020 M1 16GB/256GB ", 20, 4, "Apple", 33990000,
                Danhmuc.Apple));
        items.add(new Fpt(8, "Loa bluetooth Compact 2", "Loa bluetooth Compact 2", 21, 15, "Xiaomi", 290000,
                Danhmuc.Phukien));
        System.out.println("Mời bạn chọn:");
        System.out.println("1. In thông tin dựa trên danh mục \n" + "2. In thông tin các sản phậm dựa theo hãng \n"
                + "3.In thông tin dữa theo mức giá và danh mục \n" + "0.Thoát");
        int t = sc.nextInt();
        switch (t) {
            case 1:
                System.out.println("Mời bạn chọn mục");
                System.out.println("1.Điện thoại\n" + "2.Apple\n" + "3.Laptop" + "4.Phụ kiện");
                int s = sc.nextInt();
                switch (s) {
                    case 1:
                        items.stream().filter(i -> i.getD().equals(Danhmuc.Dienthoai))
                                .forEach(i -> System.out.println(i));
                        break;
                    case 2:

                        items.stream().filter(i -> i.getD().equals(Danhmuc.Apple)).forEach(i -> System.out.println(i));
                        break;
                    case 3:
                        items.stream().filter(i -> i.getD().equals(Danhmuc.Laptop)).forEach(i -> System.out.println(i));
                        break;
                    case 4:
                        items.stream().filter(i -> i.getD().equals(Danhmuc.Phukien))
                                .forEach(i -> System.out.println(i));
                        break;
                }
                break;
            case 2: 
                System.out.println("Mời bạn nhập hãng");
                String z = sc.nextLine();
                items.stream().filter(b -> b.getHang().equals(z)).forEach(b -> System.out.println(b));
                break;
            
               
            
              case 3: System.out.println("Mời bạn chọn mục");
              System.out.println("1.Điện thoại\n"+"2.Apple\n"+"3.Laptop"+"4.Phụ kiện"); int
              m =sc.nextInt(); switch (m) {
              case 1: System.out.println("Mời bạn chọn mức giá:");
              System.out.println("1.Dưới 2M\n"+"2.Từ 2-4M\n"+"3.Từ 4-7M\n"+"4.Từ 7-13M\n"+"5.Trên 13M");
              int l=sc.nextInt();
              switch(l) {
                  case 1: items.stream().filter(f->f.getGia()<2000000).forEach(f->System.out.println(f));break;
                  case 2: items.stream().filter(f->(f.getGia()>2000000 && f.getGia()<4000000)).forEach(f->System.out.println(f));break;
                  case 3: items.stream().filter(f->(f.getGia()>4000000 && f.getGia()>7000000)).forEach(f->System.out.println(f));break;
                  case 4: items.stream().filter(f->(f.getGia()>7000000 && f.getGia()<13000000)).forEach(f->System.out.println(f));break;
                  case 5: items.stream().filter(f->f.getGia()>13000000).forEach(f->System.out.println(f));break;

              }break;
              case 2:System.out.println("Mời bạn chọn mức giá:");
              System.out.println("1.Dưới 2M\n"+"2.Từ 2-4M\n"+"3.Từ 4-7M\n"+"4.Từ 7-13M\n"+"5.Trên 13M");
              int p=sc.nextInt();
              switch(p) {
                  case 1: items.stream().filter(f->f.getGia()<2000000).forEach(f->System.out.println(f));break;
                  case 2: items.stream().filter(f->(f.getGia()>2000000 && f.getGia()<4000000)).forEach(f->System.out.println(f));break;
                  case 3: items.stream().filter(f->(f.getGia()>4000000 && f.getGia()>7000000)).forEach(f->System.out.println(f));break;
                  case 4: items.stream().filter(f->(f.getGia()>7000000 && f.getGia()<13000000)).forEach(f->System.out.println(f));break;
                  case 5: items.stream().filter(f->f.getGia()>13000000).forEach(f->System.out.println(f));break;

              }break;
              case 3: System.out.println("Mời bạn chọn mức giá:");
              System.out.println("1.Dưới 2M\n"+"2.Từ 2-4M\n"+"3.Từ 4-7M\n"+"4.Từ 7-13M\n"+"5.Trên 13M");
              int o=sc.nextInt();
              switch(o) {
                  case 1: items.stream().filter(f->f.getGia()<2000000).forEach(f->System.out.println(f));break;
                  case 2: items.stream().filter(f->(f.getGia()>2000000 && f.getGia()<4000000)).forEach(f->System.out.println(f));break;
                  case 3: items.stream().filter(f->(f.getGia()>4000000 && f.getGia()>7000000)).forEach(f->System.out.println(f));break;
                  case 4: items.stream().filter(f->(f.getGia()>7000000 && f.getGia()<13000000)).forEach(f->System.out.println(f));break;
                  case 5: items.stream().filter(f->f.getGia()>13000000).forEach(f->System.out.println(f));break;

              }break;
              case 4:System.out.println("Mời bạn chọn mức giá:");
              System.out.println("1.Dưới 2M\n"+"2.Từ 2-4M\n"+"3.Từ 4-7M\n"+"4.Từ 7-13M\n"+"5.Trên 13M");
              int q=sc.nextInt();
              switch(q) {
                  case 1: items.stream().filter(f->f.getGia()<2000000).forEach(f->System.out.println(f));break;
                  case 2: items.stream().filter(f->(f.getGia()>2000000 && f.getGia()<4000000)).forEach(f->System.out.println(f));break;
                  case 3: items.stream().filter(f->(f.getGia()>4000000 && f.getGia()>7000000)).forEach(f->System.out.println(f));break;
                  case 4: items.stream().filter(f->(f.getGia()>7000000 && f.getGia()<13000000)).forEach(f->System.out.println(f));break;
                  case 5: items.stream().filter(f->f.getGia()>13000000).forEach(f->System.out.println(f));break;

              }break;
              }
              break;
             case 4: System.out.println("Mời bạn nhập tên sản phẩm:");
             String y =sc.nextLine();
             items.stream().filter(v->v.getTen().equals(y)).forEach(v->System.out.println(v));break;
            case 0:
                System.exit(0);
                break;
            default:
                break;
        }

    }

}
