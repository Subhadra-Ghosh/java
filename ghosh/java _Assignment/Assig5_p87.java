import java.util.Scanner;
public class Assig5_p87{
  public static void main(String[] args){
   
    int s=1;
    for( int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                 System.out.print("*");
            }
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--){
                System.out.print("*");
            }
    s=s+2;
    System.out.println();
      
   }
  int p=9;
    for( int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                 System.out.print("*");
            }
            for(int j=1;j<=p;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
     p=p-2;       
    System.out.println();
      
   }
  
  
  }

}                                                
