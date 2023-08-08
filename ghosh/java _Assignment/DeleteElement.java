import java.util.Scanner;
public class DeleteElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0; i<n; i++) {
            arr[i]=sc.nextInt();
            }
        System.out.println("Enter array element to be deleted "); 
        int p=sc.nextInt();
        System.out.println("after deleting element array is :  ");
        for (int i = 0; i<n; i++) {          
           if(arr[i]==p)
             continue;
             System.out.println(arr[i]);
            }
        

        }

    }

