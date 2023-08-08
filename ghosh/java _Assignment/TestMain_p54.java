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
           for(char j=69;j<=i;j--){
               System.out.println(" ");
           }
           for(char j=65;j<=i;j++){
               if((i==68 && (j==66 || j==67) || ( i==67 && j==66))
                   System.out.println(" ");
               else
                   System.out.println(j);    
           }
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
