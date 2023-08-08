import java.util.Scanner;
public class Assig5_pattren2{
 public static void main(String[]args){
   int s=1;
   for( int i=1;i<=5;i++){
      for(int j=5;j>i;j--){
        System.out.print(" ");
      }
      for(int k=1;k<=s;k++){
        System.out.print(" *");
      }
    s=s+2;
    System.out.println("");  
   }
 
 
 }





}
