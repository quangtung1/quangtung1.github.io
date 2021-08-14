package Sapxep2;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int []a={6,7,8,5,4,1,2,3};
        long end,start,resutl;
        start=System.nanoTime();
        quicksort(a, 0, a.length-1);
        end=System.nanoTime();
        resutl=end-start;
        System.out.println("Quick sort: " + resutl);
        start=System.nanoTime();
        mergeSort(a, 0, a.length-1);
        end=System.nanoTime();
        resutl=end-start;
        System.out.println("Merge sort: " + resutl);
        start=System.nanoTime();
        sapxepchen(a);
        end=System.nanoTime();
        resutl=end-start;
        System.out.println("Sắp xếp chèn: " + resutl);
        start=System.nanoTime();
        sapxepchon(a);
        end=System.nanoTime();
        resutl=end-start;
        System.out.println("Sắp xếp chọn: " + resutl);
        start=System.nanoTime();
        sapxepnoibot(a);
        end=System.nanoTime();
        resutl=end-start;
        System.out.println("Sắp xếp nổi bọt: " + resutl);


        
        
    }
    public static void sapxepnoibot(int []a){
        int n=a.length;
         for (int i = 0; i < n; i++) {
             boolean check=true;
             for (int j = 0; j <n-1; j++) {
                 if (a[j]>a[j+1]) {
                     check=false;
                    int tg=a[j];
                     a[j]=a[j+1];
                     a[j+1]=tg;
                 }
             }
             
            //print(i, a);
            if (check==true) {
                break;
            }
         }
 
     }
    public static void sapxepchon(int []a){
        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++){
                if (a[i]>a[j]) {
                    int tg =a[j];
                    a[j]=a[i];
                    a[i]=tg;
                }
            }
          // System.out.print(a[i]+" ");
         // print(i, a);
        }}
    public static void sapxepchen(int []a){
        for (int i = 0; i < a.length; i++) {
            int ai=a[i];
            int j=i-1;
            while(j>=0 && a[j]>ai){
                a[j+1]=a[j];
                j--;

            }
            a[j+1]=ai;
            
            
           // System.out.print(a[i]+"\t");
          // print(i, a);
        }

    }
   public static void quicksort(int []a,int l,int r){
        if (l>=r) {return;}
        
        int key=a[(l+r)/2];
        int k= partition(a, l, r, key);
        quicksort(a, l, k-1);
        quicksort(a, k, r);
    }
    public static int partition(int []a,int l,int r,int key){
        while (l<=r) {
            while (a[l]<key) {l++;}
            
            while (a[r]>key){ r--;}
            
            if (l<=r) {
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;r--;
            }
        }
        return l;
    }
    public static int[] mergeSort(int[] a, int l, int r) {
        if (l > r)
            return new int[0];
        if (l == r) {
            int[] single = { a[l] };
            return single;
        }
        //System.out.println("Chia " + l + " - " + r);
        int mid = (l + r) / 2;
        int[] a1 = mergeSort(a, l, mid);
        int[] a2 = mergeSort(a, mid + 1, r);

        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] < a2[i2]) {
                    result[i] = a1[i1];
                    i1++;
                    i++;
                } else {
                    result[i] = a2[i2];
                    i2++;
                    i++;
                }
            } else {
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i1++;
                    i++;
                } else {
                    result[i] = a2[i2];
                    i2++;
                    i++;
                }
            }
        }
        //System.out.println("Kết quả: " + Arrays.toString(result));
        return result;

    }
}
