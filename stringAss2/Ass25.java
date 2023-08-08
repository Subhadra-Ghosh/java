import java.util.Scanner;
class Test{
    public void m1(String s1,String s2){
        
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        
        System.out.println("before swaping::");
        System.out.print(s1);
          System.out.println("\t"+s2);      

    }
 }
 class swap {
    public static void  main(String[]arg){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the string :");
        String s1=sc.nextLine();
         System.out.println("enter the second string :");
        String s2=sc.nextLine();
         System.out.println("After swaping :");
          System.out.print(s1);
           System.out.println("\t"+s2);
    
        Test obj=new Test();
        obj.m1(s1,s2);
    }
}