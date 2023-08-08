/*WAP to print N natural number.*/ 
import java.util.Scanner;
 class NaturalNumber{
    public void natural(int n){
       System.out.println(" N natural number are :");
       for(int i=1;i<=n;i++){
          System.out.println(i);
       }        
    }
}
 public class TestMain_2{   
      public static void main(String[] args) {
         NaturalNumber  obj=new NaturalNumber();
         obj.natural(10);    
   }   
}
