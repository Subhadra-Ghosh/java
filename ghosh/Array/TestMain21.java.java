import java.util.Scanner;
class Employee{
   private String name;
   private String address;
   private int year;
   public Employee(String name,int year,String address){
     this.name=name;
     this.address=address;
     this.year=year;    
   }
   public void display(){
       System.out.println(name+"\t\t"+year+"\t\t"+address);
   }
}
class TestMain{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      Employee e[]=new Employee[3];
      /*Employee e1=new Employee("Aashish",1994,"64c-wallestret");
      Employee e2=new Employee("sam",2000,"68d-wallestret");
      Employee e3=new Employee("john",1999,"26b-wallestret");*/
     for(int i=0;i<3;i++){
        System.out.println("Enter "+(i+1)+" Employee name");
        String name=sc.next();
        System.out.println("Enter "+(i+1)+" Employee  year of joining");
        int year=sc.nextInt();
        System.out.println("Enter "+(i+1)+" Employee address");
        String address=sc.next();
        e[i]=new Employee(name,year,address);
        }   
     for(int i=0;i<3;i++){ 
        e[i].display();
      } 
  }
}        
