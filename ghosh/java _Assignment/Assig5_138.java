/*
1
12
123
1234  
123
12
1
*/
import java.util.Scanner;
public class Assig5_138{
  public static void main(String[] args){
    for( int i=1;i<=4;i++){
      for(int j=1;j<=i;j++){
      if((i==3 && j==2) || (i==4 && (j==2 || j==3)))
         System.out.print(" ");
      }
      else
         System.out.print(j)
      System.out.println();  
    }
   for( int i=3;i>=1;i--){
     for(int j=1;j<=i;j++){
        if(i==3 && j==2)
          System.out.print(" ");
        else
          System.out.print(j);
     }
     System.out.println();
   }
  }


}                                                
