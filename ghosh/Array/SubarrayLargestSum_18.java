import java.util.Scanner;
public class SubarrayLargestSum_18{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in   array");
     for( int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
      int max=Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
        int currentsum=arr[i];
        for(int j=i+1;j<n;j++){
               currentsum=currentsum+arr[j];
               System.out.println("sum is : "+currentsum); 
               if(max<currentsum)
                  max=currentsum;
            }      
        }
     System.out.println("max is : "+max); 
  }
}  
