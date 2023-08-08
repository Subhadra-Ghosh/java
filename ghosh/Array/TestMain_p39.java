/*
123456
54321
1234
321
12
1
*/
import java.util.Scanner;
class Triangle{
    public static void  reverseTriangle(int r){
       System.out.println("pattern is :");
       for( int i=r;i>=1;i--){
            int n=i;
            int p=i;
            for( int j=1;j<=i;j++){       
                 if(n%2==1){
                     System.out.print(p);
                     p--;
                 }       
                 else
                     System.out.print(j);     
       }
      System.out.println("");   
      } 
    }
}
class TestMain_p39{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the row number ");
         int r=sc.nextInt();
        Triangle.reverseTriangle(r);
   }   
}
