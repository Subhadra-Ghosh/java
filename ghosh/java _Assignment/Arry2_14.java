/*
Q.14 Find Subarray with given sum | Set 1 (Non-negative Numbers).
*/
import java.util.Scanner;
public class Arry2_14{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in  array 😎️");
     for( int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
         int i,j;
         System.out.println("Enter sum of any elements in array: ");   
         int sum=sc.nextInt();
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
