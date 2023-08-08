/*
Q 9 Write a program by creating an 'Employee' class having the following methods and print
the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as
parameter
2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000.
3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work per day
is more than 6 hours.
*/
import java.util.Scanner;
public class Employee{
   int classSalary=0;
   void getInfo(int salary,float hours){
       classSalary=salary;
       System.out.println("salary : "+salary);
       System.out.println("work hours : "+hours);
   
   }
   void Addsal(){
    System.out.println("your salary is less than 50000 so add 10000 in your salary");
    System.out.println("After adding 10000 salary is : "+(classSalary+10000));
   }
   void Addwork(){
      System.out.println("your work hours are greater than 6 so add 5000 in your salary ");
      System.out.println("After adding 5000 salary is : "+(classSalary+5000));
   }
   public static void main(String args[]){
    Employee obj= new Employee();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your salary");
    int salary=sc.nextInt();
    System.out.println("Enter your work hours of per day");
    float hours=sc.nextFloat();
    obj.getInfo(salary,hours);
    if(salary<50000)
       obj.Addsal();
    if(hours>6)
        obj.Addwork();   
   }
}
