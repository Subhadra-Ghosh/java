import java.util.Scanner;
class Sphere{
    private double radius,volume;
    public Sphere(double radius){
      this.radius=radius;   
    }
    public void  volume(){
      volume=(4/3)*3.14*radius*radius*radius;
    } 
    public void display(){
      System.out.println("Volume is : "+volume);
    }
}     
class TestMain{
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter radius of sphere");
   double radius=sc.nextDouble();
   Sphere obj=new Sphere(radius);
   obj.volume();
   obj.display();
   }
 }
 
