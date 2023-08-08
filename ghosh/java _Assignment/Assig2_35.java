import java.util.Scanner;
public class Assig2_35{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your charactor ");
        char ch=sc.next().charAt(0);
        if (65<=ch && ch<=90 || 97<=ch && ch<=122)
               System.out.println(" your charator is alphabet");
        else
               System.out.println(" your charator is  symbol");  
    }
}
