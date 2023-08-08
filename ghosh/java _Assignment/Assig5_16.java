import java.util.Scanner;
public class Assig5_16{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the value of n");
          int n=sc.nextInt();
          int i;
         System.out.println("series is : ");
          for(i=(-n/2);i<=n/2;i++){
              int  p=3*i;
              System.out.print(" "+p);
  
          }
           System.out.println("");
  }
        
}          
          
      
