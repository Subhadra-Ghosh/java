 /*Write a Java program to concatenate Two strings*/
import java.util.Scanner;
 class Test {
    public String concatenate(String s1,String s2){
       String s3=s1+s2;
       return s3;
    }
}
class TestMain{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first string ");
     String s1=sc.nextLine();
     System.out.println("Enter second string ");
     String s2=sc.nextLine();
      String s3=new Test().concatenate(s1, s2);
      System.out.println("concatenate string is  : "+s3);
  }  
}