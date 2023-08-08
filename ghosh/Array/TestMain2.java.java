
import java.util.Scanner;
class Test{
    public double sales(double sales){
      double totalsales=0;
      if(sales>10000){
        System.out.println(" Eligible for 20% bonus");
        double bonus=(sales*20)/100;
        totalsales=sales+bonus;
      }
      else{
      totalsales=sales;
      
      }
      return totalsales;
    }  
}
class TestMain2{   
      public static void main(String[] args) {          
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your sales");
         double sales=sc.nextInt();
         Test obj=new Test();
         double totalsales=obj.sales(sales);
         System.out.println(" Total sales is : "+ totalsales);
        }
        
   }   

