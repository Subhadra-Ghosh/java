/*Q.2 Find minimum and maximum element in array.*/
import java.util.Scanner;
class Array{
    public int  maximum(int n,int arr[]){
      int max=0;
      for(int i=0;i<n;i++){
        if(arr[i]>max)
           max=arr[i];
      }
       return max; 
    }
    public int  minimum(int n,int arr[]){
      int min=arr[0];
      for(int i=0;i<n;i++){
        if(arr[i]<min)
           min=arr[i];
      }
       return min; 
    }
}
class TestMain_Array2{   
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
         int x=obj.maximum(n,arr);
         System.out.println("Maximum number is :"+x);  
         int y=obj.minimum(n,arr);
         System.out.println("Minimum number is :"+y);  
   }   
}
