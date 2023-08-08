/*

*/
import java.util.Scanner;
public class Assig5_139{
  public static void main(String[] args){
    for( int i=1;i<=4;i++){
      for(int j=4;j>=i;j--){
         System.out.print(" ");
         }
      for(int k=1;k<=i;k++){
         System.out.print(k);
         }   
      System.out.println();  
    }
   for( int i=3;i>=1;i--){
      for(int j=3;j>=i-1;j--){
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){
        System.out.print(k);
      }
     System.out.println();
   }
  }


}                                                
