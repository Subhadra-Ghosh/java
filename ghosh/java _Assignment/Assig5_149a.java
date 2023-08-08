import java.util.Scanner;
public class Assig5_149a{
  public static void main(String[] args){
    int s=1;
    for( int i=1;i<=6;i++){
      for(int j=6 ;j>i;j--){
      
         System.out.print(" ");
         }
      for(int k=1;k<=s;k++){
         if(k%2==1)
             System.out.print("1");
         else 
             System.out.print("0");
        
      }
      s=s+2;
      System.out.println();
      }
  }     
}
