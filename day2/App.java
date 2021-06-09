package day2;

public class App {
    public static void main(String[] args){
        System.out.println("Chào các bạn lớp Java 4");
        Math math = new Math();
        int a=6;
       System.out.println(math.isOdd(a)); 
       float weight= 60f;
       float height =1.58f;
       System.out.println("Chỉ số BMI của tôi" + math.calculateBMI(height, weight));
       float diameter=4f;
       System.out.println("Chu vi hinh tron là:" + math.circle_perimeter(diameter));
       float x=6f;
       float y=7f;
       float z=9f;
       if(math.isTriangle(x, y, z)){
        System.out.println("Hinh tren la tam giac" );
       }
       else{
        System.out.println("Hinh tren k la tam giac" );
       }
       
       System.out.println("So nho nhat:" + math.smallestIn3Numbers(x, y, z));
      
      int[] id= new int[] {1,2,4,5};
        System.out.println("Tong day so la:" + math.sum(id));
        System.out.println("Trung binh cộng của dãy là:" + math.average(id));
        System.out.println("So le co trong day la:" +math.countOddNumbers(id));
        System.out.println("Dãy số lẻ trong dãy là: " + math.oddNumbersArray(id));
        System.out.println(math.bmiRating(1.7f, 60f));
     
    }
}
