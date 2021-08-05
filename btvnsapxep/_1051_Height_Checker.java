package Baitapsapxep.btvnsapxep;

import java.util.Arrays;

public class _1051_Height_Checker {
    public static int heightChecker(int[] heights) {
        int[] clone = new int[heights.length];
        for (int i = 0; i < clone.length; i++) {
            clone[i] = heights[i];
        }

        Arrays.sort(clone);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != clone[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 5, 1, 2, 3, 4 };
        System.out.println(heightChecker(a));

    }
}
