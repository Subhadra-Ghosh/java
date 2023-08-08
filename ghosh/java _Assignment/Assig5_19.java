import java.util.Scanner;
public class Assig5_19{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);  
         System.out.println("enter value n");        
         int n=sc.nextInt();       
         double sum=0,i;                
         for (i=1;i<=n;i++){ 
          double p=(1/i);
          sum=sum+p;       
          }       
         System.out.println("sum is : "+sum);                        
    }        
}          
          
      
