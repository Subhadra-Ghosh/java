import java.util.Scanner;
public class Assig2_12{
    public static void main(String[]args){
        int temp=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        while(number!=0){
        int  remainder =number%10;
        temp=temp*10+remainder;
        number=number/10;
        }
        System.out.println("reverse number is:"+temp);
    }    
        
}
