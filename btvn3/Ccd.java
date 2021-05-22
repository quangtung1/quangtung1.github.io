package btvn3;

import java.util.Scanner;

public class Ccd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao chuoi:");
        String str = sc.nextLine();
        int i=0;
        int j=str.length()-1;
        boolean t=true;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)) {
                t=false;
                break;
            }
            i++;
            j--;
        }
        if(t){
            System.out.println("Day la chuoi can bang");
        }else{
            System.out.println("Day khong phai la chuoi can bang");
        }

    }
}