import java.util.Scanner;
public class Assig5_p66{
 public static void main(String[]args){
   int s=1;
   for( int i=1;i<=5;i++){
      for(int j=5;j>i;j--){ 
        System.out.print(" ");
      }
      for(int k=1;k<=s;k++){
        if((i==2 && k==2) || (i==3 && (k==2 || k==3 ||k==4)) || (i==4 && (k==2 || k==3 || k==4 || k==5 || k==6)))
             System.out.print("*");
        else
            System.out.print("1");
      }
    s+=2;
    System.out.println("");  
   }
 
 
 }





}
