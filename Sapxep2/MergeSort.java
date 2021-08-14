package Sapxep2;

import java.util.Arrays;

public class MergeSort {
    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);

    }

    public static void main(String[] args) {
        int []a={1,5,3,2,8,7,6,4};
       // int []b={2,4,6,8,10};
        System.out.println(Arrays.toString(sortArray(a)));

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