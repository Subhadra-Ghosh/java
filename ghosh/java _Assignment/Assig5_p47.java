import java.util.Scanner;
public class Assig5_p47{
 public static void main(String[]args){
    
    for( int i=5;i>=1;i--){
      for( int j=1;j<i;j++){
         
         System.out.print(" ");
        }
      for(int j=5;j>=i;j--){
         if((i==3 && j==4 )|| (i==2 && (j==4 || j==3)))
           System.out.print("*");
         else
             System.out.print("1");
      
      } 
      System.out.println("");
      
    }
    
 
 
 }



}
