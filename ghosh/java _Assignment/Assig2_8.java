import java.util.Scanner;
public class Assig2_8{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your medical cause Yes /No ");
        char cause=sc.next().charAt(0);
        if (cause=='y')
               System.out.println("you are  allowed to attend exam");
        else
               System.out.println("you are not  allowed to attend exam");  
    }
}
