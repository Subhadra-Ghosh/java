import java.util.Scanner;
class Test{
   public void age(int age){
        if(age>=18 && age<=100){
            System.out.println(" you are eligible for vote ");
        }
        else
            System.out.println(" you are not eligible for vote ");
     }
   }  
class TestMain5{   
      public static void main(String[] args) {          
         Scanner sc = new Scanner(System.in);
         System.out.println(" Enter your age : ");
         int age=sc.nextInt();
         Test obj=new Test();
         obj.age(age);
        }
}   

