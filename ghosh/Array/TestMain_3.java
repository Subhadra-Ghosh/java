/*waP to find out the sum of N natural number.*/
import java.util.Scanner;
 class NaturalNumber{
    public void sum(int n){
       System.out.println(" N natural number are :");
       int sum=0;
       for(int i=1;i<=n;i++){
          sum+=i;
       } 
      System.out.println(n+" natural number sum is :"+sum);       
    }
}
 class TestMain_3{   
      public static void main(String[] args) {
         NaturalNumber  obj=new NaturalNumber();
         obj.sum(10);    
   }   
}
