/*
Q.6 Find a missing number in an array.
*/

import java.util.Scanner;
public class Arry2_6{
  public static void main(String[]args){
     int sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in array");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     int total=(n*(n+1))/2;
     
     for( int i=0;i<=n-1 ;i++){
         sum=sum+a[i];
         
      }
     int missing=total-sum;
     System.out.println("Missing number is : "+missing);
  }
  




}
