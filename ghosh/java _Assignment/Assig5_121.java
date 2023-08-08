import java.util.Scanner;
public class Assig5_121{
 public static void main(String[]args){
   int s=1;
   for( int i=1;i<=5;i++){
      for(int j=5;j>i;j--){
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){
        if((i==3 && k==2) || (i==4 && (k==2 || k==3)))
          System.out.print("_ ");
        else
          System.out.print("X ");
      }
   
    System.out.println("");  
   }
 
 
 }





}
