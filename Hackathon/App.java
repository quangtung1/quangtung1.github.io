package Hackathon;

import java.time.LocalDate;

import java.util.Scanner;
public class App {
    
    
    public static void main(String[] args) {
Euro euro = new Euro();
        String[] b = { "Tây Ban Nha", "Bỉ", "Thụy Sĩ", "Anh" };
        euro.Team(b);
      System.out.println(  euro.cameCase("NGUyen  Quang   TUNG"));
      InternetBanking in = new InternetBanking();
      Scanner sc=new Scanner(System.in);
      InternetBanking a[]=null;
      int n=0;
      boolean check=true;
      while(check){
        System.out.println("Mời bạn chọn:");
        System.out.println("1.Đăng Nhập \n"+"2.Xem Số Dư \n"+"3.Chuyển Khoản \n"+"4.Xem Lịch Sử Giao Dịch \n"+"5.Thoát");
        int t=sc.nextInt();
        switch (t) {
            case 1:System.out.println("Số tài khoản bạn muốn nhập:");
            n=sc.nextInt();
            a=new InternetBanking[n];
            for (int i = 0;i<n;i++) {
                System.out.println("Số tài khoản thứ "+i);
                a[i]=new InternetBanking();
                in.nhap(a[i]);
            }
                
                break;
                case 2:System.out.println("Số dư trong tài khoản:");
                for(int i=0;i<n;i++){
                   System.out.println( "Số dư trong tài khoản thứ "+i +" là: "+a[i].getSodu());
                }
                break;
                case 3:long chuyen,nhan,tienchuyen,c,s,d,f;
                System.out.println("Nhập số tài khoản chuyển:");
                s=sc.nextLong();
                System.out.println("Nhập số tài khoản nhận:");
                c=sc.nextLong();
                for (int i = 0;i<n;i++){
                    d=a[i].getSoTk();
                    if (s==d) {
                        chuyen=a[i].getSodu();
                        for(int j=0;j<n;j++){
                            f=a[j].getSoTk();
                            if (c==f) {
                                nhan=a[j].getSodu();
                                System.out.println("Nhập số tiền cần chuyển:");
                                tienchuyen=sc.nextLong();
                                if (tienchuyen<chuyen && chuyen>50000) {
                                    chuyen=chuyen-tienchuyen;
                                    nhan=nhan+tienchuyen;
                                    a[i].setSodu(chuyen);
                                    a[j].setSodu(nhan);
                                    System.out.println("Tài khoản số: "+ d +" vừa chuyển: "+ tienchuyen);
                                    System.out.println("Tài khoản số: "+ f +" vừa nhận: "+ tienchuyen);
                                    System.out.println("Đã lưu vào lịch sử giao dịch.");
                                }else{System.out.println("Số tiền không hợp lệ");}
                            }
                        }
                    }
                }
                break;
                case 4:
                System.out.println("Lịch sử giao dịch:");
                for(int i=0; i<n;i++){
                    System.out.println(i+1 +" - "+ LocalDate.now()+" - "+a[i].getSoTk()+" - "+a[i].getSodu()  );
                } 
                break;
        
            default:System.out.println("Bye!!");
            check = false;
            break;
               
        }
      }
        
    }

        
    
}
