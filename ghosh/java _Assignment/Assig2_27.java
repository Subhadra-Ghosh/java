import java.util.Scanner;
public class Assig2_27{
    public static void main(String[]args){
        int temp=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a num1");
        int a=sc.nextInt();
         System.out.println("Enter a num2");
        int b=sc.nextInt();
        System.out.println("Enter a charactor");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println((a+b));
                break;
            case '-':
                System.out.println((a-b));
                break;   
            case '*':
                System.out.println((a*b));
                break;
            case '/':
                System.out.println((a/b));
                break;
            case '%':
                System.out.println((a%b));
            
    
          }
    
    
    }    
        
}
