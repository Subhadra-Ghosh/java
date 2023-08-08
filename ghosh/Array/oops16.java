import java.util.Scanner;
class Person{
   private String name;
   private int age;
   public Person(){
    age=18;  
   }
   public Person(String name,int age){
     this.name=name;
     this.age=age;  
   }
   public void setName(String name){
     this.name=name;
   }
   public void setAge(int age){
     this.age=age;
   }
   public String getName(){
     return name;
   }
   public int getAge(){
     return age;
   }
   public void display(){
     System.out.println("Name : "+name);
     System.out.println("Age : "+age);
   }   
}
class TestMain{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your name");
      String name=sc.nextLine();
      System.out.println("Enter your age");
      int age=sc.nextInt();
      Person obj=new Person(name,age);
      Person obj1=new Person();
      obj.setName("Subhadra");
      obj.setAge(20);
      System.out.println(obj.getName());
      System.out.println(obj.getAge());
      obj.display();
      obj1.display();
  }


}
