import java.util.Scanner;
public class DeleteDublicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0; i<n; i++) {
            arr[i]=sc.nextInt();
            }
        int p=0;
        System.out.println("after deleting  dublicate element array is :  ");
        for (int i = 0; i<n; i++) {   
            for(int j=i+1;j<n;j++){       
                if(arr[i]==arr[j]){
                  p=arr[i];                
                 } 
            }
            if(arr[i]==p)
                 continue;
            else
                System.out.println(arr[i]);
        }
    }
}

