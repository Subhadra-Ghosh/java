/*Q.5a Find the kth largest and kth smallest element in array.*/
import java.util.Scanner;
class Array{
    public int[] sort(int arr[]){
        System.out.println("sort   array is :");
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
          }
        System.out.println(arr[i]);
       }   
       return arr;
    }
    public int largestElement(int temp[],int k){
       int largest=temp[temp.length-k];
       return largest;
    }
    public int minimumElement(int temp[],int k){
       int minimum=temp[k-1];
       return minimum;
    }
}
class TestMain_Array5a{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int  arr[]={2,4,6,5,9,-1,-2,4,0,1};
         Array obj=new Array();
         Array obj2=new Array();
         int temp[]=obj.sort(arr);
         System.out.println("Enter k for k-th largest and smllest in array ");
         int k=sc.nextInt();
         int largest=obj.largestElement(temp,k);
         System.out.println(k+"-th largest in array is : "+largest);
         int minimum=obj2.minimumElement(temp,k);
         System.out.println(k+"-th minimum in array is : "+minimum);
   }   
}
