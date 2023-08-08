import java.util.Scanner;
public class Assig2_9{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a charactor");
        char ch=sc.next().charAt(0);
        if (65<=ch  &&  ch<=90)
               System.out.println("you charactor is in upper case");
        else
               System.out.println("you charactor is in lower case");  
    }
}
