import java.util.Scanner;
public class Assig5_141{
  public static void main(String[] args){
    int s=1,p=5;
    for( int i=1;i<=4;i++){
      for(int j=4;j>i;j--){
      
         System.out.print(" ");
         }
      for(int k=1;k<=s;k++){
         System.out.print("*");
      }
      s=s+2;
    
      System.out.println();
      }
      //System.out.println();  
    
   for( int i=1;i<=3;i++){
     for(int j=1;j<=i;j++){
        
          System.out.print(" ");
          }
      for(int k=1;k<=p;k++){
          System.out.print("*");
     }
     p=p-2;
     System.out.println();
   }
  }


}                                                
