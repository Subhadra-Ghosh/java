/*8Q.6 Sort the array of 0s , 1s and 2s.*/
import java.util.Scanner;
class Array{
    public int[]  sort(int arr[]){
     for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]>arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;         
          }
        } 
     } 
     return arr;      
   }  
}
class TestMain_Array6{   
      public static void main(String[] args) {          
         int  arr[]={0,1,2,0,1,1,2,0,0,1};
         Scanner sc=new Scanner(System.in);
         Array obj=new Array();
         int temp[]=obj.sort(arr);
         System.out.println("Sorted array is : ");
         for(int i=0;i<temp.length;i++){
           System.out.println(temp[i]);
         }
   }   
}

