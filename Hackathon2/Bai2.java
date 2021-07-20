package Hackathon2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    @Override
    public String toString() {
        return "Khách hàng [email=" + email + ", gt=" + gt + ", list=" + list + ", makh=" + makh + ", ngaysinh=" + ngaysinh
                + ", quequan=" + quequan + ", sdt=" + sdt + ", ten=" + ten + "]";
    }
    public Bai2(String makh, String ten, LocalDate ngaysinh, String quequan, String sdt, String email, Gioitinh gt) {
        setMakh(makh);
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        setSdt(sdt);
        setEmail(email);
        this.gt = gt;
    }
    public String getMakh() {
        return makh;
    }
    public void setMakh(String makh) {
        this.makh = Validation.validateMakh(makh);
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public LocalDate getNgaysinh() {
        return ngaysinh;
    }
    public void setNgaysinh(LocalDate ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public String getQuequan() {
        return quequan;
    }
    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = Validation.validateMobile(sdt);
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = Validation.validateEmail(email);
    }
    public Gioitinh getGt() {
        return gt;
    }
    public void setGt(Gioitinh gt) {
        this.gt = gt;
    }
    public Bai2(){}
    String makh;
    String ten;
    LocalDate ngaysinh;
    String quequan;
    String sdt;
    String email;
    Gioitinh gt;
    List<Bai2> list = new ArrayList<Bai2>();
    
    
    
    public void show() {
       
        for (Bai2 b : list) {
            System.out.println(b);
        }
    }
    public void showKHnu(){
        list.stream().filter(b->b.getGt().equals(Gioitinh.nu)).forEach(b->System.out.println(b));
    }
    public void showKhnam(){
        list.stream().filter(b->b.getGt().equals(Gioitinh.nam)).forEach(b->System.out.println(b));
    }
    public void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập số khách hàng mà bạn muốn thêm:");
        int n=sc.nextInt();sc.nextLine();
        int j=0;
        
        while (j<n) {
            System.out.println("Mời bạn nhập mã:");
            String makh=sc.nextLine();
            makh=Validation.validateMakh(makh);
            if (makh.equals(getMakh())) {
                System.out.println("Vui lòng chọn mã khách hàng khác:");
            }
            System.out.println("Mời bạn nhập tên khách hàng:");
            String ten=sc.nextLine();
            System.out.println("Mời bạn nhập ngày sinh:");
            LocalDate ngaysinh = LocalDate.now();
            System.out.println("Mời bạn nhập quê quán");
            String quequan =sc.nextLine();
            System.out.println("Mời bạn nhập số điện thoại:");
            String sdt=sc.nextLine();
            sdt=Validation.validateMobile(sdt);
            System.out.println("Mời bạn nhập Email:");
            String email = sc.nextLine();
            email=Validation.validateEmail(email);
            System.out.println("Mời bạn chọn giới tính. 1 - là nữ, 2 - là nam");
            int m=sc.nextInt();
            Gioitinh g=Gioitinh.nam;
            if(m==1){
                g=Gioitinh.nu;
            }if(m==2){
                g=Gioitinh.nam;
            }
            j++;
            Bai2 z=new Bai2(makh,ten,ngaysinh,quequan,sdt,email,g);
        list.add(z);  
        }
        
    }
    public void delete(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập mã khách hàng bạn muốn xóa:");
        String n=sc.nextLine();
        boolean b=false;
        for (int i = 0; i < list.size(); i++) {
            if (n.equals(list.get(i).getMakh())) {
                b=true;
                list.remove(i);break;
            }else{b=false;System.out.println("Không tìm thấy mã khách hàng tương ứng.");}
        }
    }
    public void menu(){
        list.add(new Bai2("036200001596","Tung",LocalDate.of(2000, 12, 01),"Nam Dinh","0387785580","tung@gmail.com",Gioitinh.nam));
    list.add(new Bai2("036200001111","Yen",LocalDate.of(2000, 11, 11),"Bac Kan","0392641011","yen14@gmail.com",Gioitinh.nu));
        System.out.println("1. Xem thông tin khách hàng.");
        System.out.println("2. Xem thông tin khách hàng nữ.");
        System.out.println("3. Xem thông tin khách hàng nam.");
        System.out.println("4. Thêm khách hàng mới.");
        System.out.println("5. Xóa khách hàng theo mã khách hàng.");
        System.out.println("0. Thoát.");
       
        while(true) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            switch (n) {
                case 1:
                    show();
                    break;
                    case 2:showKHnu();break;
                    case 3:showKhnam();break;
                    case 4: add();break;
                    case 5: delete();break;
                    case 0: System.exit(0);
            
                default:
                    break;
            }
        }
    }
}
