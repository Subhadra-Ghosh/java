import java.util.Scanner;
class Test{
    public static boolean prime(int n){
       boolean flag=true;
       for(int  i=2;i<=n/2;i++){
          if(n%i==0){
            flag=false;
            break;  
          }
       }
       if(n>1 && flag)
          return true;
       else
          return false;   
    }
}
class TestMain_7a{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number for cheack prime");
         int n=sc.nextInt();
         Test obj=new Test();
         if(obj.prime(n))
            System.out.println("prime");
         else
            System.out.println("not prime");      
   }   
}
