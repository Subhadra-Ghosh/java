import java.util.Scanner;
public class Assig5_p70a{
 public static void main(String[]args){ 
   int s=9; 
   for( int i=1;i<=5;i++){
      for(int j=1;j<i;j++){
        System.out.print(" ");
      }
      for(int k=s;k>=1;k--){
      if(k%2==0)
         System.out.print(" ");
      else
         System.out.print("*");
      }
      s-=2;
    System.out.println();  
   }
  
 }

}
