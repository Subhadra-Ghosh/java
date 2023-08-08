import java.util.Scanner;
class Test{
   public void  asciiValue(int  c){ 
     if (c<0)
       System.out.println("number is negative");
     else
       System.out.println("number is positive");
   }
}
 class TestMain9{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     Test obj=new Test();
     obj.asciiValue(3);       
  }
}
