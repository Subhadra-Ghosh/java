/*
Q.15 Find Second largest element in an array.
*/
import java.util.Scanner;
public class Arry2_15{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in  array");
     for( int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     int max=0;
     for(int i=0;i<n;i++){
         if(max<a[i]){
            max=a[i];
              }
         } 
     int max2=0;
     for(int i=0;i<n;i++){
          if(a[i]<max && max2<a[i])
              max2=a[i];
      }
          if(max2>0) System.out.println("the second largest number  is : "+max2);
         
             else System.out.println("second largest number is not exit"); 
          
     } 
  }
