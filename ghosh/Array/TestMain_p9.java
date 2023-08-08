/*
1
12
123
1234
12345
*/
import java.util.Scanner;
class Triangle{
    public static void  righttriangle(int r){
       System.out.println("pattern is :");
       for(int  i=1;i<=r;i++){
         for(int j=1;j<=i;j++){
            System.out.print(j);
         }
         System.out.println();
       }
    }
}
class TestMain_p9{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the row number ");
         int r=sc.nextInt();
        Triangle.righttriangle(r);
   }   
}
