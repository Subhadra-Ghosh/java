/*
Q.9 Find a peak element which is not smaller than its neighbours.
*/

import java.util.Scanner;
public class Arry2_9{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in array");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     System.out.println("peak elements are...");
     if(a[0]>a[1] )
       System.out.println(a[0]);
     for(int i=1;i<n-1;i++){
     if(a[i]>a[i-1] && a[i]>a[i+1])
          System.out.println(a[i]);
     if(a[n-1]>a[n-2])
        System.out.println(a[n-1]);
     
     }
      
  }




}
