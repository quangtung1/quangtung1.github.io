package day3;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Logic {
public void guessNumber(){
    Random r=new Random();
    int number=r.nextInt(100);
    Scanner sc=new Scanner(System.in);
while(true){
    System.out.println("Nhap ten cua ban, go q de thoat");
    String str= sc.nextLine();
    if(str.equals("q")){
        break;
    }else {
        int guessNumber=Integer.parseInt(str);
        if (guessNumber>number) {
            System.out.println("so ban nhap lon hon");
        
            
        }if(guessNumber < number) {
            System.out.println("So ban nhap nho hon");

        }
        if (guessNumber==number) {
            System.out.println("Correct");
            
        }
}
sc.close();
}

}
public void Email(){
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("Moi ban nhap Email: hoac an q de thoat:");
        String input = sc.nextLine();
        String regex="^[a-zA-Z]+[a-z0-9]*@{1}\\w+mail.com$";
        Pattern p = Pattern.compile(regex);
        Matcher m= p.matcher(input);
        if(input.equals("q")){
            break;
        }
        else {if (m.find()) {
            System.out.println("Nice");
            break;
        }
           else {
               System.out.println("Vui long nhap lai");
               break;
           }
        }
        
         
    }
    sc.close(); 
}
public void Snt(){
Scanner sc = new Scanner(System.in);
System.out.println("Nhap so:");
int n=sc.nextInt();
System.out.println("Cac so nguyen to nho hon " +n+ " la: ");
 for(int i=1;i<n;i++){
     int dem=0;
     for(int j=1;j<=i;j++){
         if (i%j==0) {
             dem++;
         }
     }
     if (dem==2){
         System.out.print(" " +i);
     }
 } 
 sc.close();
}
}
