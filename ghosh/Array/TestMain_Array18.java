/*Q.18) Find largest sum contigeous sub array
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

Example 1:
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:
Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)*/
import java.util.Scanner;
class Array{
   public int maxSubArraySum(int arr[]){ 
      int max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
         int currentsum=arr[i];
         for(int j=i+1;j<arr.length;j++){
             currentsum+=arr[j];
             if(max<currentsum)
                max=currentsum;
         }     
      }  
     return max;    
   }
}
public class TestMain_Array18{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     int arr[]={1,2,3,-2,5};
     Array obj=new Array();
     System.out.println("max subarray sum is : "+(obj.maxSubArraySum(arr)));
       
  }
}
