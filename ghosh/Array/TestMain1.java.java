
import java.util.Scanner;
class Test{
    public void grossSalary(int basic,int gra){
      double HRA=(basic*20)/100;
      double DA=(basic*50)/100;
      double PF=(basic*11)/100;
      switch(gra)
      {
      case 'A':
          int allow=1700;
          double grosssalary=basic+HRA+DA+allow-PF;
          System.out.println("grosssalary : "+grosssalary);
          break;
      case 'B':
          allow=1500;
           grosssalary=basic+HRA+DA+allow-PF;
          System.out.println("grosssalary : "+grosssalary);
          break;
       case 'C':
           allow=1300;
           grosssalary=basic+HRA+DA+allow-PF;
          System.out.println("grosssalary : "+grosssalary);
          break;
       default :
          System.out.println("INvaild grade");
      }

    }  
}
class TestMain1{   
      public static void main(String[] args) {          
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your basic salary");
         int basic=sc.nextInt();
         System.out.println("Enter your grade");
         char gra=sc.next().charAt(0);
         Test obj=new Test();
         obj.grossSalary(basic,gra);
        }
        
   }   

