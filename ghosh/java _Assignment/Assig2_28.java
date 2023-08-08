import java.util.Scanner;
 public class Assig2_28{
    public static void main(String[]args){
        System.out.println("Enter your four numbers a,b , c and d values");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a>b){
                if(a>c && a>d){
                        System.out.println("your greatest value is:"+a);
                }
               else{ 
                   if(c>d){
                        System.out.println("your greatest value is:"+c);
                    }
                  else
                    System.out.println("your greatest value is:"+d);
               }
          
        } 
        else if(b>c){
                  if(b>d){
                        System.out.println("your greatest value is:"+b);
                    }
                  else
                    System.out.println("your greatest value is:"+d);
                     
        }
        
        else if(c>d)
              System.out.println("your greatest value is:"+c);
          else
              System.out.println("your greatest value is:"+d);
                     
        
        
        }
        
}          
          
      
