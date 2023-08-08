/*
A
AB
A C
A  D
ABCDE
*/
import java.util.Scanner;
class Triangle{
    public static void  Alphabettriangle(){
       System.out.println("pattern is :");
       for(char  i=65;i<=69;i++){
         for(char j=65;j<=i;j++){
            if((i==67 && j==66) || (i==68 && (j==66 || j==67)))
                 System.out.print(" ");
             else
                 System.out.print(j);    
         }
         System.out.println();
       }
    }
}
class TestMain_p22{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the row number ");
         int r=sc.nextInt();
        Triangle.Alphabettriangle();
   }   
}
