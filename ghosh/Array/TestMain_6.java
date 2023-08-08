import java.util.Scanner;
 class Test{
    public static void fector(int n){
       System.out.println("fector of "+n+ " is  :");e
       for(int i=1;i<=n/2;i++){
          if(n%i==0){
           System.out.println(i);
          }
       }        
    }
}
 class TestMain_6{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number for write  fector");
         int n=sc.nextInt();
         Test obj=new Test();
         obj.fector(n);    
   }   
}
