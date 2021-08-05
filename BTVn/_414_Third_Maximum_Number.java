package Baitapsapxep.btvn;

import java.util.Arrays;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        if (j < 3) {
            return nums[j - 1];
        }
        return nums[j - 3];
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(thirdMax(a));
    }
}
