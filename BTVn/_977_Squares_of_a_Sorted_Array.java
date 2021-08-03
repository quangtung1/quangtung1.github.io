package Baitap.BTVn;

import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array{
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int []a={-4,-1,0,2,4,5};
        System.out.println(sortedSquares(a));

    }
}