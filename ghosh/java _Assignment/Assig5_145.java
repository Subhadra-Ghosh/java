import java.util.Scanner;
public class Assig5_145{
  public static void main(String[] args){
    int s=8;
    for( int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                 System.out.print("*");
            }
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
     s=s-2;       
    System.out.println();
      
   }
  
  }

}                                                
