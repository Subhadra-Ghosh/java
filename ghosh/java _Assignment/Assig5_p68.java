import java.util.Scanner;
public class Assig5_p68{
 public static void main(String[]args){
   int s=1;
   for( int i=1;i<=5;i++){
      for(int j=5;j>i;j--){
        System.out.print(" ");
      }
      for(int k=1;k<=s;k++){
        if(i==k)
             System.out.print("#");
        else
            System.out.print("*");
      }
    s+=2;
    System.out.println("");  
   }
 
  
 }

}
