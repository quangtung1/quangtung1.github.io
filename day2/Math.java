package day2;
public class Math {
    public boolean isOdd(int x) {
        return x % 2 != 0;
      }
      public boolean isEven(int x) {
          return x % 2 ==0;
      }
    
      public  float calculateBMI(float height, float weight) {
        return weight/(height*height);
      }
    
      public float circle_perimeter(float diameter) {
        return diameter*3.14f;  
      }
    
      public boolean isTriangle(float x, float y, float z) {
          
          
        return (x+y>z) && (y+z>x) && (x+z>y);
      }
      public float smallestIn3Numbers(float x, float y){
          return (x<y)?x:y;
      }
    
      public  float smallestIn3Numbers(float x, float y, float z) {
          
        return smallestIn3Numbers(smallestIn3Numbers(x,y),z);}
      public float sum(int[] numbers) {
        float sum=0f;
        for(int i=0; i<numbers.length;i++){
            sum = sum + numbers[i];
        
            }
            return sum;
      }
    
      public float average(int[] numbers) {
        float average=0f;

        for(int i=0; i<numbers.length;i++){
            
            average = (average + numbers[i]);
        }
        return average/numbers.length;
      }
    
      public int[] reverseArray(int[] numbers) {
        
       return null;
      }
      public int countOddNumbers(int[] numbers) {
          int dem=0;
          for (int i = 0; i<numbers.length;i++){
              if(numbers[i] %2!=0){
                  dem=dem+1;
              }
              
          }
          return dem;
            
      }
      public int[] oddNumbersArray(int[] numbers){ 
int dem=0;
for (int i = 0; i<numbers.length;i++){
  if(numbers[i] %2!=0){
      dem=dem+1;
  }

}
int[] n=new int[dem];
int t=0;
for(int i=0; i<numbers.length;i++){
  if(numbers[i] %2!=0){
    n[t++]=numbers[i];
  }
}
return n;
      }
     
        public float bmiRating( float height, float weight){
          
          float BMI=weight/(height*height);
          if(BMI<18.5){
            System.out.println(" Nhẹ cân");
          }
          if ((BMI>15.5)&&(BMI<24.9)) {
            System.out.println("Bình Thường");
            
          }
          if((BMI>25.0)&&(BMI<29.9)){
System.out.println("Quá cân");
          }
          if(BMI>30.0){
            System.out.println("Quá nguy hiểm");
          }
          return BMI;
        }
}
