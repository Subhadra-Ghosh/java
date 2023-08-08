/*
ABCDE
 A__D
  A_C
   AB
    A
*/
import java.util.Scanner;
class Triangle{
    public static void  reverseTriangle(int r){
       System.out.println("pattern is :");
       for(char i=69;i>=65;i--){
           for(char j=69;j>=i;j--){
               System.out.print(" ");
           }
           for(char k=65;k<=i;k++){
               if((i==68 && (k==66 || k==67)) || ( i==67 && k==66))
                   System.out.print("_");
               else
                   System.out.print(k);    
           }
          System.out.println(); 
      } 
    }
}
class TestMain_p54{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the row number ");
         int r=sc.nextInt();
         Triangle.reverseTriangle(r);
   }   
}
