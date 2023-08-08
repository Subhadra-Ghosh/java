import java.util.Scanner;
public class SortRow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of array ");
        int r= sc.nextInt();
        System.out.println("Enter colon of array ");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter array elements ");
         for ( r = 0; r<arr.length; r++) {
            for(c=0;c<arr[r].length;c++){
               arr[r][c]=sc.nextInt();
            }
        }
        int temp=0;     
        for ( r = 0; r<arr.length; r++) {
            for(c=0;c<arr[r].length;c++){
                for(int k=c+1;k<arr[r].length;k++){
                if(arr[r][c]>arr[r][k])
                 temp=arr[r][c];
                 arr[r][c]=arr[r][k];
                 arr[r][k]=temp;               
                }
             System.out.print(arr[r][c]+" ");   
            }
         System.out.println();
        }
    }
 }
 
