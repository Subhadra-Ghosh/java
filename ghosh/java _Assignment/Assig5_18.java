import java.util.Scanner;
public class Assig5_18{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);  
         System.out.println("enter value n");
        
         int n=sc.nextInt();       
         int a=1,b=2,sum,j,c;
          System.out.print(a);
          System.out.print(" "+b);           
          for(int i=1;i<=(n-2);i++){ 
          c=a*b;
          System.out.print(" "+c);   
           a=b;
           b=c;                   
          }       
       
    }        
}          
          
      
