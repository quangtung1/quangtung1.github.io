package Baitap.BTVn;

public class _485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] == 1) {
               count=count+1;
               max= Math.max(count,max);
             
            }else if (nums[i] ==0){
              
                count=0;
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int []a = {1,1,1,0,1,1,0,1,0};
System.out.println(findMaxConsecutiveOnes(a));
    }
}
