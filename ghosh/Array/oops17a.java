import java.util.Scanner;
class Employee{
   private int empNo,salary;
   private static int totalsalary;
   private static int emp=0;
   public Employee(int salary){
     this.empNo=emp++; 
     this.salary=salary;
     totalsalary+=salary;
   }
   public Employee(){
   }
   public void display(){
     System.out.println("Employee  : "+(empNo+1)+" 'salary  : "+salary);
   }
   public static void displayTS(){
     System.out.println("Total salary is : "+totalsalary);
   }  
   public static void displayTE(){
     System.out.println("Total Employee is : "+emp);
   }  
}
class TestMain{
     public static void main(String  args[]){
       Scanner sc=new Scanner(System.in);
       Employee e[]=new Employee[5];
       for(int i=0;i<5;i++){
         System.out.println("Enter "+(i+1)+" employee salary");
         int salary=sc.nextInt();
          e[i]=new Employee(salary);
       }
       for(int i=0;i<5;i++){         
          e[i].display();       
       }
       Employee.displayTE();
       Employee.displayTS();
   }
}
