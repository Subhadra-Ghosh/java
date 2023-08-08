/*
*           *
  *       *
    *   *
      *
    *   *
  *       *
*           *
  */         
import java.util.Scanner;
public class Assig5_p90{
  public static void main(String[] args){
    int s=5,p=1;
    for( int i=1;i<=4;i++){
          for(int j=1 ;j<=i;j++){
              System.out.print(" ");
             }
         System.out.print("*");
         for(int k=s;k>=1;k--){
             System.out.print(" ");
             }
         if(s!=-1) {   
           System.out.print("*");
           }
         s=s-2;
         System.out.println(); 
     }        
     for(int i=1;i<=3;i++){
          for(int j=3;j>=i;j--){     
             System.out.print(" ");
             }
           System.out.print("*");
           for(int j=1;j<=p;j++){
              System.out.print(" ");
             }
      System.out.print("*");       
      p=p+2;
      System.out.println();
     }
 
  }
}    

