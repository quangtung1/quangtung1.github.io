package Btcuoiki;

import java.util.Arrays;
import java.util.HashMap;

public class _506_Relative_Ranks {
    public static String[] findRelativeRanks(int[] score) {
        int[] temp = score.clone();
        Arrays.sort(temp);
        HashMap<Integer, String> ranks = new HashMap<Integer, String>();
        int len=score.length;
        
        for (int i = len-1; i >= 0; i--) {
           if (i==len-1) {
               ranks.put(temp[i],"Gold Medal");
           }else if(i==len-2) {
            ranks.put(temp[i],"Silver Medal");
           }else if(i==len-3){
               ranks.put(temp[i],"Bronze Medal");	
           }else{
               ranks.put(temp[i],String.valueOf(len-i));
           }
        }
        String []kq=new String[len];
        for (int i = 0; i < len; i++) {
            kq[i]= ranks.get(score[i]);
        }
        return kq;
    }
    public static void main(String[] args) {
        int []score={5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
