import java.util.Scanner;
class Test{
   public int sum(int a,int b){
     int sum=0;
     for(int i=a;i<=b;i++){
        if(i%7==0){
           System.out.println(i);
        }
     }
     return sum;
   }  
}
class TestMain3a{   
      public static void main(String[] args) {          
         Scanner sc = new Scanner(System.in);
         Test obj=new Test();
         int sum=obj.sum(100,200);
         System.out.println(" Total sum is : "+ sum);
        }
}   

