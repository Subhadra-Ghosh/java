import java.util.Scanner;
  public class Assig5_46{
     public static void main(String[]args){  
          Scanner sc=new Scanner (System.in);
          System.out.println("enter the value of n");
          int n=sc.nextInt();
          int last=0,first,sum, rem=0;
           while(n!=0){
              int rem1=n%10;
              last=rem1;
              break;
           }
           n=n/10;
           while(n!=0){
              rem=n%10;
               n=n/10;
                  }
          first=rem;
          sum=first+last;
          System.out.println(sum);
     
     
     }
  
  
  
  
  
  
  
  }
  
