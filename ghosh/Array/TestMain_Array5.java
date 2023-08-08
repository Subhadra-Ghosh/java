/*Q.5 Find occurance of an integer number in array.*/
import java.util.Scanner;
class Array{
    public int  occurance(int arr[],int k){
     int count=0;
      for(int i=0;i<arr.length;i++){
           if(arr[i]==k){
             count++;
           }
        } 
         return count;    
     }  
   }
class TestMain_Array5{   
      public static void main(String[] args) {          
         int  arr[]={2,4,6,5,9,-1,-2,4,0,1};
         Scanner sc=new Scanner(System.in);
         Array obj=new Array();
         System.out.println("Enter the number for check occurance of that number ");
         int k=sc.nextInt();
         System.out.println("occurance of "+k+" is : "+(obj.occurance(arr,k)));
   }   
}

