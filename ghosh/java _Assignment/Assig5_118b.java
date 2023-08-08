import java.util.Scanner;
public class Assig5_118b{
 public static void main(String[]args){
   int s=1;
   for( int i=1;i<=5;i++){
      for(int j=5;j>i;j--){
        System.out.print(" ");
      }
      for(int k=1;k<=s;k++){
        if((i==2 && k==2) || (i==3 && (k==2||k==4))  || (i==4 && (k==2 || k==4 || k==6)) || (i==5 && (k==2 || k==4 ||k==6 ||k==8)))
          System.out.print("-");
        else
          System.out.print("*");
      }
    s=s+2;
    System.out.println("");  
   }
 
 
 }





}
