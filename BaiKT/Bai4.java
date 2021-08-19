package BaiKT;

public class Bai4 {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int resum =0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            
        }
        for (int i = 0; i < nums.length; i++) {
           sum-=nums[i];
           
            if (sum==resum) {
                return i;
            }
            resum+=nums[i];

        }
        return -1;
    }
    public static void main(String[] args) {
        int []nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
