import java.util.Scanner;
public class K_thMaxMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0; i<n; i++) {
            arr[i]=sc.nextInt();
            }
        int j;
         System.out.println("sort");  
         for (int i = 0; i<n; i++) {   
           for( j=i+1;j<n;j++){
              if(arr[i]>arr[j]){
                  arr[i]=arr[i]+arr[j] ; 
                   arr[j]=arr[i]-arr[j] ; 
                  arr[i]=arr[i]-arr[j] ; 
           }
           }
          System.out.println(arr[i]);  
        }
        System.out.println("distinct ");  
        for (int i = 0; i<n; i++) {   
           for( j=0;j<i+1;j++){
              if(arr[i]==arr[j]){
                  break;    
           }}
           if(i==j)
               System.out.println(arr[i]);                                          
        }
         System.out.println("temp");  
        for (int i = 0; i<n; i++) {  
              System.out.println(temp[i]);    
                  }            
        System.out.println("Enter  k-th number for largest and minimum");  
        int k=sc.nextInt();
        int pos=0;                 
        for (int i = 0; i<k; i++) {
            pos = arr[n-1-i];
            } 
        System.out.println(k+"-th largest number in array is : "+pos);
        System.out.println(k+"-th minium number in array is : "+arr[k-1]);    
    }
}    
