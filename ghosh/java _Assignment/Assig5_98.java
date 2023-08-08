import java.util.Scanner;
public class Assig5_98{
 public static void main(String[]args){
    for( int i=6;i>=1;i--){
      int n=i;
      int p=i;
      for( int j=1;j<=i;j++){
        
        if(n%2==1){
          System.out.print(p);
          p--;
        }
        
        else
           System.out.print(j);
      
      }
      System.out.println("");
    
    }
    
 
 
 }



}
