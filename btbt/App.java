package btbt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
   



    public static boolean isContain(String s1,String s2){
       /* boolean result;
        result = s1.contains(s2);
        return result;*/
        int i=0;
        int j=0;
        while (i< s1.length() && j< s2.length()) {
            if (s1.charAt(i)==s2.charAt(j)) {
                i++;
            }
            if (s1.length()==i) {
                return true;
            }
            j++;
        }
        return false;
    }
public static String reverse(){
    String orig;
    String rev="";
    Scanner s = new Scanner(System.in);
System.out.println("Nhập chuỗi ban đầu:");
orig = s.nextLine();
for(int i=orig.length()-1;i>=0;i--){
    rev=rev+orig.charAt(i);
}
return rev;
}
public static int find(){
    int result=0;
    String s1;String s2;
   Scanner s = new Scanner(System.in);
   System.out.println("Nhập chuỗi:");
   s1=s.nextLine();
   System.out.println("Nhập chuỗi cần tìm:");
   s2=s.nextLine();
   for(int i=0;i<s2.length();i++){
result=s1.indexOf(s2, i);
   }
   return result;
}
public static String cameCase(String input){
    String s1="";
    String[] ss = input.split(" ");
    for(int i=0;i<ss.length;i++){
        s1=s1+(Character.toUpperCase(ss[i].charAt(0))+ss[i].substring(1)+ " ");   
    }
    return s1;
}
public static String longestWord(){
    Scanner s = new Scanner(System.in);
    System.out.println("Nhập chuỗi:");
    String input = s.nextLine();
    String[] str= input.split(" ");
    int max=0;
    int j=0;
    for(int i=0;i<str.length;i++){
        int len=str[i].length();
        if (len > max) {
            max=len;
            j=i;
        }

    }
    return str[j];
}
public static void countWord(){
    int count;
    String ss;
    Scanner s = new Scanner(System.in);
    System.out.println("Nhập chuỗi:");
    String input = s.nextLine();
    String [] str = input.split(" ");
   Map< String , Integer > m =new HashMap<String , Integer>();
   for(int i =0 ; i < str.length;i++){
ss=str[i];
if (m.containsKey(ss)) {
    count=m.get(ss);
    count++;
    m.replace(ss, count);
}else{m.put(ss, 1);}
   }
     for( String sv : m.keySet() ){
         System.out.println(sv + " xuất hiện " + m.get(sv) +" lần" );

     }  
}



    public static void main(String[] args){
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất:");
        String str1=sc.nextLine();
        System.out.println("Nhập chuỗi thứ hai:");
        String str2=sc.nextLine();*/
       /* boolean result = isContain("Tung", "Tung dep trai");
        System.out.println(result);*/
/*String a = reverse();
System.out.println("Chuỗi đảo ngược là:");
System.out.println(a);*/
/*int result = find();
    System.out.println(result);*/
    /*String a =cameCase("HA noi thu hai nay");
    System.out.println(a.split(" ").length);*/
    /*String a=longestWord();
    System.out.println("Từ dài nhất có trong dãy là:");
    System.out.println(a);*/
countWord();
    }

}
