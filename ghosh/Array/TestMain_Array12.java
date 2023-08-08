/*Q.12
Find common elements in three sorted arrays.
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?
Example 1:
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.*/
import java.util.Scanner;
 class Array{
   public void threeSortedArray(int arr1[],int arr2[], int arr3[]){   
          int temp[]=new int[arr1.length];
          int k=0;
          for(int i=0;i<arr1.length;i++){
              for(int j=0;j<arr2.length;j++){
                 if(arr1[i]==arr2[j])
                    temp[k++]=arr1[i];
              }
          }  
          for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr3.length;j++){
              if(temp[i]==arr3[j])
                System.out.print(temp[i]+" ");
            }
         } 
         System.out.println();    
   }
}
 public class TestMain_Array12{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     int arr1[]={1,5,10,20,40,80};
     int arr2[]={6,7,20,80,1001};
     int arr3[]={3,4,15,20,30,70,80,120};
     Array obj=new Array();
     obj.threeSortedArray(arr1,arr2,arr3);
       
  }
}
