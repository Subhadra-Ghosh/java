/*
x
xx
xxx
xxxx
xxx
xx
x
*/


import java.util.Scanner;
public class Assig5_137{
  public static void main(String[] args){
    for( int i=1;i<=4;i++){
      for(int j=1;j<=i;j++){
         System.out.print("X");
      }
      System.out.println();  
    }
   for( int i=1;i<=3;i++){
     for(int j=3;j>=i;j--){
       System.out.print("X");
     }
     System.out.println();
   }
  }


}                                                
