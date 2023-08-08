/*8Q.16
Rearrange the array in alternating positive and negative items
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with positive number.

Example 1:
Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Example 2:
Input: 
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0 */
import java.util.Scanner;
class Array{
    public int[]  alternatePosNeg(int arr[]){
        int p=0,s=1; 
        int temp[]=new int[arr.length];   
        for(int i=0;i<arr.length;i++){
              if(arr[i]>=0 && p<arr.length){
                  temp[p]=arr[i];
                  p=p+2;
              }
             else if(arr[i]<0 && s<arr.length){
                 temp[s]=arr[i];
                  s=s+2;
             }
       }
     return temp; 
    }  
}
class TestMain_Array16{   
      public static void main(String[] args) {          
         int  arr[]={-9,-5,2,4,5,-7,-12,2,3,4,5};
         Scanner sc=new Scanner(System.in);
         Array obj=new Array();
         int temp[]=obj.alternatePosNeg(arr);
         System.out.println("New  array");
         for(int i=0;i<temp.length;i++){
              System.out.println(temp[i]);
        }
        
   }   
}

