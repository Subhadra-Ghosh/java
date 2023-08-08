import java.util.Scanner;
public class Assig2_37{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number ");
        int number=sc.nextInt();
        if (number%5==0 && number%11==0)
               System.out.println(" your number is divisible by 5 and 11 both");
        else
               System.out.println(" your number is  not divisible by 5 and11 both");  
    }
}
