import java.util.Scanner;
 public class Assig5_28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a value");
        int n=sc.nextInt();
         for(int i=1;i<=n;i++){
           for( int j=1;j<=i;j++)
           {
             if(i==(5*j)){
               System.out.print("  HELLO");
              }
           } 
           if(i%5==0){
                continue;}
         System.out.print("  "+i);                                                                                                                        
         }
    
    
    
    
    }
 
 
 
 
 
 }
