import java.util.Scanner;
public class Assig2_6{
    public static void main(String[]args){
        System.out.println("Enter a number to find absoulte value");
        Scanner sc=new Scanner(System.in);
        float abs=sc.nextFloat();
        if (abs>0)
               System.out.println("absoulte value is :"+abs);
        else{
               abs=abs*(-1);
               System.out.println("absoulte value is :"+abs);}
          
    }
}
