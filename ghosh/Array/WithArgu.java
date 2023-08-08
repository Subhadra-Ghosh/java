/* user defiend  constructor-with argument constructor    */
import java.util.*;
public class WithArgu{
  WithArgu(int a,int b){
    System.out.println("sum of consturtor passes values is : "+(a+b));
  }
 void m1(int c){
   System.out.println(c);
}
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    WithArgu obj=new WithArgu(12,56);
    System.out.println("Enter argument  value for method");
    int n=sc.nextInt();
    obj.m1(n);
 }
}


