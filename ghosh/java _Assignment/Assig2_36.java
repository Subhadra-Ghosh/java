import java.util.Scanner;
public class Assig2_36{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter all three angle of a triangle ");
        int  angleA=sc.nextInt();
        int  angleB=sc.nextInt();
        int  angleC=sc.nextInt();
        int  x=angleA+angleB+angleC;
        if (x==180)
               System.out.println(" your tringle is valid");
        else
               System.out.println(" your tringle is not valid");  
    }
}
