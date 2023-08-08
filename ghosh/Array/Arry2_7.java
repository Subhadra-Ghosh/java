/*
Q.7 Wap to Insert an element at a specific position in an Array in Java.
*/

import java.util.Scanner;
public class Arry2_7{
  public static void main(String[]args){
     int sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter data in array");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     System.out.println("Enter specific position to insert element");
     int specific_position=sc.nextInt();
     System.out.println("Enter data to be insert");
     int d=sc.nextInt();
      a[specific_position]=d;
      System.out.println("after inserted new element array is ...");
      for(int i=0;i<n;i++){
        System.out.println(a[i]);
     }
     
  }

}
