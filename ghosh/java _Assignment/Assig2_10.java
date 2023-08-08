import java.util.Scanner;
public class Assig2_10{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a year to check leaop year");
        int l=sc.nextInt();
        if (l%100==0){
             if(l%400==0)
                 System.out.println("year is a leap year");
             else
                 System.out.println("year is  not a leap year"); 
                 }
        else if(l%4==0)
               System.out.println("year is a leap year");
        else
           System.out.println("year is not a leap year");         
    }
}
