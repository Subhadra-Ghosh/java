import java.util.Scanner;
public class RotedArray_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("before roted array by one ");
        System.out.println("Enter array elements ");
        for (int i = 0; i<n; i++) {
            arr[i]=sc.nextInt();
            }
            int p=arr[0];
            System.out.println("after roted array by one  ");
        for (int i = 0; i<n; i++) {          
           if(i<n-1){
             arr[i]=arr[i+1];
             System.out.println(arr[i]);
             }
          else{
             arr[n-1]=p;
             System.out.println(arr[n-1]);
            }
            }
       
        }

    }

