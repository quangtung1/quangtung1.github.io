package BinarySearch.btvnbs;

import java.util.Arrays;

public class sapxep {
    public static void main(String[] args) {

        int n[]={0,1,2,3,4,5,6,7};
        String []a={"An","Việt Anh","Tùng","Long","Sơn","Trung","Khoa","Phú"};
        Arrays.sort(a);
        //Tìm kiếm theo stt
        int v=search1(n, 0, 0, n.length-1);
        System.out.println("Tên bạn cần tìm là:"+a[v]);
        //Tìm kiếm theo tên
        System.out.println(search(a, "Tùng", 0, a.length-1));
    }
    public static int search(String []a,String x,int l,int r){
       
        if (l>r){return -1;} 
            
       // System.out.println("["+l+"-"+r+"]");
        int mid=(l+r)/2;
        if (x.equals(a[mid])) {
            return mid;
        }else if(x.compareTo(a[mid])>0){
            return search(a, x, mid+1, r);
        }else {
            return search(a, x, l, mid-1);
        }

    }
    public static int search1(int []a,int x,int l,int r){
       
        if (l>r){return -1;} 
            
       
        int mid=(l+r)/2;
        if (a[mid]==x) {
            return mid;
        }else if(a[mid]<x){
            return search1(a, x, mid+1, r);
        }else {
            return search1(a, x, l, mid-1);
        }

    }
}
