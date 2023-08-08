import java.util.Scanner;
public class Assig5_p65{
 public static void main(String[]args){
   for( int i=1;i<=5;i++){
      for(int j=5;j>i;j--){
        System.out.print(" ");
      }
      int power=1;
      for(int k=1;k<i;k++){
         power=power*11; 
      }
    System.out.print(" "+power);  
    System.out.println("");  
   }
 }
}
