import java.util.Scanner;
class factorial{
    public int fact(int n){
     int fact=1;
     for(int i=1;i<=n;i++){
        fact=fact*i;
     }
     return fact;
   }     
}
class TestMain{
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter  a number");
   int n=sc.nextInt();
   factorial obj=new factorial();
   int fact=obj.fact(n);
   System.out.println("factorial is  : "+fact);
 }
} 
