import java.util.Scanner;
public class Assig5_87{
  public static void main(String []args){
      for( int i=1;i<=5;i++){
           for( int j=1;j<=i;j++){
             if((i==3 && j==2) || (i==4 && j==2) || (i==4 && j==3))
                System.out.print("  ");
             else if((j==4 )|| (j==2 && i==2)|| (j==2 && i==5))
                System.out.print(" 0");   
             else
                System.out.print(" 1");
           
           
           
           }
      
           System.out.println(" ");
      
      
      }
  
  
  
  } 
   
   
   
   
   
}
