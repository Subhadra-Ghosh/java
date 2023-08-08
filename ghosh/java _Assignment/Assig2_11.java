import java.util.Scanner;
public class Assig2_11{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your age ");
        int age=sc.nextInt();
        System.out.println("Enter your gender ");
        char gender=sc.next().charAt(0);
        System.out.println("Enter your marital status Yes/No");
        char marry=sc.next().charAt(0);
        if (gender=='m' && age>20 && age<40)
               System.out.println("he is work in anywhere");
        else if(gender=='m' && age>40 && age<60)
               System.out.println("he is work  only  in urbn areas");
        else if (gender=='f')
              System.out.println("she is work  only  in urbn areas"); 
        else
              System.out.println("ERROR");                      
    }
}
