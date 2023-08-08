import java.util.Scanner;
public class Assig2_44{
    public static void main(String[]args){
        int temp=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your choice for opration perform");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println("Addition..."+(a+b));
                break;
            case '>':
                if(a>b)
                  System.out.println("a is greater");
                else
                   System.out.println("abis greater");
                break;   
            case '=':
                 if(a==b)
                    System.out.println(" a is equal to b");
                 else
                    System.out.println(" a is not equal to b");
                 break;
            
    
          }
    
    
    }    
        
}
