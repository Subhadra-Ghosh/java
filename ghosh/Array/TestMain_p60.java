/*
    X 
   X X 
  X__X
 X____X
X X X X X
*/
import java.util.Scanner;
class Triangle{
    public static void  holoTriangle(int r){
       System.out.println("pattern is :");
       for(int i=1;i<=r;i++){
           for(int j=r;j>=i;j--){
               System.out.print(" ");
           }
           for(int  k=1;k<=i;k++){
               if((i==3 && k==2 ) || ( i==4 && (k==2 || k==3)))
                   System.out.print("  ");
               else
                   System.out.print(" X");    
           }
          System.out.println(); 
      } 
    }
}
class TestMain_p60{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the row number ");
         int r=sc.nextInt();
         Triangle.holoTriangle(r);
   }   
}
