/*
1
222
33333
4444444
555555555
*/
import java.util.Scanner;
class Triangle{
    public static void  oddTriangle(int r){
       System.out.println("pattern is :");
       int s=1;
       for(int   i=1;i<=r;i++){
         for(int  j=1;j<=s;j++){
                 System.out.print(i);    
         }
         s+=2;
         System.out.println();
       }
    }
}
class TestMain_p29{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the row number ");
         int r=sc.nextInt();
        Triangle.oddTriangle(r);
   }   
}
