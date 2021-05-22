package btvn3;

import java.util.Scanner;

public class Ltb {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
     String[]a={"fuck","damn","sex"};
      
      System.out.println("Hay nhap chuoi:");
      String  str=sc.nextLine();
      int i=0;
      while (i<a.length) {
          if (str.contains(a[i])) {
              str=str.replace(a[i], "***");
          }
          i++;
      }
      System.out.println(str);
     
    }
 
}
