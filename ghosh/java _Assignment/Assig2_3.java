import java.util.Scanner;
public class Assig2_3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary=sc.nextInt();
        System.out.println("Enter your year of service");
        int year=sc.nextInt();
        if(year>5){
           float bonus=salary*5/100;
            System.out.println("your total salary after 5% bonus is :"+(salary+bonus));
         }   
        else
            System.out.println("your salary without any bonus is: "+(salary));     
    }
}
