import java.util.Scanner;
class Circle{
   private double radius,area;
   public Circle(double radius){
      this.radius=radius;
   }
   public void calculate(){
     area=3.14*radius*radius;
   }  
   public void display(){
     System.out.println("Area of circle is :  "+area);
   }
      
}
class TestMain{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of radius ");   
    Circle obj=new Circle(radius);
    obj.calculate();
    obj.display();
       
  }
}
