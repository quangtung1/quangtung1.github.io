package Btcuoiki;

public class _896_Monotonic_Array {
    public static boolean isMonotonic(int[] nums) {
        boolean t=true;
        boolean g=true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>nums[i+1]) {
                t=false;
            }
            if (nums[i]<nums[i+1]) {
                g=false;
            }
        }
        return t || g;
    }
    public static void main(String[] args) {
        int [] nums={6,5,5,4};
        System.out.println(isMonotonic(nums));
    }
}
