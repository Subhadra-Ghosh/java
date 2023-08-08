/*
Q.8 Java Program to Increment All Element of an Array by One
*/

import java.util.Scanner;
public class Arry2_8{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in array");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     
     }
     System.out.println("After increment by one elements are ...");
     for(int i=0;i<n;i++){
      a[i]++;
      System.out.println(a[i]);
     
     }
      
  }




}
