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
         boolean test=true;
         int i,j,currentSum;
         System.out.println("Enter sum of any elements in array: ");   
         int sum=sc.nextInt();
         for(i=0;i<arr.length;i++){
            for( j=i+1,currentSum=arr[i];j<arr.length ;j++){
                   currentSum=currentSum+arr[j];
            if(currentSum==sum){
               System.out.println("Sum of elements between indices "+i+" and"+j+" is :");   
               test=false;
               break;
               }
            }
              }
          if(test==true) 
              System.out.println("No subarray found to that sum ");   
  }
}
