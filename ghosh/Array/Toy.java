/*
Q.10 create a class Toy having variable toyname ,price,and static variable "madein" .
create no arg and parameterized constructor to initialize class variables .
Define static function static display and non static method display
--display() print class non static variable
--static display print static variable
create another class Electronic Toy which h
*/
import java.util.Scanner;
public class Toy{
   Scanner sc=new Scanner(System.in);
   String toyname;
   int price;
   static String madein;
    Toy(String toyname,int price,String madein){
        this.toyname=toyname;
        this.price=price;
        this.madein=madein;
    }
   static void display(){
     System.out.println("toy made country is : "+madein);
   }
   void  display(){
      System.out.println("Toyname is : "+toyname);
      System.out.println(" price is : "+price);
   }
   }
  
   public class Main{
       public static void main(String[]args){
           System.out.println("Enter your toy name");
           toyname=sc.nextLine();
           System.out.println("Enter your toy price");
           price=sc.nextInt();
           System.out.println("Enter your toy made country");
           madein=sc.nextLine();
           Toy obj=new Toy();
           obj.display();
           Toy.display();
   }
   }
}
