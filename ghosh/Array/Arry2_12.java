/*
Q.12 Find the number of zeroes.
*/

import java.util.Scanner;
public class Arry2_12{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in array");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     int c=0;
     for(int i=0;i<n;i++){
        if(a[i]==0)
          c++;
        }
     System.out.println("number of zeros in array  is : "+c);
     }
      
  }





