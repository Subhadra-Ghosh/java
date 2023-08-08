/*
_______________
|*           *|
|  *       *  | 
|   *   *     |
|     *       |
|   *   *     |
|  *      *   |
|*          * |
--------------
  */         
import java.util.Scanner;
public class Assig5_141a{
  public static void main(String[] args){
    int s=5,p=1;
    System.out.println("_________");
    for( int i=0;i<4;i++){
          System.out.print("|");
          for(int j=1 ;j<=i;j++){
              System.out.print(" ");
             }
         System.out.print("\\");
         for(int k=s;k>=1;k--){
             System.out.print(" ");
             }
         if(s!=-1) {   
           System.out.print("/");
           }
         for(int j=1 ;j<=i;j++){
              System.out.print(" ");
             }  
         s=s-2;
         System.out.print("|");
         System.out.println(); 
     }        
     for(int i=0;i<3;i++){
          System.out.print("|");
          for(int j=2;j>i;j--){     
             System.out.print(" ");
             }
           System.out.print("/");
           for(int j=1;j<=p;j++){
              System.out.print(" ");
             }
      System.out.print("\\");  
      for(int j=2;j>i;j--){     
             System.out.print(" ");
             }     
      p=p+2;
      System.out.print("|");
      System.out.println();
     }
     System.out.println("---------");
 
  }
}    

