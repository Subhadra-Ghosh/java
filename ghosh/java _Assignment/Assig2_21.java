import java.util.Scanner;
 public class Assig2_21{
    public static void main(String[]args){
        System.out.println("Enter your three number a,b and c values");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
                if(a>c){
                        System.out.println("your greatest value is:"+a);
                }
               else{
                 System.out.println("your greatest value is:"+c);
    
               }
          
        } 
        else if(b>c){
                     System.out.println("your greatest value is:"+b);
        }
        
        else{
              System.out.println("your greatest value is:"+c);
    
        
        
        }
        
}          
          
      
