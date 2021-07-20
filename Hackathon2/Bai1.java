package Hackathon2;

import java.util.Scanner;

public class Bai1 {
    public void checkSnt(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập số hoặc ấn q,x để thoát.");
            String str=sc.nextLine();
            if (str.equals("q")|| str.equals("x")) {
                break;
            }else {
                boolean check=true;
                int n = Integer.parseInt(str);
                for(int i=2;i<n-1;i++) {
                    if (n%i==0) {
                        check=false;
                        System.out.println("Đây không phải là số nguyên tố.");
                        break;
                    }else{check=true;System.out.println("Đây là số nguyên tố");break;}

                }
            }
        }
    } 
}
