import java.util.Scanner;
class Array{
    public int  peakElement(int n,int arr[]){
       if(arr[0]>arr[1])
            return 1;
       for(int i=1;i<n-1;i++){
          if( (arr[i] > arr[i-1]) && (arr[i] > arr[i+1]))
            return 1;
       } 
       if(arr[n-1]>arr[n-2])
            return  1;
       else
            return 0;
    }
}
class TestMain_Array1{   
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
         int x=obj.peakElement(n,arr);
         System.out.println("output :"+x);
   }   
}
