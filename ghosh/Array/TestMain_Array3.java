/*Q.3 Write a program to reverse the array.*/
import java.util.Scanner;
class Array{
    public void  arrayReverse(int n,int arr[]){
        System.out.println("Reverse  array is :");
        for(int i=0;i<n;i++){
          System.out.println(arr[arr.length-1-i]);
        }
    }
}
class TestMain_Array3{   
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
         obj.arrayReverse(n,arr);
         
        
   }   
}
