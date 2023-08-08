import java.util.Scanner;
public class Assig2_4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        if(marks>80)
            System.out.println("your grade is :A");
        else if(60<marks && marks<=80)
            System.out.println("your grade is :B"); 
       else if(50<marks && marks<=60)
            System.out.println("your grade is :C"); 
        else if(45<marks && marks<=50)
            System.out.println("your grade is :D"); 
        else if(25<marks && marks<=45)
            System.out.println("your grade is :E");     
        else if(25 < marks)
            System.out.println("your grade is :F");     
     }       
}     
