package BaiKT;

public class Bai3 {
    public static boolean isHappy(int n) {
        
            int k=0;
            while(n>0){
                k=k+(n%10)*(n%10);
                n=n/10;
                if (n==0&&k>4) {
                    n=k;
                    k=0;
                }
            }
            return k==1;
        
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
