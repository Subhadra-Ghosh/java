import java.util.Scanner;
public class K_thArrySir5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0; i<n; i++) {
            arr[i]=sc.nextInt();
            }
        for (int i = 0; i<n; i++) {   
           for(int j=i+1;j<n;j++){
              if(arr[i]==arr[j]){
                  break;    
           }
           if(i==j)
               System.out.println(arr[i]);
           }           
        }
         for (int i = 0; i<n; i++) {   
           for(int j=i+1;j<n;j++){
              if(arr[i]>arr[j]){
                  arr[i]=arr[i]+arr[j] ; 
                  arr[j]=arr[i]-arr[j] ; 
                  arr[i]=arr[i]-arr[j] ; 
           }
           }
          System.out.println(arr[i]);  
        }
        System.out.println("Enter  k-th number for largest ");  
        int k=sc.nextInt();
        int pos=0;                 
        for (int i = 1; i<=k; i++) {
            pos = arr[n-i];
            } 
          System.out.println(k+"-th largest number in array is : ");  
    }
}    
