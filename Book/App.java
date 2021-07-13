package Book;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        Sach sach1 =new Sach(1,"Conan","Kim Dong",1992);
        Sach sach2 =new Sach(2,"One Piece","Sach Viet Nam",1999);
        Sach sach3 =new Sach(3,"Doremon","Kim Dong",1987);
        Doan doan1=new Doan(1,"Conan","Kim Dong",1992,200,"Nguyên Vẹn",2020);
        Sachgiaokhoa sgk = new Sachgiaokhoa(1,"Conan","Kim Dong",1992,200,"Nguyên Vẹn",20,15);
        sgk.tonkho();
        Tailieudientu tl=new Tailieudientu(1,"Conan","Kim Dong",1992,"128GB",2000000,5000);
        tl.tongtien();
       System.out.print(sach1);doan1.vitri(2, "E7");
        List<Sach> list = new ArrayList<Sach>();
        list.add(sach1);
        list.add(sach2);
        list.add(sach3);
        sach1.sua(list);
        for (Sach s : list){
            System.out.println(s);
        }
        
    }
}
