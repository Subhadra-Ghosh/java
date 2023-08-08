/*
Q.5 Write a Java program to test two arrays' equality
*/


import java.util.Scanner;
public class Arry2_5{
   public static void main( String[]args){
      int c=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of array1");
      int n=sc.nextInt();
      int a[]=new int[n];
      
      int b[]=new int[n];
      System.out.println("Enter data in array1");
      for(int i=0;i<n;i++){
      // System.out.println("Enter data in array1");
         a[i]=sc.nextInt();
         }
       System.out.println("Enter data in array2");  
      for(int i=0;i<n;i++){   
      // System.out.println("Enter data in array2");
         b[i]=sc.nextInt();
      }
      for( int i=0;i<n;i++){
      if(a[i]==b[i])
      c++;
       }
     if(c==n)  
        System.out.println("Array are equal");
      else
        System.out.println("Array  Not equal");
   }
}
