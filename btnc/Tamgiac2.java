package btnc;
import java.util.Scanner;
public class Tamgiac2 {
    public static void main(String[] args){

       
        int height;
        int i,j;
        Scanner sc = new Scanner(System.in);
         
        System.out.print("height = ");
        height = sc.nextInt();
         
        for(i = 0; i <= height*2-1; i++){
           
            for( j = 0; j <= height-1; j++) {
                if(i==height+j-1||i==height-j-1)
            System.out.print("* ");
        else
            System.out.print("  ");
            }
            System.out.println(" * ");
        }
        
         
        }
    
    
}
