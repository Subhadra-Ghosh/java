/*
Q.4 Write a program to sort the array.
*/
import java.util.Scanner;
class Array{
    public void  sorting(int n,int arr[]){
        System.out.println("sort   array is :");
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
         }
        System.out.println(arr[i]);
       }
    }
}
class TestMain_Array4{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array ");
         int n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter data in array ");
         for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
         }
         Array obj=new Array();
         obj.sorting(n,arr);   
   }   
}
