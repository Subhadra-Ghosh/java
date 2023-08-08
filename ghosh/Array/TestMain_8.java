import java.util.Scanner;
class Test{
    public static void prime(int n){
       int a=-1,b=1;
       System.out.println("series is ");
       for(int  i=1;i<=n;i++){
         int c=a+b;
          System.out.print(" "+c);
          a=b;
          b=c;
       }
       System.out.println();
    }
}
class TestMain_8{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number for fibonacci series ");
         int n=sc.nextInt();
         Test obj=new Test();
         obj.prime(n);
   }   
}
