/*         
*/

import java.util.Scanner;
public class Assig5_p80{
  public static void main(String[] args){
    int s=1,p=5;
    for( int i=1;i<=4;i++){
      for(int j=4;j>i;j--){
      
         System.out.print(" ");
         }
      for(int k=1;k<=s;k++){
         if((i==2 && k==2) || (i==3 && (k==2 || k==4)) || (i==4 && (k==2||k==4||k==6) )        )
            System.out.print("-");
         else
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
          if((i==1 && (k==2 || k==4)) || (i==2 && k==2))
            System.out.print("-");
          else
            System.out.print("*");  
     }
     p=p-2;
     System.out.println();
   }
  }


}                                                
