/*
Q.16 Rearrange array such that even positioned are greater than odd
Given an array A of n elements, sort the array according to the following
relations :
 , if i is even, ∀ 1 <= i < n
 , if i is odd , ∀ 1 <= i < n
Print the resultant array.
Examples :
Input : A[] = {1, 2, 2, 1}
Output : 1 2 1 2
*/
import java.util.Scanner;
public class Arry2_16{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in  array");
     for( int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
     }
         int i,j,copy,temp;
         System.out.println(" first sort the array is : ");   
         for(i=0;i<arr.length;i++){
            for( j=i+1;j<arr.length ;j++){
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                 }
                 }
              System.out.println(" "+arr[i]);  
         } 
       for(i=0,j=0,copy=n-1;i<arr.length;i++){
          if(i%2!=0){
             System.out.println(arr[copy]); 
             copy--;
             }
          else{
              System.out.println(arr[j]); 
              j++;
          }
       }   
  }
}
