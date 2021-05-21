package btnc;

import java.util.Scanner;

public class Tamgiac1 {
    public static void main(String[] args){
        int n;
   System.out.print("Nhap N:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=0;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
    System.out.println("");
    }
    
}}
