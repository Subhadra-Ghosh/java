import java.util.Scanner;
public class MaxMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0; i<n; i++) {
            arr[i]=sc.nextInt();
            }
        int max1=0,min1=arr[0],max2=0,min2=arr[0];
        for (int i = 0; i<n; i++) {   
             if(max1<arr[i]){
                max1=arr[i];
              }
             if(arr[i]<min1){
                min1=arr[i]; 
                }        
        }
        System.out.println("first largest number is :" +max1);
        System.out.println("first minimum number is :" +min1 );
       
        for (int i=0; i<n; i++) {   
             if((arr[i]<max1) && (max2 < arr[i]))
                max2=arr[i];
             if((min1 < arr[i]) && (arr[i] < min2))
                min2=arr[i];   
                }       
        System.out.println("second largest number is :" +max2 );
        System.out.println("second minimum number is :" +min2 );
    }
}
