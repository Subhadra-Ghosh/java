/*
Q.18 Write a program to print all the LEADERS in the array. An element is a
leader if it is greater than all the elements to its right side. And the rightmost
element is always a leader.
*/
import java.util.Scanner;
public class Arry2_18{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in  array");
     for( int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
         int i,j;
         System.out.println("Leader  element in array are : ");   
         for(i=0;i<arr.length;i++){
            for( j=i+1;j<arr.length ;j++){
               if(arr[i]<=arr[j])
                   break;
                 }
            if(j==arr.length)
              System.out.println(arr[i]);  
     } 
     
  }
}
