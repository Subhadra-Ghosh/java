import java.util.Scanner;
public class MaxMinArrySir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0; i<n; i++) {
            arr[i]=sc.nextInt();
            }
        int max=0,min=arr[0];
        for (int i = 0; i<n; i++) {   
             if(max<arr[i]){
                max=arr[i];
              }
             if(arr[i]<min){
                min=arr[i]; 
                }        
        }
    }
}    
