/*WAP to print Square, Cube and Square Root of all numbers from 1 to N*/
import java.util.Scanner; 
public class Assig5_60{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in); 
         System.out.println("enter the value of n");
          int n=sc.nextInt();  
          
          int i,square=0,cube=0;
          double sqr_root=0;           
          for( i=1;i<=n;i++){ 
              square=i*i;
              cube=i*i*i;
              sqr_root=Math.sqrt(i);                                                           
           System.out.println("square of "+i+" is "+square);                   
           System.out.println("cube of "+i+" is "+cube);            
           System.out.println("square root of "+i+" is "+sqr_root);            
      }
    }        
}          
          
      
