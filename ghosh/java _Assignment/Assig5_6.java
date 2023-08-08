import java.util.Scanner;
public class Assig5_6{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the value of n");
          int n=sc.nextInt();
          int i;
          System.out.println("factors are : ");
          for(i=1;i<=n/2;i++){
            if(n%i==0)
              System.out.println(i);
          
          
          }
       
      
    }
        
}          
          
      
