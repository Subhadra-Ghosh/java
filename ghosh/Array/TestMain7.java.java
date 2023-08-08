import java.util.Scanner;
class Test{
   public int  reverse(int n){ 
      int rev=0,rem=0;
      while(n!=0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;     
      }
      return rev;
   }
}
 class TestMain7{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     Test obj=new Test();
     int reverse=obj.reverse(123);
     System.out.println("Reverse number is : "+reverse);
       
  }
}
