package Baitap.BTVn;

public class _26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int i = 0; // last processed item
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i+1 ;
        

    }
    public static void main(String[] args) {
        int i=0;
        int []nums ={1,1,1,1,2,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        
    }
}
