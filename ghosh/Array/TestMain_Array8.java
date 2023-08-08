/*Q.8
Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

Example 1:
Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5

Example 2:
Input : 
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1*/
import java.util.Scanner;
class Array{
    public int[] posNeg(int arr[]){
     int temp[]=new int[ arr.length];
     int k=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
          temp[k++]=arr[i];
        }
     }
     for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
          temp[k++]=arr[i];
        }
     }
     return temp;   
   }  
}
class TestMain_Array8{   
      public static void main(String[] args) {          
         int  arr[]={1,-1,3,2,-7,-5,11,6};
         Scanner sc=new Scanner(System.in);
         Array obj=new Array();
         int temp[]=obj.posNeg(arr);
         System.out.println("After arrange array is : "); 
         for(int i=0;i<temp.length;i++){
             System.out.print(" "+temp[i]); 
         }
         System.out.println();  
     }
   }   



