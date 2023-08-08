import java.util.Scanner;
public class Assig5_49{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in); 
         System.out.println("enter the value of a");
          int a=sc.nextInt();  
          System.out.println("enter the value of b");
          int b=sc.nextInt(); 
          int sum,j;           
          for(int i=a;i<=b;i++){ 
              for( j=1,sum=0;j<=i/2;j++){
               if(i%j==0)
                 sum=sum+j;   
              } 
              if(sum==i)
                 System.out.println("perfect numbers :"+i);                     
          }       
        System.out.println("");   
    }        
}          
          
      
