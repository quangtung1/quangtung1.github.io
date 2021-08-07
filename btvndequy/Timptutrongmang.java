package Baitapdequy.btvndequy;

public class Timptutrongmang {
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 5, 3, 4 };
        System.out.println(find(a, 5,0));

    }

    public static int find(int[] a, int x,int i) {
        int n=a.length-1;

        if (i > n) {
            return -1;
        }
        if (a[i] == x) {
            return i;
        }
        
        return find(a, x, i + 1);

    }
}
