import java.util.Scanner;
 class Number{
    public static void fact(int n){
       System.out.println("factorial of "+n+ " is  :");
       int fact=1;
       for(int i=1;i<=n;i++){
          fact=fact*i;
       } 
       System.out.println(fact);     
    }
}
 class TestMain_5{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number for write  factorial");
         int n=sc.nextInt();
         Number  obj=new Number();
         obj.fact(n);    
   }   
}
