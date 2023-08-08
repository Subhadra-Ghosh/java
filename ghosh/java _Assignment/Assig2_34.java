import java.util.Scanner;
public class Assig2_34{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a  side1 of triangle ");
        int side1=sc.nextInt();
        System.out.println("Enter a  side2 of triangle");
        int side2=sc.nextInt();
        System.out.println("Enter a  side3 of triangle");
        int side3=sc.nextInt();
        if(side1==side2 && side2==side3 && side1==side3)
             System.out.println("your triangle is equliteral ");
        if((side1==side2 && side2!=side3) ||  (side1==side3 && side1!=side2))
             System.out.println("your triangle is isosceles");
        if(side1!=side2 && side2!=side3 && side1!=side3)
             System.out.println("your triangle is scalene ");
    
    
    
    
    }    
        
}
