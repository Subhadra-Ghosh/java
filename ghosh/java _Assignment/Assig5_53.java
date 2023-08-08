/*PWAP to print all the strong numbers between two entered numbers*/
import java.util.Scanner; 
public class Assig5_53{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in); 
         System.out.println("enter the value of a");
          int a=sc.nextInt();  
          System.out.println("enter the value of b");
          int b=sc.nextInt(); 
          int sum,j,rem,i,n,p;           
          for( i=a,n=0;i<=b;i++){ 
              n=i;
              p=n;
              sum=0;
              while(n!=0){
                int fact=1;
                rem=n%10;
                for( j=1;j<=rem;j++){
                  fact=fact*j;
                  }             
               sum=sum+fact;               
               n=n/10; 
               } 
                                           
              if(sum==p)
                 System.out.println("strong numbers :"+p);                   
          }    
             
      
    }        
}          
          
      
