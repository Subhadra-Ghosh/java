/*
Q.10 Check for Majority Element in a sorted array.
*/

import java.util.Scanner;
public class Arry2_10{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in array");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
    
        System.out.println("Enter a number to be cheacked for majority");
        int m=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
           if(a[i]==m)
              c++;
        }
        if(c>n/2)
           System.out.println("Majority element in array is : "+m);
        else
            System.out.println(m+" is not a majority element");
                     
     }
      
  }





