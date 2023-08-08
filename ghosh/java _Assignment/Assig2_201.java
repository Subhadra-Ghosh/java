import java.util.Scanner;
public class Assig2_201{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter first number to exchange ");
        int a=sc.nextInt();
        System.out.println("Enter second number to exchange ");
        int b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping a="+a);
        System.out.println("after swapping  b="+b);
    
    }    
        
}
