import java.util.Scanner;
class Mathopration{
   public void multiply(int a,int b){
     int c=a*b;
     System.out.println("Integer value product : "+c);
   }
   public void multiply(float a,float b,float c){
     float d=a*b*c;
     System.out.println("float value product : "+d);
   }
   public void multiply(int arr[]){
    int product=1;
     for(int i=0;i<arr.length;i++){
       product=product*arr[i];
     }
     System.out.println("Array elements Product is : "+product);
   }
   public void multiply(double a,int b){
    double c=a*b;
    System.out.println("double and integer product is : "+c);
   }
}
class TestMain{
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   Mathopration obj = new Mathopration();  
   obj.multiply(4,5);
   obj.multiply(4.2f,5.8f,6.3f);
   obj.multiply(new int[]{5,5,4,1,2,2});
   obj.multiply(4.89,5);
  
  }
} 
