import java.util.Scanner;
class Employee{
   private int empNo,salary,totalsalary;
   public Employee(int empNo[],int empsalary[]){
       this.empNo=empNo.length;
       for(int i=0;i<empsalary.length;i++){
          totalsalary+=empsalary[i];
       }
   } 
   public void display(){
     System.out.println("Total Salary is : "+totalsalary);
     System.out.println("Total number of employee  is : "+empNo);
   }
}
class TestMain{
     public static void main(String  args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the employee number");
       int number=sc.nextInt();
       int empNo[]=new int[number];
        empNo[0]=1; 
       for(int i=1;i<number;i++){
         empNo[i]++;
       }
       System.out.println("Enter the employees salary");
       int empsalary[]=new int[number]; 
       for(int i=0;i<number;i++){
           System.out.println("Enter "+(i+1)+" employee salary");
            empsalary[i]=sc.nextInt();
       }
       Employee obj=new Employee(empNo,empsalary);    
       obj.display();          
     }
}
