/*
Q.11 K-th Element of Two Sorted Arrays.
*/

import java.util.Scanner;
public class Arry2_11{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of  sorted array1");
     int n1=sc.nextInt();
     int a[]=new int[n1];
     System.out.println("Enter size of  sorted array2");
     int n2=sc.nextInt();
     int b[]=new int[n2];
     System.out.println("enter data in array1");
     for(int i=0;i<n1;i++){
        a[i]=sc.nextInt();
     }
     System.out.println("enter data in array2");
     for(int i=0;i<n2;i++){
        b[i]=sc.nextInt();
     }
      int ab[]=new int[n1+n2];
        for(int i=0, j=0;i<n1+n2;i++){
           if(i<n1){
             ab[i]=a[i];
             }
           else{
              ab[i]=b[j];
              j++;  
        } }
        System.out.println("sorted array of merge two arrays");
        for(int i=0;i<n1+n2;i++){
          for(int j=i+1;j<n1+n2;j++){
            if(ab[i]>ab[j]){
             int temp=ab[i];
             ab[i]=ab[j];
             ab[j]=temp;
            }
          }
         System.out.print(" "+ab[i]);
        }  
       System.out.println();
       System.out.println("Enter k-th position ");
       int k=sc.nextInt();
       System.out.println("data in k-th position is : "+ab[k]);              
     }
      
  }





