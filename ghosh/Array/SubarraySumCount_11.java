
import java.util.Scanner;
public class SubarraySumCount_11{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in  array 😎️");
     for( int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }   
         int i,j,count=0;
         System.out.println("Enter sum of any elements in array: ");   
         int sum=sc.nextInt();
         for(i=0;i<arr.length;i++){
            for( j=i+1;j<arr.length ;j++){
              if(arr[i]+arr[j]==sum)
                 count++;
            }
         }
         System.out.println("total number of subarray to given sum is : "+count);         
  }
}
