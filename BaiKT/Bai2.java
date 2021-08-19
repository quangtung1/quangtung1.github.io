package BaiKT;

public class Bai2 {
    public static int minOperations(String[] logs) {
        int count=0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("./")) {
                continue;
            } else if (logs[i].equals("../")){
                if(count>0){
                    count--;
                }
            }else{
                count++;
            }
        } return count;
    }
    public static void main(String[] args) {
        String []logs = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));
        
    }
}