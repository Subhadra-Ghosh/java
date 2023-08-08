import java.util.Scanner;
class Test{
   public void  asciiValue(char c){ 
     int x = c;
     if( (c>=65 && c<=90 ) || (c>=97 && c<=122))
        System.out.println("ASCII value of "+c+" is :" +x);
   }
}
 class TestMain8{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     Test obj=new Test();
     obj.asciiValue('a');       
  }
}
