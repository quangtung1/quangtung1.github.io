package SANPHAM;

import java.util.Scanner;

public class HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều dài:");
        int n=sc.nextInt();sc.nextLine();
        System.out.println("Mời bạn nhập chiều rộng");
        int m=sc.nextInt();
        for (int j=0; j<m; j++) {
            System.out.println();
            for (int i=0;i<n;i++){
                System.out.print("* \t");
                
            }
        }
    }
}
