import java.util.Scanner;
 class Test{
    public static void prime(int n){
       int i;
       for( i=2;i<=n/2;i++){
          if(n%i==0){
            System.out.println("NOt prime");
            break;  
          }
       }
       if(n>1 && i>n/2)
          System.out.println("prime");
               
    }
}
 class TestMain_7{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number for write  fector");
         int n=sc.nextInt();
         Test obj=new Test();
         obj.prime(n);    
   }   
}
