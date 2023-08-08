import java.util.Scanner;
public class BinarySearch_29{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in Ascending oder in array");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int low=0,high=arr.length-1;
     System.out.println("enter a number to search in array ");
     int k=sc.nextInt();
     boolean flag=false;
     while(low<=high){
        int mid=(low+high)/2;
          if(arr[mid]==k){
             flag=true;
             break;
          }
          else if(k>mid) {
               low=mid+1; 
          }
          else if(k<mid){
               high=mid-1;
          }
     }
     if(flag)
        System.out.println("number "+k+" is found. ");
     else
        System.out.println("number "+k+" is not found. ");
   }
}
