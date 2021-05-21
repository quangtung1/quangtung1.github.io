package btnc;
import java.util.Scanner;
public class Hinhchunhat {
    public static void main(String[] args){

       
        int c;
        int r;
        Scanner sc = new Scanner(System.in);
         
        System.out.print("height = ");
        c = sc.nextInt();
        System.out.print("Rong = ");
        r = sc.nextInt();
        for (int i = 0;i<c;i++){
            for (int j=0;j<r;j++){
                if (i==0||j==0||i==c-1||j==r-1) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
            }
            System.out.println("");
        }
}}
